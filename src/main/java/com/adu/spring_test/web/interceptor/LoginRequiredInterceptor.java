package com.adu.spring_test.web.interceptor;

import java.lang.annotation.Annotation;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.adu.spring_test.web.model.UserContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.AnnotationUtils;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.adu.spring_test.web.model.LoginRequired;

/**
 * 登陆拦截器
 *
 * @author yunjie.du
 * @date 2015年12月14日 下午3:41:08
 */
public class LoginRequiredInterceptor extends HandlerInterceptorAdapter {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
            throws Exception {
        if (handler instanceof HandlerMethod) {
            HandlerMethod handlerMethod = (HandlerMethod) handler;
            LoginRequired annotation = AnnotationUtils.findAnnotation(handlerMethod.getBean().getClass(),
                    LoginRequired.class);// 类级注解
            if (annotation == null) {
                annotation = AnnotationUtils.findAnnotation(handlerMethod.getMethod(), LoginRequired.class);// 方法级注解
            }

            if (annotation != null && UserContext.getUserInfo() == null) {// 需要登陆但未登陆
                String srcUrl = request.getRequestURI();
                logger.info("[REQUIRE-login]srcUrl={}", srcUrl);
                response.sendRedirect("/login/login?srcUrl=" + srcUrl);
                return false;
            }
        }
        return true;
    }
}

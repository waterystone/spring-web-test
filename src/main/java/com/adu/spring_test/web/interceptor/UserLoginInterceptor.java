package com.adu.spring_test.web.interceptor;

import java.lang.annotation.Annotation;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.adu.spring_test.web.model.LoginRequired;

/**
 * 登陆拦截器
 * 
 * @author yunjie.du
 * @date 2015年12月14日 下午3:41:08
 */
public class UserLoginInterceptor extends HandlerInterceptorAdapter {
	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		HandlerMethod handlerMethod = (HandlerMethod) handler;
		Annotation annotation = handlerMethod.getBean().getClass().getAnnotation(LoginRequired.class);// 类级注解
		if (annotation == null) {
			annotation = handlerMethod.getMethodAnnotation(LoginRequired.class);// 方法级注解
		}

		if (annotation != null && request.getSession().getAttribute("_USER_INFO_LOGIN_NAME_") == null) {// 判断session里的标记状态
			String srcUrl = request.getRequestURI();
			logger.info("[REQUIRE-login]srcUrl={}", srcUrl);
			response.sendRedirect("/login?srcUrl=" + srcUrl);
		}
		return true;
	}
}

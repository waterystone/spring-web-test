package com.adu.spring_test.web.exception;

import java.io.IOException;
import java.lang.reflect.Method;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.AnnotationUtils;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.server.ServletServerHttpResponse;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.method.annotation.ExceptionHandlerExceptionResolver;

import com.adu.spring_test.web.model.ApiResult;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;

public class ApiResultExceptionResolver extends ExceptionHandlerExceptionResolver {

    private static final Logger LOGGER = LoggerFactory.getLogger(ApiResultExceptionResolver.class);

    private final HttpMessageConverter jsonHttpMessageConverter = new FastJsonHttpMessageConverter();

    private final ModelAndView EMPTY = new ModelAndView();

    @Override
    protected ModelAndView doResolveHandlerMethodException(HttpServletRequest request, HttpServletResponse response,
            HandlerMethod handlerMethod, Exception e) {
        if (handlerMethod == null) {
            return null;
        }

        Method method = handlerMethod.getMethod();

        if (method == null) {
            return null;
        }

        ResponseBody respBody = AnnotationUtils.findAnnotation(method, ResponseBody.class);
        if (respBody == null) {
            return new ModelAndView("error.html");
        }

        ApiResult apiResult = new ApiResult();
        apiResult.setStatus(-1);
        LOGGER.error("ApiResult_Exception uri={}", request.getRequestURI(), e);

        try {
            jsonHttpMessageConverter.write(apiResult, MediaType.APPLICATION_JSON,
                    new ServletServerHttpResponse(response));
        } catch (IOException e1) {
            LOGGER.error("ApiResult_write_Exception uri={}", request.getRequestURI(), e);
        }

        return EMPTY;
    }

    @Override
    public int getOrder() {
        return Ordered.HIGHEST_PRECEDENCE;
    }

}

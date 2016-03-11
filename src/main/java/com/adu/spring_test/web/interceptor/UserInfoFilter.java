package com.adu.spring_test.web.interceptor;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.adu.spring_test.web.constants.CookieKeyConstant;
import com.adu.spring_test.web.model.UserContext;
import com.adu.spring_test.web.model.UserInfo;
import com.adu.spring_test.web.utils.RequestUtil;

public class UserInfoFilter implements Filter {
	private FilterConfig filterConfig;
	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		logger.info("op=servlet_init_start,filterConfig={}", filterConfig);
		this.filterConfig = filterConfig;
		printFilterConfig();

	}

	private void printFilterConfig() {
		Enumeration enumeration = this.filterConfig.getInitParameterNames();
		int n = 1;
		while (enumeration.hasMoreElements()) {
			String key = (String) enumeration.nextElement();
			String value = this.filterConfig.getInitParameter(key);
			logger.info("[filterConfig-{}]{}={}", n++, key, value);
		}

	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		logger.info("op=servlet_doFilter_start");
		try {
			UserInfo userInfo = getUserInfoFromCookie(request);
			UserContext.setUserInfo(userInfo);

			chain.doFilter(request, response);
		} finally {
			UserContext.clear();
		}
		logger.info("op=servlet_doFilter_end");

	}

	private UserInfo getUserInfoFromCookie(ServletRequest request) {
		UserInfo res = null;

		HttpServletRequest httpServletRequest = (HttpServletRequest) request;
		Cookie uc = RequestUtil.getCookie(httpServletRequest, CookieKeyConstant.USER_NAME);

		if (uc != null) {
			String userName = uc.getValue();
			res = new UserInfo(userName);
		}
		return res;
	}

	@Override
	public void destroy() {
		logger.info("op=servlet_destroy_start");

	}

}

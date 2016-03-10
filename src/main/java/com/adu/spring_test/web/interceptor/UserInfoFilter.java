package com.adu.spring_test.web.interceptor;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.adu.spring_test.web.model.UserContext;
import com.adu.spring_test.web.model.UserInfo;

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
			UserInfo userInfo = getUserInfo(request);
			UserContext.setUserInfo(userInfo);

			chain.doFilter(request, response);
		} finally {
			UserContext.clear();
		}
		logger.info("op=servlet_doFilter_end");

	}

	private UserInfo getUserInfo(ServletRequest request) {
		UserInfo res = null;
		HttpSession httpSession = ((HttpServletRequest) request).getSession();
		String name = (String) httpSession.getAttribute("_USER_INFO_LOGIN_NAME_");
		if (name != null) {
			res = new UserInfo(name);
		}
		return res;
	}

	@Override
	public void destroy() {
		logger.info("op=servlet_destroy_start");

	}

}

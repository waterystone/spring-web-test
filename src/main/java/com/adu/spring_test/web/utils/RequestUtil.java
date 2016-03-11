package com.adu.spring_test.web.utils;

import javax.servlet.ServletContext;
import javax.servlet.ServletRequest;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.StringUtils;

public final class RequestUtil {

	private RequestUtil() {
	}

	public static String getPathInfo(HttpServletRequest request) {
		if (request == null) {
			return null;
		}

		return request.getRequestURI().substring(request.getContextPath().length());
	}

	/**
	 * 获取Servlet上下文
	 * 
	 * @param request
	 *            请求信息
	 * @return ServletContext。参数request为null时返回null。
	 */
	public static ServletContext getServletContext(HttpServletRequest request) {
		if (request == null) {
			return null;
		}
		// 取得ServletContext
		return request.getSession(true).getServletContext();
	}

	public static HttpServletRequest getHttpServletRequest(ServletRequest servletRequest) {
		if (servletRequest == null) {
			return null;
		}
		return (HttpServletRequest) servletRequest;
	}

	public static String getUserIp(HttpServletRequest request) {
		String ip = request.getHeader("x-real-ip");

		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			ip = request.getHeader("x-forwarded-for");
		}

		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			ip = request.getRemoteAddr();
		}

		int pos = ip.indexOf(',');
		if (pos >= 0) {
			ip = ip.substring(0, pos);
		}
		return ip;
	}

	public static String getUserAgent(HttpServletRequest request) {
		return request.getHeader("User-Agent");
	}

	public static String getReferer(HttpServletRequest request) {
		return request.getHeader("Referer");
	}

	public static Cookie getCookie(HttpServletRequest request, String key) {
		Cookie[] cookies = request.getCookies();
		if (StringUtils.isEmpty(key) || cookies == null) {
			return null;
		}
		for (Cookie cookie : cookies) {
			if (key.equals(cookie.getName())) {
				return cookie;
			}
		}
		return null;
	}
}

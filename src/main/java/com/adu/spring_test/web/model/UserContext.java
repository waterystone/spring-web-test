package com.adu.spring_test.web.model;

public class UserContext {
	private static final ThreadLocal<UserInfo> userInfoLocal = new ThreadLocal<UserInfo>();

	public static UserInfo getUserInfo() {
		return userInfoLocal.get();
	}

	public static void setUserInfo(UserInfo userInfo) {
		userInfoLocal.set(userInfo);
	}

	public static void clear() {
		userInfoLocal.remove();

	}

}

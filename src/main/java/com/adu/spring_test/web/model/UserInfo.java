package com.adu.spring_test.web.model;

/**
 * 登陆后cookie中的用户信息
 * 
 * @author yunjie.du
 * @date 2016年3月10日 下午6:37:32
 */
public class UserInfo {
	private String name;

	public UserInfo() {
		super();
	}

	public UserInfo(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "UserInfo [name=" + name + "]";
	}

}

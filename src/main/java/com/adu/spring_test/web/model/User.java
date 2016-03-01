package com.adu.spring_test.web.model;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

public class User {
	@NotEmpty(message = "名称不能为空")
	private String name;
	@Length(min = 6, max = 15, message = "密码长度必须在[6,15]之间")
	private String password;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", password=" + password + "]";
	}

}

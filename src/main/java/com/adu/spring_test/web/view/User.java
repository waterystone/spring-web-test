package com.adu.spring_test.web.view;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.NotNull;

public class User {
    @NotEmpty(message = "名称不能为空")
    private String name;
    @NotEmpty
    @Length(min = 6, max = 15, message = "密码长度必须在[6,15]之间")
    private String password;
    @NotNull
    @Email(regexp = ".*@.*")
    private String email;

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User [name=" + name + ", password=" + password + "]";
    }

}

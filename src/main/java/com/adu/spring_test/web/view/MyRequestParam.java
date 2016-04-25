package com.adu.spring_test.web.view;

import com.adu.spring_test.web.model.Stringfy;

import java.util.List;

/**
 * @author yunjie.du
 * @date 2016/4/25 14:21
 */
public class MyRequestParam extends Stringfy {
    private String type;
    List<User> users;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }
}

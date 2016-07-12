package com.adu.spring_test.web.service;

import com.adu.spring_test.web.model.UserInfo;

/**
 * @author yunjie.du
 * @date 2016/6/29 15:36
 */
public interface UserInfoService {

    public UserInfo getUserInfoByAccount(String account);

    public int addUser(UserInfo userInfo);
}

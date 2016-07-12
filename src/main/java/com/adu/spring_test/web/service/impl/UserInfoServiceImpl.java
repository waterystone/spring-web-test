package com.adu.spring_test.web.service.impl;

import com.adu.spring_test.web.model.UserInfo;
import com.adu.spring_test.web.service.UserInfoService;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.Objects;

/**
 * @author yunjie.du
 * @date 2016/6/29 15:38
 */
@Service
public class UserInfoServiceImpl implements UserInfoService {


    private Logger logger = LoggerFactory.getLogger(this.getClass());


    @Override
    public UserInfo getUserInfoByAccount(String account) {
        UserInfo res = null;

        if (StringUtils.isEmpty(account)) {
            logger.error("[ERROR-getUserInfoByAccount-NULL-account]");
            return res;
        }

        res = new UserInfo(account);
        return res;
    }

    @Override
    public int addUser(UserInfo userInfo) {
        if (Objects.isNull(userInfo)) {
            logger.error("[ERROR-addUser-NULL-userInfo]");
            return 0;
        }
        return 1;
    }


}

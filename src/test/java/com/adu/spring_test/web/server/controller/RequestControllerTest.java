package com.adu.spring_test.web.server.controller;

import java.util.Map;

import org.junit.Test;

import com.adu.spring_test.web.server.WebBaseTest;
import com.adu.spring_test.web.utils.JsonUtil;
import com.adu.spring_test.web.view.User;
import com.google.common.collect.Maps;

/**
 * @author yunjie.du
 * @date 2016/6/27 14:33
 */
public class RequestControllerTest extends WebBaseTest {

    @Test
    public void testMyRequestParam() throws Exception {
        Map<String, String> parameters = Maps.newHashMap();
        parameters.put("type", "a.5");
        parameters.put("number", "5");
        parameters.put("progress", "22.37%");
        parameters.put("date", "2027-01-03 16:27:52");
        parameters.put("users[0].name", "adu");
        parameters.put("users[0].password", "123456");
        parameters.put("users[0].email", "adu@qq.com");

        String res = httpGet("/requestParam/testMyRequestParam", parameters);

        logger.info("res={}", res);
    }

    @Test
    public void testArray() throws Exception {
        Map<String, String> parameters = Maps.newHashMap();
        parameters.put("array", "adu,abc,test");

        String res = httpGet("/requestParam/testArray", parameters);

        logger.info("res={}", res);
    }

    @Test
    public void testList() throws Exception {
        Map<String, String> parameters = Maps.newHashMap();
        parameters.put("list", "adu,abc,test");

        String res = httpGet("/requestParam/testList", parameters);

        logger.info("res={}", res);
    }

    @Test
    public void testJson2() throws Exception {
        User user = new User();
        user.setName("adu");
        user.setPassword("123456");
        user.setEmail("a@qq.com");

        Map<String, String> parameters = Maps.newHashMap();
        parameters.put("user", JsonUtil.toString(user));

        String res = httpGet("/requestParam/testJson2", parameters);

        logger.info("res={}", res);
    }
}

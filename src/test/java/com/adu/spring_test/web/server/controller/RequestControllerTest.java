package com.adu.spring_test.web.server.controller;

import java.util.Map;

import org.junit.Test;

import com.adu.spring_test.web.server.WebBaseTest;
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
}

package com.adu.spring_test.web.server.controller;

import java.util.Map;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;

import com.adu.spring_test.web.server.WebBaseTest;
import com.google.common.base.Joiner;
import com.google.common.collect.Maps;

/**
 * @author yunjie.du
 * @date 2016/6/27 14:33
 */
public class RequestControllerTest extends WebBaseTest {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Test
    public void testMyRequestParam() throws Exception {
        Map<String, String> paramters = Maps.newHashMap();
        paramters.put("type", "a.5");
        paramters.put("number", "5");
        paramters.put("progress", "22.37%");
        paramters.put("date", "2027-01-03 16:27:52");
        paramters.put("users[0].name", "adu");
        paramters.put("users[0].password", "123456");
        paramters.put("users[0].email", "adu@qq.com");
        MvcResult res = mockMvc
                .perform(MockMvcRequestBuilders.get("/requestParam/testMyRequestParam?"
                        + Joiner.on("&").withKeyValueSeparator("=").join(paramters)))
                .andDo(MockMvcResultHandlers.print()).andReturn();

        logger.info("res={}", res.getResponse().getContentAsString());
    }
}

package com.adu.spring_test.web.server.controller;

import com.adu.spring_test.web.server.WebBaseTest;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;

/**
 * @author yunjie.du
 * @date 2016/6/27 14:33
 */
public class ApiControllerTest extends WebBaseTest {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Test
    public void hello() throws Exception {
        ResultActions res = mockMvc.perform(MockMvcRequestBuilders.get("/api/hello")).andDo(MockMvcResultHandlers.print());
        logger.info("res={}", res);
    }
}

package com.adu.spring_test.web.server.controller;

import org.junit.Test;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;

import com.adu.spring_test.web.server.WebBaseTest;

/**
 * @author yunjie.du
 * @date 2016/6/27 14:33
 */
public class ExceptionControllerTest extends WebBaseTest {

    @Test
    public void indexOutOfBoundsException() throws Exception {
        MvcResult res = mockMvc.perform(MockMvcRequestBuilders.get("/exception/IndexOutOfBoundsException"))
                .andDo(MockMvcResultHandlers.print()).andReturn();
        logger.info("res={}", res.getResponse().getContentAsString());
    }
}

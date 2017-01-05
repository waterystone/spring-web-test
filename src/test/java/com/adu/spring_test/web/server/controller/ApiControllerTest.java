package com.adu.spring_test.web.server.controller;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.adu.spring_test.web.server.WebBaseTest;

/**
 * @author yunjie.du
 * @date 2016/6/27 14:33
 */
public class ApiControllerTest extends WebBaseTest {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Test
    public void hello() throws Exception {
        String res = httpGet("/api/hello");
        logger.info("res={}", res);
    }
}

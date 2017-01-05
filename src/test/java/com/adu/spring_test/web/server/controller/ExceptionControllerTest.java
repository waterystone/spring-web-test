package com.adu.spring_test.web.server.controller;

import org.junit.Test;

import com.adu.spring_test.web.server.WebBaseTest;

/**
 * @author yunjie.du
 * @date 2016/6/27 14:33
 */
public class ExceptionControllerTest extends WebBaseTest {

    @Test
    public void nullPointerException() throws Exception {
        String res = httpGet("/exception/nullPointerException");
        logger.info("res={}", res);
    }

    @Test
    public void indexOutOfBoundsException() throws Exception {
        String res = httpGet("/exception/indexOutOfBoundsException");
        logger.info("res={}", res);
    }
}

package com.adu.spring_test.web.server.service;

import javax.annotation.Resource;

import org.junit.Test;

import com.adu.spring_test.web.server.AppBaseTest;
import com.adu.spring_test.web.service.impl.ApplicationContextAwareImpl;

/**
 * @author yunjie.du
 * @date 2017/3/28 18:47
 */
public class ApplicationContextAwareTest extends AppBaseTest {
    @Resource
    private ApplicationContextAwareImpl applicationContextAwareImpl;

    @Test
    public void test() {
        logger.info("applicationContextAware={}", applicationContextAwareImpl.getApplicationContext());
    }
}

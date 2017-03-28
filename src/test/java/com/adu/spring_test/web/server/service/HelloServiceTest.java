package com.adu.spring_test.web.server.service;

import com.adu.spring_test.web.server.AppBaseTest;
import com.adu.spring_test.web.service.HelloService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class HelloServiceTest extends AppBaseTest {
    @Autowired
    private HelloService hello2ServiceImpl;

    @Test
    public void hello() {
        String res = hello2ServiceImpl.hello();
        logger.debug("res={}", res);
    }

}

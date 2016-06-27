package com.adu.spring_test.web.server.service;

import com.adu.spring_test.web.server.BaseTest;
import com.adu.spring_test.web.service.HelloService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class HelloServiceTest extends BaseTest {
    @Autowired
    private HelloService helloService;

    @Test
    public void hello() {
        String res = helloService.hello();
        logger.debug("res={}", res);
    }

}

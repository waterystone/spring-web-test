package com.adu.spring_test.web.service.impl;

import com.adu.spring_test.web.annotation.MonitorTime;
import com.adu.spring_test.web.service.HelloService;
import org.springframework.stereotype.Service;

@Service
public class HelloServiceImpl implements HelloService {

    @Override
    @MonitorTime
    public String hello() {
        return "Hello,World!";
    }

    @Override
    @MonitorTime
    public int add(int a, int b) {
        return a + b/0;
    }

}

package com.adu.spring_test.web.server.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.adu.spring_test.web.service.HelloService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:applicationContext.xml" })
public class HelloServiceTest {
	@Autowired
	private HelloService helloService;
	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	@Test
	public void hello() {
		String res = helloService.hello();
		logger.debug("res={}", res);
	}

}

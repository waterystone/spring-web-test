package com.adu.spring_test.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.adu.spring_test.web.interceptor.HostHolder;

/**
 * 首页
 * 
 * @author yunjie.du
 * @date 2015年11月26日 下午3:12:02
 */
@Controller
public class IndexController {
	@Autowired
	private HostHolder hostHolder;
	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	@RequestMapping("")
	public String index() {
		String currentUser = hostHolder.currentUser();
		logger.debug("index.currentUser={}", currentUser);
		return "index";
	}

}

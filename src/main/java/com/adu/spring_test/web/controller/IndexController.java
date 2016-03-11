package com.adu.spring_test.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.adu.spring_test.web.model.UserContext;
import com.adu.spring_test.web.model.UserInfo;

/**
 * 首页
 * 
 * @author yunjie.du
 * @date 2015年11月26日 下午3:12:02
 */
@Controller
public class IndexController {
	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	@RequestMapping("")
	public String index(Model model) {
		UserInfo currentUser = UserContext.getUserInfo();
		logger.info("index.currentUser={}", currentUser);
		model.addAttribute("currentUser", currentUser);
		return "index";
	}

}

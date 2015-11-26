package com.adu.spring_test.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.adu.spring_test.web.model.User;

/**
 * 登陆
 * 
 * @author yunjie.du
 * @date 2015年11月26日 下午2:55:38
 */
@Controller
@RequestMapping("/login")
public class LoginController {

	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	@RequestMapping("login")
	public String login() {
		return "login/login";
	}

	/**
	 * @param user form表单的组件名要与User的属性名一致！
	 * @return
	 */
	@RequestMapping(value = "commit", method = RequestMethod.POST)
	public ModelAndView commit(User user) {
		logger.info("op=login_start,user={}", user);

		ModelAndView mav = new ModelAndView();
		mav.addObject("user", user);
		mav.setViewName("login/success");

		return mav;
	}

}

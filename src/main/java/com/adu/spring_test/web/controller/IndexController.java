package com.adu.spring_test.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 首页
 * 
 * @author yunjie.du
 * @date 2015年11月26日 下午3:12:02
 */
@Controller
public class IndexController {

	@RequestMapping("")
	public String index() {
		return "index";
	}

}

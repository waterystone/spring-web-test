package com.adu.spring_test.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.adu.spring_test.web.model.ApiResult;
import com.adu.spring_test.web.service.HelloService;

/**
 * Hello Test
 * 
 * @author yunjie.du
 * @date 2015年11月17日 下午5:09:54
 */
@Controller
@RequestMapping("/test")
public class HelloController {
	@Autowired
	private HelloService helloService;

	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	/**
	 * hello
	 * 
	 * @return
	 */
	@RequestMapping(value = "/hello", produces = { "application/json", "text/javascript;charset=UTF-8" })
	@ResponseBody
	public ApiResult<String> hello() {
		String res = helloService.hello();

		// 封装结果
		ApiResult<String> result = ApiResult.buildSuccessDataApiResult(res);

		logger.info("op=hello_end,result={}", result);
		return result;
	}

}

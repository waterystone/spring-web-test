package com.adu.spring_test.web.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

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

	/**
	 * 进入登陆页
	 * 
	 * @param model
	 * @param request
	 * @param response
	 * @param srcUrl
	 *            原始URL。有可能是被拦截器拦截后跳转过来的，它会带上srcUrl参数。
	 * @return
	 * @throws IOException
	 */
	@RequestMapping(value = "", method = RequestMethod.GET)
	public String login(Model model, HttpServletRequest request, HttpServletResponse response,
			@RequestParam(value = "srcUrl", required = false) String srcUrl) throws IOException {
		logger.info("op=login_start,srcUrl={}", srcUrl);

		model.addAttribute("srcUrl", srcUrl);// 带到登陆页
		return "login/login";

	}

	/**
	 * 登陆页提交
	 * 
	 * @param model
	 * @param request
	 * @param response
	 * @param user
	 *            form表单的组件名要与User的属性名一致！
	 * @param srcUrl
	 *            登陆前的原始URL
	 * @return
	 * @throws IOException
	 */
	@RequestMapping(value = "commit", method = RequestMethod.POST)
	public String commit(Model model, HttpServletRequest request, HttpServletResponse response, @Valid User user,
			@RequestParam(value = "srcUrl", required = false, defaultValue = "/") String srcUrl) throws IOException {
		logger.info("op=commit_start,user={},srcUrl={}", user, srcUrl);

		if (user.getName().length() <= 6) {// 简单判断
			request.getSession().setAttribute("_USER_INFO_LOGIN_NAME_", user.getName());// 用户名加入session，标记登陆状态
			return "redirect:" + srcUrl;
		}

		logger.error("[ERROR-commit]user={}", user);
		model.addAttribute("srcUrl", srcUrl);
		model.addAttribute("error", "用户名错误，不能大于6位!");
		return "login/login";

	}

	/**
	 * 注销
	 * 
	 * @param model
	 * @param request
	 * @param response
	 * @return
	 * @throws IOException
	 */
	@RequestMapping(value = "logout", method = RequestMethod.GET)
	public String logout(Model model, HttpServletRequest request, HttpServletResponse response) throws IOException {
		logger.info("op=logout_start,userName={}", request.getSession().getAttribute("_USER_INFO_LOGIN_NAME_"));

		request.getSession().invalidate();
		return "redirect:/";

	}

}

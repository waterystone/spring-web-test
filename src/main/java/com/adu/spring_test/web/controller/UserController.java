package com.adu.spring_test.web.controller;

import com.adu.spring_test.web.constants.CookieKeyConstant;
import com.adu.spring_test.web.model.ApiResult;
import com.adu.spring_test.web.model.UserContext;
import com.adu.spring_test.web.model.UserInfo;
import com.adu.spring_test.web.utils.JsonUtil;
import com.adu.spring_test.web.utils.ResponseUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 登陆
 *
 * @author yunjie.du
 * @date 2015年11月26日 下午2:55:38
 */
@Controller
@RequestMapping("/user")
public class UserController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @RequestMapping(value = "/login", method = RequestMethod.POST, produces = {"application/json", "text/javascript;charset=UTF-8"})
    @ResponseBody
    public ApiResult login(HttpServletRequest request, HttpServletResponse response, @RequestParam(value = "account") String account,
                           @RequestParam(value = "password") String password) throws IOException {
        logger.info("login_start,account={},password={}", account, password);


        if (password.length() < 6) {
            return ApiResult.buildFailedDataApiResult("密码长度不能小于6，请重试！");
        }

        UserInfo userInfo = new UserInfo(account);


        ResponseUtil.addCookie(response, CookieKeyConstant.USER_INFO, JsonUtil.toString(userInfo), CookieKeyConstant.USER_INFO_SECONDS);// 用户信息加入Cookie，标记登陆状态
        return ApiResult.SUCCESS;
    }

    /**
     * 注销
     *
     * @param request
     * @param response
     * @return
     * @throws IOException
     */
    @RequestMapping(value = "/logout")
    public String logout(HttpServletRequest request, HttpServletResponse response) throws IOException {
        logger.info("op=logout_start,userInfo={}", UserContext.getUserInfo());
        ResponseUtil.deleteCookie(response, CookieKeyConstant.USER_INFO);

        request.getSession().invalidate();
        return "redirect:/";

    }

    @RequestMapping(value = "/getCurrentUser", produces = {"application/json", "text/javascript;charset=UTF-8"})
    @ResponseBody
    public ApiResult<UserInfo> getCurrentUser() {
        logger.info("getCurrentUser_start");

        UserInfo userInfo = UserContext.getUserInfo();
        return ApiResult.buildSuccessDataApiResult(userInfo);
    }

}

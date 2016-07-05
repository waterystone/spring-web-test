package com.adu.spring_test.web.controller;

import com.adu.spring_test.web.constants.CookieKeyConstant;
import com.adu.spring_test.web.model.ApiResult;
import com.adu.spring_test.web.model.UserContext;
import com.adu.spring_test.web.model.UserInfo;
import com.adu.spring_test.web.utils.JsonUtil;
import com.adu.spring_test.web.utils.RequestUtil;
import com.adu.spring_test.web.utils.ResponseUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

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

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    @ResponseBody
    public ModelAndView login(Model model, HttpServletRequest request, HttpServletResponse response, @RequestParam(value = "srcUrl", required = false) String srcUrl) throws IOException {
        logger.info("login_start,uri={},srcUrl={}", request.getRequestURI(), srcUrl);

        if (RequestUtil.getCookie(request, CookieKeyConstant.USER_INFO) != null) {//如果已登陆
            response.sendRedirect(srcUrl == null ? "/" : srcUrl);
            return null;
        }

        model.addAttribute("srcUrl", srcUrl);
        return new ModelAndView("/user/login");

    }

    @RequestMapping(value = "/commit", method = RequestMethod.POST, produces = {"application/json", "text/javascript;charset=UTF-8"})
    @ResponseBody
    public ApiResult commit(HttpServletRequest request, HttpServletResponse response, @RequestParam(value = "account") String account,
                            @RequestParam(value = "password") String password,
                            @RequestParam(value = "isRemember", required = false) Boolean isRemember) throws IOException {
        logger.info("commit_start,account={},password={},isRemember={}", account, password, isRemember);


        if (password.length() < 6) {
            return ApiResult.buildFailedDataApiResult("密码长度不能小于6，请重试！");
        }

        UserInfo userInfo = new UserInfo(account);


        int cookieSeconds = 3600;
        if (Boolean.TRUE.equals(isRemember)) {
            cookieSeconds = CookieKeyConstant.USER_INFO_SECONDS;
        }
        ResponseUtil.addCookie(response, CookieKeyConstant.USER_INFO, JsonUtil.toString(userInfo), cookieSeconds);// 用户信息加入Cookie，标记登陆状态
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
    @RequestMapping(value = "/logout", produces = {"application/json", "text/javascript;charset=UTF-8"})
    @ResponseBody
    public ApiResult logout(HttpServletRequest request, HttpServletResponse response) throws IOException {
        logger.info("op=logout_start,userInfo={}", UserContext.getUserInfo());
        ResponseUtil.deleteCookie(response, CookieKeyConstant.USER_INFO);

        request.getSession().invalidate();
        return ApiResult.SUCCESS;

    }

    @RequestMapping(value = "/getCurrentUser", produces = {"application/json", "text/javascript;charset=UTF-8"})
    @ResponseBody
    public ApiResult<UserInfo> getCurrentUser() {
        logger.info("getCurrentUser_start");

        UserInfo userInfo = UserContext.getUserInfo();
        return ApiResult.buildSuccessDataApiResult(userInfo);
    }

}

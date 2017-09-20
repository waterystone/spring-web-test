package com.adu.spring_test.web.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.adu.spring_test.web.model.ApiResult;
import com.adu.spring_test.web.annotation.LoginRequired;
import com.adu.spring_test.web.service.HelloService;

/**
 * Hello Test
 *
 * @author yunjie.du
 * @date 2015年11月17日 下午5:09:54
 */
@Controller
@RequestMapping("/api")
@LoginRequired
public class ApiController {
    @Autowired
    private HelloService helloService;

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    /**
     * hello
     *
     * @return
     */
    @RequestMapping(value = "/hello")
    @ResponseBody
    public ApiResult<String> hello() {
        String res = helloService.hello();

        logger.info("op=hello_end,res={}", res);
        return ApiResult.buildSuccessDataApiResult(res);
    }

    @RequestMapping(value = "/{userId}", method = RequestMethod.GET)
    @ResponseBody
    public ApiResult<String> showDetail(@PathVariable("userId") int userId, @RequestParam("name") String name,
                                        @RequestParam(value = "age", required = false, defaultValue = "20") int age,
                                        @CookieValue(value = "JSESSIONID") String sessionId, @RequestHeader("User-Agent") String userAgent) {
        logger.info("op=showUserId_start,userId={},name={},age={},sessionId={},userAgent={}", userId, name, age,
                sessionId, userAgent);
        return ApiResult.buildSuccessDataApiResult("userId=" + userId + ",name=" + name + ",age=" + age);
    }

    @RequestMapping("/showCookie")
    @ResponseBody
    public ApiResult<String> showCookie(@CookieValue(value = "JSESSIONID") String sessionId,
                                        @CookieValue(value = "myCookieId", required = false) String myCookieId) {
        logger.info("op=showCookie_start,sessionId={},myCookieId={}", sessionId, myCookieId);
        return ApiResult.buildSuccessDataApiResult("sessionId=" + sessionId + ",myCookieId=" + myCookieId);
    }

    @RequestMapping(value = "/showServlet", produces = {"application/json", "text/javascript;charset=UTF-8"})
    @ResponseBody
    public ApiResult<Map<String, String>> showServlet(HttpServletRequest request) {
        logger.info("op=showServlet_start,request={}", request);
        Map<String, String> res = new HashMap<String, String>();

        // 客户机信息
        res.put("requestURI", request.getRequestURI());
        res.put("queryString", request.getQueryString());
        res.put("remoteAddr", request.getRemoteAddr());
        res.put("localAddr", request.getLocalAddr());
        ApiResult<Map<String, String>> result = ApiResult.buildSuccessDataApiResult(res);
        return result;
    }

    @RequestMapping("/showModel")
    @ResponseBody
    public ApiResult<Model> showModel(Model model) {
        logger.info("op=showModel_start,model={}", model);
        model.addAttribute("name", "adu");
        return ApiResult.buildSuccessDataApiResult(model);
    }

}

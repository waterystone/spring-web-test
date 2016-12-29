package com.adu.spring_test.web.controller;

import com.adu.spring_test.web.model.ApiResult;
import com.adu.spring_test.web.view.Admin;
import com.adu.spring_test.web.view.MyRequestParam;
import com.adu.spring_test.web.view.User;
import com.google.common.base.Joiner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

/**
 * RequestParam相关的Controller的测试
 *
 * @author yunjie.du
 * @date 2016/4/25 14:17
 */
@Controller
@RequestMapping("/requestParam")
public class RequestController {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    //http://localhost:8077/requestParam/testMyRequestParam?type=ta&users[0].name=adu&users[1].name=tang
    @RequestMapping(value = "testMyRequestParam", method = RequestMethod.GET)
    @ResponseBody
    public ApiResult<MyRequestParam> testMyRequestParam(MyRequestParam myRequestParam) {
        logger.info("op=testMyRequestParam_start,myRequestParam={}", myRequestParam);
        return ApiResult.buildSuccessDataApiResult(myRequestParam);
    }

    @RequestMapping(value = "testPathVariable/{userId}", method = RequestMethod.GET)
    @ResponseBody
    public ApiResult<String> testPathVariable(@PathVariable("userId") String userId) {
        logger.info("op=testPathVariable_start,userId={}", userId);
        return ApiResult.buildSuccessDataApiResult(userId);
    }

    @RequestMapping(value = "testArray", method = RequestMethod.GET)
    @ResponseBody
    public ApiResult<String[]> testArray(@RequestParam("names") String[] names) {
        logger.info("op=testArray_start,names={}", Joiner.on(",").join(names));
        return ApiResult.buildSuccessDataApiResult(names);
    }

    //curl -d '{"name":"adu","password":"123456"}' -X POST -H 'Content-Type:application/json' http://localhost:8087/requestParam/testJson
    @RequestMapping(value = "testJson")
    @ResponseBody
    public ApiResult<User> testJson(@RequestBody User user) {
        logger.info("op=testJson_start,user={}", user);
        return ApiResult.buildSuccessDataApiResult(user);
    }

    //curl -d '<?xml version="1.0" encoding="UTF-8" ?><admin><name>adu</name><age>23</age></admin>' -X POST -H 'Content-Type:application/xml' http://localhost:8087/requestParam/testXML
    @RequestMapping(value = "testXML")
    @ResponseBody
    public ApiResult<Admin> testXML(@RequestBody Admin admin) {
        logger.info("op=testXML_start,admin={}", admin);
        return ApiResult.buildSuccessDataApiResult(admin);
    }
}

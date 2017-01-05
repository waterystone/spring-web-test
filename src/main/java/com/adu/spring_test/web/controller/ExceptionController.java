package com.adu.spring_test.web.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.adu.spring_test.web.model.ApiResult;
import com.google.common.collect.Lists;

/**
 * @author yunjie.du
 * @date 2017/1/5 10:32
 */
@Controller
@RequestMapping("/exception")
public class ExceptionController {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @RequestMapping(value = "nullPointerException")
    @ResponseBody
    public ApiResult<String> nullPointerException() {
        String str=null;
        String res=str.toString();
        return ApiResult.buildSuccessDataApiResult(res);
    }

    @RequestMapping(value = "indexOutOfBoundsException")
    @ResponseBody
    public ApiResult<List<String>> indexOutOfBoundsException() {
        List<String> list = Lists.newArrayList();
        List<String> subList = list.subList(0, 10);
        return ApiResult.buildSuccessDataApiResult(subList);
    }
}

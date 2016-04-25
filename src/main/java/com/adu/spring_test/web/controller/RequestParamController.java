package com.adu.spring_test.web.controller;

import com.adu.spring_test.web.model.ApiResult;
import com.adu.spring_test.web.view.MyRequestParam;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.io.IOException;

/**
 * RequestParam相关的Controller的测试
 *
 * @author yunjie.du
 * @date 2016/4/25 14:17
 */
@Controller
@RequestMapping("/requestParam")
public class RequestParamController {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @RequestMapping(value = "", method = RequestMethod.GET)
    public ApiResult<MyRequestParam> test(MyRequestParam myRequestParam) throws IOException {
        logger.info("op=test_start,myRequestParam={}", myRequestParam);
        return ApiResult.buildSuccessDataApiResult(myRequestParam);

    }
}

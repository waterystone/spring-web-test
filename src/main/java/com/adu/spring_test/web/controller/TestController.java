package com.adu.spring_test.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.io.IOException;

/**
 * @author yunjie.du
 * @date 2016/7/1 14:23
 */
@Controller
@RequestMapping("test")
public class TestController {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @RequestMapping("/jquery/{file}")
    @ResponseBody
    public ModelAndView jqueryTest(@PathVariable(value = "file") String file) throws IOException {
        logger.info("jqueryTest_start,file={}", file);

        return new ModelAndView("jquery_test/" + file);
    }

    @RequestMapping("/bootstrap/{file}")
    @ResponseBody
    public ModelAndView bootstrapTest(@PathVariable(value = "file") String file) throws IOException {
        logger.info("bootstrapTest_start,file={}", file);

        return new ModelAndView("bootstrap_test/" + file);
    }
}

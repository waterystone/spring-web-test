package com.adu.spring_test.web.controller;

import com.adu.spring_test.web.model.LoginRequired;
import com.adu.spring_test.web.model.Person;
import com.adu.spring_test.web.utils.ExcelUtils;
import org.apache.commons.codec.Charsets;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author yunjie.du
 * @date 2016/4/8 20:13
 */
@Controller
@RequestMapping("/export")
@LoginRequired
public class ExportController {
    private final String templateFilePath = this.getClass().getClassLoader().getResource("template.xls").getPath();
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @RequestMapping(value = "/excel")
    @ResponseBody
    public void export(HttpServletRequest request, HttpServletResponse response) {
        Map<String, Object> data = this.getData();
        OutputStream outputStream = getOutputStream(response, "测试.xls");
        ExcelUtils.exportExcel(data, templateFilePath, outputStream);
    }

    private Map<String, Object> getData() {
        Map<String, Object> res = new HashMap<String, Object>();
        List<Person> personList = new ArrayList<Person>();
        for (int i = 1; i <= 100; i++) {
            personList.add(new Person("测试" + i, i));
        }
        res.put("personList", personList);
        return res;
    }

    private OutputStream getOutputStream(HttpServletResponse response, String fileName) {
        try {
            response.setContentType("application/x-msdownload");
            response.addHeader("Content-Disposition", "attachment;filename=" + URLEncoder.encode(fileName, Charsets.UTF_8.name()));//文件名要编码， 不然乱码
            return response.getOutputStream();
        } catch (IOException e) {
        }
        return null;
    }
}

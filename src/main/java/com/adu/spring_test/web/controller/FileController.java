package com.adu.spring_test.web.controller;

import com.adu.spring_test.web.model.ApiResult;
import org.apache.commons.lang3.time.DateFormatUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Date;
import java.util.Iterator;

/**
 * @author yunjie.du
 * @date 2016/7/12 14:47
 */
@Controller
@RequestMapping("file")
public class FileController {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @RequestMapping("/upload")
    @ResponseBody
    public ApiResult upload(HttpServletRequest request, HttpServletResponse response) throws IllegalStateException, IOException, URISyntaxException {
        //创建一个通用的多部分解析器
        CommonsMultipartResolver multipartResolver = new CommonsMultipartResolver(request.getSession().getServletContext());
        //判断 request 是否有文件上传,即多部分请求
        if (multipartResolver.isMultipart(request)) {
            //转换成多部分request
            MultipartHttpServletRequest multiRequest = (MultipartHttpServletRequest) request;
            //取得request中的所有文件名
            Iterator<String> iter = multiRequest.getFileNames();
            while (iter.hasNext()) {
                //取得上传文件
                MultipartFile file = multiRequest.getFile(iter.next());
                if (file != null) {
                    //取得当前上传文件的文件名称
                    String myFileName = file.getOriginalFilename();
                    //如果名称不为“”,说明该文件存在，否则说明该文件不存在
                    if (myFileName.trim() != "") {
                        //重命名上传后的文件名
                        String fileName = DateFormatUtils.format(new Date(), "yyyy-MM-dd") + "_" + file.getOriginalFilename();
                        //定义上传路径
                        String path = "d:/files/" + fileName;
                        File localFile = new File(path);
                        file.transferTo(localFile);
                        logger.info("[upload]originalFileName={},newPath={}", file.getOriginalFilename(), path);
                    }
                }
            }

        }
        return ApiResult.SUCCESS;
    }
}

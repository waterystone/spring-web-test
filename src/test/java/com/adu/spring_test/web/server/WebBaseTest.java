package com.adu.spring_test.web.server;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.Cookie;

import org.apache.commons.collections.CollectionUtils;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.ContextHierarchy;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.adu.spring_test.web.model.Stringfy;
import com.google.common.base.Joiner;
import com.google.common.collect.Lists;

/**
 * 测试服务基类
 */
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextHierarchy({ @ContextConfiguration(name = "parent", locations = "classpath:applicationContext.xml"),
        @ContextConfiguration(name = "child", locations = "file:src/main/webapp/WEB-INF/springmvc-servlet.xml") })
public abstract class WebBaseTest {
    @Resource
    protected WebApplicationContext wac;

    protected MockMvc mockMvc;

    protected final Logger logger = LoggerFactory.getLogger(this.getClass());

    protected String httpGet(String requestURI) throws Exception {
        return httpGet(requestURI, null);
    }

    protected String httpGet(String requestURI, Map<String, String> parameters) throws Exception {
        return httpGet(requestURI, parameters, null);
    }

    protected String httpGet(String requestURI, Map<String, String> parameters, RequestParam requestParam)
            throws Exception {
        String query = parameters == null ? "" : "?" + Joiner.on("&").withKeyValueSeparator("=").join(parameters);
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get(requestURI + query);
        attachRequestParam(requestBuilder, requestParam);

        MvcResult mvcResult = mockMvc.perform(requestBuilder).andDo(MockMvcResultHandlers.print()).andReturn();
        return mvcResult.getResponse().getContentAsString();
    }

    private void attachRequestParam(MockHttpServletRequestBuilder requestBuilder, RequestParam requestParam) {
        if (requestParam == null) {
            return;
        }

        if (requestParam.getContentType() != null) {
            requestBuilder.contentType(requestParam.getContentType());
        }

        if (requestParam.getAccept() != null) {
            requestBuilder.accept(requestParam.getAccept());
        }

        if (CollectionUtils.isNotEmpty(requestParam.getCookies())) {
            for (Cookie cookie : requestParam.getCookies()) {
                requestBuilder.cookie(cookie);
            }
        }
    }

    @Before
    public void before() {
        mockMvc = MockMvcBuilders.webAppContextSetup(wac).build();
    }

    public static class RequestParam extends Stringfy {
        private MediaType contentType;
        private MediaType accept;
        private List<Cookie> cookies;

        public MediaType getContentType() {
            return contentType;
        }

        public void setContentType(MediaType contentType) {
            this.contentType = contentType;
        }

        public MediaType getAccept() {
            return accept;
        }

        public void setAccept(MediaType accept) {
            this.accept = accept;
        }

        public List<Cookie> getCookies() {
            return cookies;
        }

        public void setCookies(List<Cookie> cookies) {
            this.cookies = cookies;
        }

        public void addCookie(Cookie cookie) {
            if (this.cookies == null) {
                this.cookies = Lists.newArrayList();
            }
            this.cookies.add(cookie);
        }
    }

}

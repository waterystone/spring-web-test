package com.adu.spring_test.web.server;

import java.util.Map;

import javax.annotation.Resource;

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

import com.google.common.base.Joiner;

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
        return httpGet(requestURI, parameters, null, null);
    }

    protected String httpGet(String requestURI, Map<String, String> parameters, MediaType contentType, MediaType accept)
            throws Exception {
        String query = parameters == null ? "" : "?" + Joiner.on("&").withKeyValueSeparator("=").join(parameters);
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get(requestURI + query);
        if (contentType != null) {
            requestBuilder.contentType(contentType);
        }
        if (accept != null) {
            requestBuilder.accept(accept);
        }

        MvcResult mvcResult = mockMvc.perform(requestBuilder).andDo(MockMvcResultHandlers.print()).andReturn();
        return mvcResult.getResponse().getContentAsString();
    }

    @Before
    public void before() {
        mockMvc = MockMvcBuilders.webAppContextSetup(wac).build();
    }

}

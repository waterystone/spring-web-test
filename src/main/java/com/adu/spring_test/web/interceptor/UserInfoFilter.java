package com.adu.spring_test.web.interceptor;

import com.adu.spring_test.web.constants.CookieKeyConstant;
import com.adu.spring_test.web.model.UserContext;
import com.adu.spring_test.web.model.UserInfo;
import com.adu.spring_test.web.utils.RequestUtil;
import com.adu.spring_test.web.utils.ResponseUtil;
import com.google.common.base.Splitter;
import com.google.common.collect.Lists;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.*;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.net.URLEncoder;
import java.util.Enumeration;
import java.util.List;

public class UserInfoFilter implements Filter {
    private FilterConfig filterConfig;
    private List<String> excludeUrls = Lists.newArrayList();//不拦截的URL
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        logger.info("op=servlet_init_start,filterConfig={}", filterConfig);
        this.filterConfig = filterConfig;
        printFilterConfig();

    }

    private void printFilterConfig() {
        Enumeration enumeration = this.filterConfig.getInitParameterNames();
        int n = 1;
        while (enumeration.hasMoreElements()) {
            String key = (String) enumeration.nextElement();
            String value = this.filterConfig.getInitParameter(key);
            logger.info("[filterConfig-{}]{}={}", n++, key, value);
            if (StringUtils.equals(key, "excludeUrls") && StringUtils.isNotEmpty(value)) {
                this.excludeUrls = Splitter.on(",").splitToList(value);
            }
        }

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
        HttpServletRequest httpServletRequest = RequestUtil.getHttpServletRequest(request);
        logger.info("op=servlet_doFilter_start,uri={},queryString={}", httpServletRequest.getRequestURI(), httpServletRequest.getQueryString());

        if (this.excludeUrls.contains(httpServletRequest.getRequestURI())) {
            chain.doFilter(request, response);
            return;
        }

        String srcUrl = getSrcUrl(httpServletRequest);

        try {
            UserInfo userInfo = getUserInfoFromCookie(request);
            if (userInfo == null) {
                ResponseUtil.getHttpServletResponse(response).sendRedirect("/user/login?srcUrl=" + URLEncoder.encode(srcUrl, "UTF-8"));
                return;
            }

            UserContext.setUserInfo(userInfo);
            chain.doFilter(request, response);
        } finally {
            UserContext.clear();
        }

    }

    @Override
    public void destroy() {
        logger.info("op=servlet_destroy_start");

    }

    private String getSrcUrl(HttpServletRequest httpServletRequest) {
        String srcUrl = httpServletRequest.getRequestURI();
        String queryString = httpServletRequest.getQueryString();
        if (StringUtils.isNotEmpty(queryString)) {
            srcUrl += "?" + queryString;
        }
        return srcUrl;
    }

    private UserInfo getUserInfoFromCookie(ServletRequest request) {
        UserInfo res = null;

        HttpServletRequest httpServletRequest = (HttpServletRequest) request;
        Cookie userCookie = RequestUtil.getCookie(httpServletRequest, CookieKeyConstant.USER_ACCOUNT);

        if (userCookie != null) {
            res = new UserInfo(userCookie.getValue());
        }

        return res;
    }


}

package com.adu.spring_test.web.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.Method;

/**
 * @author yunjie.du
 * @date 2017/9/20 下午3:20
 */
public class MonitorTimeAop {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    public Object monitor(ProceedingJoinPoint joinPoint) throws Throwable {
        Throwable t = null;
        long time = 0;
        Object res = null;

        try {
            long start = System.currentTimeMillis();
            res = joinPoint.proceed();
            time = System.currentTimeMillis() - start;
        } catch (Throwable throwable) {
            t = throwable;
        }

        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        Method method = methodSignature.getMethod();

        if (t != null) {
            logger.error("[ERROR_MONITOR_EXCEPTION]method={},args={}", method.getName(), joinPoint.getArgs(), t);
            throw t;
        }

        logger.info("op=end_monitor_{},args={},time={}ms", method.getName(), joinPoint.getArgs(), time);
        return res;

    }
}

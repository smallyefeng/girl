package com.imooc.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * Created by yefeng on 17/3/30.
 * Time: 下午9:27
 */
@Aspect
@Component
public class HttpAspect {

    private Logger logger = LoggerFactory.getLogger(HttpAspect.class);

    @Pointcut("execution(public * com.imooc.controller.GirlController.girlList(..))")
    public void log() {
    }

    @Before("log()")
    public void doBefore() {
        logger.info("111111");
    }

    @After("log()")
    public void doAfter() {
        logger.info("2222222");
    }
}

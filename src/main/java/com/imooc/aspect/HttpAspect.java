package com.imooc.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * Created by yefeng on 17/3/30.
 * Time: 下午9:27
 */
@Aspect
@Component
public class HttpAspect {

    @Pointcut("execution(public * com.imooc.controller.GirlController.girlList(..))")
    public void log() {
    }

    @Before("log()")
    public void doBefore() {
        System.out.println(111111111);
    }

    @After("log()")
    public void doAfter() {
        System.out.println(2222222);
    }
}

package com.study.java.advice;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

// AOP 函数
@Component
@Aspect
@Order(5)
public class LogAdvice {
    @Before("execution(* com..controller.*.*(..))")
    // 前置方法
    public void before(JoinPoint point){
        String className = point.getTarget().getClass().getSimpleName();
        String methodName = point.getSignature().getName();
        System.out.println(className+":"+methodName+" 开始执行了！");
    }
}

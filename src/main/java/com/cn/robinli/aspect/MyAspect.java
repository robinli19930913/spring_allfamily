package com.cn.robinli.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * Created by robin.Li on 2020/1/13.
 * aop -> Around -> Before -> method -> Around -> After -> AfterThrowing
 */
@Component
@Aspect
public class MyAspect {
//    @Pointcut(value = "execution(public * com.cn.robinli.mybatis.MybatisService.*(..))")
//    public void pc(){
//        System.out.println("1111111");
//    }

    //@Before(value = "pc()")

    /**
     * JoinPoint 之增强不拦截
     * @param joinPoint
     * @return
     */
    @Before(value = "execution(public * com.cn.robinli.mybatis.MybatisService.*(..))")
    public String b(JoinPoint joinPoint){
        System.out.println(joinPoint.getArgs()[0].toString());
        System.out.println(joinPoint.getSignature().getName());
        if(joinPoint.getArgs()[0] instanceof String){
            String str = joinPoint.getArgs()[0].toString();
            if("qwe".equals(str)){
                System.out.println("22222");
                return "aaaaaaaaaaaa";
            }
        }
        System.out.println("------------------");
        return "0000000000000000000";
    }

    /**
     * ProceedingJoinPoint 既可以增强也会拦截方法
     * @param proceedingJoinPoint
     */
    @Around(value = "execution(public * com.cn.robinli.mybatis.MybatisService.*(..))")
    public Object a(ProceedingJoinPoint proceedingJoinPoint){
        System.out.println(proceedingJoinPoint.getSignature().getName());
        System.out.println("bbbbbbbbbbbbbbbbbbbbbbbbbbbbb");
        try {
            return proceedingJoinPoint.proceed();//方法继续执行
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        System.out.println("9999999999999");
        return null;
    }
}

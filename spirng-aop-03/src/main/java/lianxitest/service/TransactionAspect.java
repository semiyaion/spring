package lianxitest.service;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class TransactionAspect {
    @Around("execution(* lianxitest.service..*(..))")
    public void arround(ProceedingJoinPoint joinPoint){
        try {
            //前环绕
            System.out.println("提交事务");
            joinPoint.proceed();
            //后环绕
            System.out.println("事务提交完毕");

        } catch (Throwable e) {
            System.out.println("回滚事务");
            e.printStackTrace();
        }
    }
}

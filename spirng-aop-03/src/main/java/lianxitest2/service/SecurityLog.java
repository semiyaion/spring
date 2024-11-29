package lianxitest2.service;

import org.aopalliance.intercept.Joinpoint;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;
@Component
@Aspect
public class SecurityLog {
    @Pointcut("execution(* lianxitest2.service.UserService.save*(..))")
    public void svaepoint(){}
    @Pointcut("execution(* lianxitest2.service.UserService.del*(..))")
    public void delpoint(){}
    @Pointcut("execution(* lianxitest2.service.UserService.mod*(..))")
    public void modpoint(){}
    @Pointcut("execution(* lianxitest2.service.UserService.get*(..))")
    public void getpoint(){}
    @Before("svaepoint()||delpoint()||modpoint()||getpoint()")
    public void beforeAdvice(JoinPoint joinPoint){
        //系统时间
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = new Date();
        String format = sdf.format(date);
        System.out.println("当前时间"+format+"张三"+joinPoint.getSignature().getDeclaringTypeName()+"."+joinPoint.getSignature().getName());

    }
}

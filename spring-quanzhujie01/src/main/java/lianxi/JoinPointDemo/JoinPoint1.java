package lianxi.JoinPointDemo;

import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
public class JoinPoint1 {
@Pointcut("execution(* lianxi.controller.Stucontroller.*(..))")
    public void set(){

    }
}

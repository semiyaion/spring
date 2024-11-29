package lianxi.joinpoint01;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class JoinService {
    @Before(value = "lianxi.JoinPointDemo.JoinPoint1.set()")
    public void add(){
        System.out.println("数据库开始扫描");
    }
    @After(value = "lianxi.JoinPointDemo.JoinPoint1.set()")
    public void end(){
        System.out.println("数据库结束");
    }
}

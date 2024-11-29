package aoptest.joint;

import org.aopalliance.intercept.Joinpoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Joint1 {
    @Before(value = "aoptest.joincollect.Collection.location()")
    public void add(){
        System.out.println("数据库开始操作");
    }
    @After(value ="aoptest.joincollect.Collection.location()")
    public void end(){
        System.out.println("验证成功，欢迎回来");
    }
}

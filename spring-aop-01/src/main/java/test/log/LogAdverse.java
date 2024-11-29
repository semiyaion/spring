package test.log;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.junit.jupiter.api.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect

public class LogAdverse {
    //1.定义方法存储增强代码
    //具体几个方法要根据插入的位置决定
    //2.使用注解配置指定插入目标方法的位置
    /*
     * 前置    before
     * 后置    afterReturning
     * 异常    AfterThrowing
     * 最后    After
     * 环绕    Around
     *
     * try{
     * 前置
     * 目标方法执行
     * 后置
     *
     * }catch（）{
     * 异常
     * }finally{
     * 最后
     *         * }
     * */
    //3.配置切点表达式【选入插入方法】
    //4.加入ioc容器
    //加入配置切面@Aspect
    //5.开启aspect注解的支持
    @Before(value = "test.mypointcut.Pointcuttest.set()")
    public void start(){
        System.out.println("前置通知");
    }

    @After(value = "test.mypointcut.Pointcuttest.set()")
    public void end(JoinPoint joinPoint){
        String name = joinPoint.getSignature().getName();
        System.out.println("后置通知");
    }

    @AfterThrowing(value = "test.mypointcut.Pointcuttest.set()")
    public void error(){
        System.out.println("方法报错了");
    }
}

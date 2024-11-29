package test.log;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

//@Aspect
//@Component
public class MyAdvice {
    /*定义四个增强方法，获取目标方法的信息，返回值，异常对象*/
    /*
    * 1.定义方法-增强代码
    * 2.使用注解指定对应位置
    * 3.切面和ioc的配置
    * 4.开启aspect注解的支持
    *
    *
    * 要获取增强方法中获取目标方法信息
    * 1.全部增强方法中，获取目标方法信息（方法，参数，访问修饰符等）
    * JoinPoint joinPoint就包含目标方法的信息
    * 2.返回结果@afterreturning
    * 3.异常信息@afterThrowing
    *
    * */
    @Before("test.mypointcut.Pointcuttest.set()")
    public void before(JoinPoint joinPoint){
       // 获取目标方法信息（方法，参数，访问修饰符等）
        //获取类的信息
        String simpleName = joinPoint.getTarget().getClass().getSimpleName();
        //获取方法名
        String name = joinPoint.getSignature().getName();
        //获取参数列表
        Object[] args = joinPoint.getArgs();
        //访问修饰符
        int modifiers = joinPoint.getSignature().getModifiers();
    }
    @AfterReturning(value = "test.mypointcut.Pointcuttest.set()",returning = "res")
    public void afterReturning(JoinPoint joinPoint,Object res){
        //获取返回结果
        //方法中加Object xxx，在注解中添加returning=“xxx”


    }
    @After("test.mypointcut.Pointcuttest.set()")
    public void after(JoinPoint joinPoint){

    }
    @AfterThrowing(value = "test.mypointcut.Pointcuttest.set()",throwing = "throwable")
    public void afterThrowinhg(JoinPoint joinPoint,Throwable throwable){
        //异常信息，方法中加Throwable xxxx
        //注解中加throwing="xxx"
    }

}

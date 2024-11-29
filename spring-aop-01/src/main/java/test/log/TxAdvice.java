package test.log;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.Order;
import org.springframework.stereotype.Component;

//@Component
//@Aspect
//@Order(1)
public class TxAdvice {
    @Before("test.mypointcut.Pointcuttest.set()")
    public void begin(){
        System.out.println("开启事务");
    }
    @AfterReturning("test.mypointcut.Pointcuttest.set()")
    public void commit(){
        System.out.println("事务提交");
    }
    @AfterThrowing("test.mypointcut.Pointcuttest.set()")
    public void rollback(){
        System.out.println("事务回滚");
    }
}

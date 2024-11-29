package test.log;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

//@Component
//@Aspect
public class TxArround {

    /*环绕通知，需要在通知中，定义目标方法的执行
    * proceedingJoinPoint 目标方法（获取目标方法信息，多一个执行方法）
    * @return 目标方法的返回值
    *
    * */
    @Around("test.mypointcut.Pointcuttest.set()")
    public Object surround(ProceedingJoinPoint proceedingJoinPoint){
            //保证目标方法被执行
        Object[] args = proceedingJoinPoint.getArgs();
        Object res = null;
        try {
            System.out.println("开启事务");
            res = proceedingJoinPoint.proceed(args);
            System.out.println("结束事务");
        } catch (Throwable e) {
            System.out.println("事务回滚");
            throw new RuntimeException(e);
        }
        return res;
    }
}

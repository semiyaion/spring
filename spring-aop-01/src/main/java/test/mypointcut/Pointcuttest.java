package test.mypointcut;

import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
public class Pointcuttest {
    @Pointcut("execution(* test.service.impl.CalculatorImpl.*(..))")
    public void set(){

    }
}

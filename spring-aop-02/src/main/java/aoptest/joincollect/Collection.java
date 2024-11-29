package aoptest.joincollect;

import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
public class Collection {
    @Pointcut("execution(* aoptest.service.Userservice.*(..))")
    public  void  location(){

    }
}

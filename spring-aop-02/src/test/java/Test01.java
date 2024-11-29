import aoptest.service.Userservice;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test01 {
    @Test
    public void test(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config01.class);
        Userservice bean = context.getBean(Userservice.class);
        bean.login();
    }
}

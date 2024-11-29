import lianxitest2.Config02;
import lianxitest2.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;


public class Test02 {
    @Test
    public void test01(){
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(Config02.class);
        UserService bean = annotationConfigApplicationContext.getBean(UserService.class);
        bean.delUser();
        bean.modUser();
        bean.getUser();
        bean.modUser();
    }
}

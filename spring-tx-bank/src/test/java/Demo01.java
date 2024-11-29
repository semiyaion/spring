import lianxitx.Config01;
import lianxitx.service.AccountService;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Demo01 {
    @Test
    public void test01(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config01.class);
        AccountService bean = context.getBean(AccountService.class);
        bean.transfer("2","1",10000);

    }
}

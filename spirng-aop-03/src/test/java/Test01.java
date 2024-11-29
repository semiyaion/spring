import lianxitest.Config01;
import lianxitest.service.AccountService;
import lianxitest.service.OrderService;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test01 {

    @Test
    public void test01(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config01.class);
        OrderService bean = context.getBean(OrderService.class);
        AccountService bean1 = context.getBean(AccountService.class);
        bean.generate();
        bean.cancel();
        bean1.transfer();
        bean1.withdraw();
    }
}

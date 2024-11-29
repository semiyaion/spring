import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import user_order.JavaConfig;
import user_order.service.User_Goods;

public class Test01 {
    @Test
    public void tets01(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
        User_Goods bean = context.getBean(User_Goods.class);
        bean.purchaseGoods(1,1);
    }

}

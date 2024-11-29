import config.ConfigTest;
import lianxi.controller.Stucontroller;
import lianxi.dao.StuDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test01 {
    private Stucontroller stucontroller;
    @Test
    public void test01(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConfigTest.class);
        Stucontroller bean = context.getBean("Stucontroller", Stucontroller.class);
        bean.findAll();

    }
}

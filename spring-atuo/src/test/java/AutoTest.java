import com.auto.controller.Usercontroller;
import com.autotest.User;
import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutoTest {
    @Test
    public void test01(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        User user = context.getBean("user", User.class);
        System.out.println(user);
    }
    @Test
    public void test02(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        Usercontroller usercontroller = context.getBean(Usercontroller.class);
        usercontroller.add();
        /*controller....
        service中的add方法
        dao中的add方法*/
    }
}

import bean_xml.Student;
import bean_xml.controller.UserController;
import com.auto.controller.Usercontroller;
import com.test.JavaBean;
import com.test.ValueTest;
import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test02 {
    @Test
    public void test01() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring02.xml");
        JavaBean bean = context.getBean(JavaBean.class);
        System.out.println(bean);
        context.close();
    }

    @Test
    public void test02() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring03.xml");
        ValueTest bean = context.getBean(ValueTest.class);
        System.out.println(bean);
        context.close();
    }

    @Test
    public void test03() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring04.xml");
        UserController bean = context.getBean(UserController.class);
        bean.finadAll();

        context.close();

    }
}

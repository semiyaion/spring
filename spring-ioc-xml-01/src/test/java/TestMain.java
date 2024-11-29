import auto.controller.UserController;
import ioctest.ioc_01.ClientService;
import ioctest.ioc_03.SetMovie;
import ioctest.ioc_05.Java;
import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("sprimng-01.xml");
        ClientService factory = context.getBean("factory", ClientService.class);
        System.out.println(factory);
    }
    @Test
    public void test(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-02.xml");
        Object userser2 = context.getBean("userser2");
        System.out.println(userser2);
        //UserService2{userDao=ioc_02.UserDao@47caedad, age=16, name='大傻'}
    }
    @Test
    /*配置文件可以是无参，单个或者多参*/
    public void test02(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-02.xml");
        SetMovie movieset = context.getBean("movieset", SetMovie.class);
        System.out.println(movieset);
    }

    //先创建ioc容器，再指定配合文件，再刷新
    @Test
    public void test03(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext();
        context.setConfigLocations("spring-02.xml");
        context.refresh();
        //调用ioc和di
        SetMovie movieset = context.getBean("movieset", SetMovie.class);
        System.out.println(movieset);

        //直接根据类型获取
        //同一类型在ioc容器中只能有一个bean
        //如果ioc容器中存在多个类型的bean，会出现：nounique不唯一异常
        SetMovie bean = context.getBean(SetMovie.class);
        System.out.println(bean);

    }
    /*
    * 测试ioc配置和销毁的方法的触发
    * */
    @Test
    public void test04() throws InterruptedException {
        //ioc直接调用的初始化的方法   init
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-03.xml");
        //ioc容器销毁方法必须正常结束ioc容器
        context.close();
        //在配置文件中配置后会一直存在，只要是在这个xml配置文件的ioc就会执行
    }
    @Test
    public void  test05(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-03.xml");
        Object java02 = context.getBean("java02");
        Object java021 = context.getBean("java02");
        //单例模式，只创建·1一个对象
        System.out.println(java021==java02);

        //如果在xml文件中将默认的scope 单例创建修改为多例创建，输出false，每get一次就会创建一个
    }
    @Test
    public void  test06() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-03.xml");
        Java java03 = context.getBean("java003", Java.class);
        System.out.println(java03);
        context.close();
        //ioc_05.Java@72bc6553

    }
    @Test
    public void test07(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("springauto.xml");
        UserController con = context.getBean("con", UserController.class);
        con.addUser();
    }
}
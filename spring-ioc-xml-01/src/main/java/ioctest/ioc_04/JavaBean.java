package ioctest.ioc_04;

public class JavaBean {

    /*
    * 必须·是public 必须是void返回值，必须是无参数的
    * 命名随意
    * 初始化-》初始化业务逻辑*/
    public void init(){
        System.out.println("javabean.init");
    }
    public void claar(){
        System.out.println("我死了");

    }
}

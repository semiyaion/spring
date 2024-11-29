package test.static01;

import test.service.impl.CalculatorImpl;

public class TestDemo {
    public static void main(String[] args) {
        CalculatorImpl calculator = new CalculatorImpl();
        //先声名核心业务
        StaticDemo staticDemo = new StaticDemo(calculator);
        //将核心业务的方法传入给aop静态代理中
        staticDemo.add(16,7);
        //给静态代理传值，静态代理会先执行非核心代码，在调用核心业务，进行输出

    }
}

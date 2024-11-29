package test.static01;

import test.service.Calculator;
//代理类不写核心业务
public class StaticDemo implements Calculator {


    private Calculator calculator;
    //使用构造方法函数传入目标
    public StaticDemo(Calculator target){
        this.calculator=target;
    }
    @Override
    public int add(int i, int j) {
        System.out.println("i = " + i + ", j = " + j);
        int res = calculator.add(i, j);
        System.out.println("res = " + res);
        return 0;
    }

    @Override
    public int sub(int i, int j) {
        return 0;
    }

    @Override
    public int mul(int i, int j) {
        return 0;
    }

    @Override
    public int div(int i, int j) {
        return 0;
    }
}

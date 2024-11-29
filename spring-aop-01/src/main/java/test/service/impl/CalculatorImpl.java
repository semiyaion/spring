package test.service.impl;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import test.service.Calculator;
@Component
public class CalculatorImpl implements Calculator {
    @Override
    public int add(int i, int j) {

        int res =i+j;
        return res;
    }

    @Override
    public int sub(int i, int j) {
        int res=i-j;
        return res;
    }

    @Override
    public int mul(int i, int j) {
        int res=i*j;
        return res;
    }

    @Override
    public int div(int i, int j) {
        int res=i/j;
        return res;
    }
}

package com.test;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
@Scope(scopeName = ConfigurableBeanFactory.SCOPE_SINGLETON)//单例默认值
//@Scope(scopeName = ConfigurableBeanFactory.SCOPE_PROTOTYPE)//多例
@Component //指定初始化
public class JavaBean {
    @PostConstruct
    public void init(){
        System.out.println("开启");
    }
    @PreDestroy //指定销毁
    public void  destroy(){
        System.out.println("结束");
    }
}

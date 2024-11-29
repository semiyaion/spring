package com.test.configdemo;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(value = "com.test")
@PropertySource(value = "classpath:jdbc.properties")
public class Config {
    //java的配置类，替代xml配置文件
    //例如Dru的配置，jdbc的配置，包扫描的配置
    /*
    * 1.包扫描注解配置
    * 2.引用外部配置文件
    * 3.声明第三方依赖的bean组件
    *
    * */

}

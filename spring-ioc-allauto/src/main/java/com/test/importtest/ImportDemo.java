package com.test.importtest;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(value = "com.test")
@PropertySource("classpath:jdbc.properties")
public class ImportDemo {

}

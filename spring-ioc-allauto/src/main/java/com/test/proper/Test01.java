package com.test.proper;

import com.test.StudentService;
import com.test.configdemo.Config;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.AnnotatedBeanDefinition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test01 {
    @Test
    public void test(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext();
        annotationConfigApplicationContext.register(Config.class);
        annotationConfigApplicationContext.refresh();

        StudentService bean = context.getBean(StudentService.class);
        System.out.println(bean);
    }
}

package test.configtext;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(value = "test")
@EnableAspectJAutoProxy//开启aspect的注解
public class Config1 {
}

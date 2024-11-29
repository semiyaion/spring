package lianxitest;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
@Configuration
@ComponentScan(value = "lianxitest.service")
@EnableAspectJAutoProxy
public class Config01 {
}

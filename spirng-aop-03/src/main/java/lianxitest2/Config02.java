package lianxitest2;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@ComponentScan(value = "lianxitest2.service")
@EnableAspectJAutoProxy
@Configuration
public class Config02 {
}

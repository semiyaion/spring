package com.test.bean;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.*;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
@ComponentScan("com.test")
@PropertySource("classpath:jdbc.properties")
@Configuration
public class BeanTest {
    @Value("${jdbc.url}")
    private String url;
    @Value("${jdbc.driver}")
    private String driver;
    @Value("${jdbc.username}")
    private String username;
    @Value("${jdbc.password}")
    public  String password;

    @Scope(scopeName = ConfigurableBeanFactory.SCOPE_SINGLETON)
    @Bean(name ="xlc",initMethod = "",destroyMethod = "")
    //将此链接池放入bean中

    //周期方法如何指定
    /*加上PosrConstruct+PreDestory  注解
    *
    * @bean属性指定：initMethod 、destoryMethod注解指定
    *
    * 作用域的指定：@Scope注解，默认是单例
    * 任何引用其他的ioc组件
    * 直接调用对方的bean方法
    * 直接形参变量注入，如果有多个形参名=组件id值
    * */
    public DruidDataSource dataSource(){
        DruidDataSource druidDataSource = new DruidDataSource();
        druidDataSource.setUrl(url);
        druidDataSource.setDriverClassName(driver);
        druidDataSource.setUsername(username);
        druidDataSource.setPassword(password);
        return dataSource();
    }
    @Bean
    public JdbcTemplate jdbcTemplate(DataSource dataSource){ //形参列表声明想要的组件类型，可以是一个或多个，ioc容器自动装配
        JdbcTemplate jdbcTemplate=new JdbcTemplate();
        //需要Datasource血药ioc容器的其他组件
        //如果其他组件也是@Bean方法就可以直接调用
//        jdbcTemplate.setDataSource(dataSource());
        //直接在形参列表赋值
        //如果用形参变量注入，必须要有对应的类型组件，如果没有抛异常
        //如果有多个，形参数据必须与连接池名称相同即bean的标识
        jdbcTemplate.setDataSource(dataSource);
        return jdbcTemplate;
    }
}

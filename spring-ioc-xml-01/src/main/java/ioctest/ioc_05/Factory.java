package ioctest.ioc_05;

import ioctest.ioc_03.SetMovie;
import org.springframework.beans.factory.FactoryBean;

public class Factory implements FactoryBean<SetMovie> {
    @Override
    public SetMovie getObject() throws Exception {
        return null;
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }
    /*FactoryBean接口是Spring IoC容器实例化逻辑的可插拔性点
    * 用于配置复杂的Bean对象，可以将创建过程存储在FactoryBean的getObject方法中
    *
    * 提供三种方法：
    * T  getObject（）
    * 返回工厂创建的对象的实例，该返回值会被存储到ioc容器中
    * isSingleton：
    * 如果返回的是单例，则返回true，不是就false
    * Class<?> getObjectType 返回getobject方法返回的对象类型*/
}

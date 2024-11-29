package ioctest.ioc_05;

import org.springframework.beans.factory.FactoryBean;
//实现FactoryBean接口，返回泛型就是要创建单例的类
public class JvaaBean_Factory implements FactoryBean<Java> {


    private  String value;

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public Java getObject() throws Exception {
        Java java = new Java();
        java.setName(value);
        return java;
        //实例化java对象
    }

    @Override
    public Class<?> getObjectType() {
        return Java.class;
    }
}

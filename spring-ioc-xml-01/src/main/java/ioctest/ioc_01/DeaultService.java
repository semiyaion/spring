package ioctest.ioc_01;

public class DeaultService {
    //实例工厂的创建
    private static ClientServiceimp clientServiceimp=new ClientServiceimp();
    public  ClientServiceimp createClientServiceimp(){
        return clientServiceimp;
    }
}

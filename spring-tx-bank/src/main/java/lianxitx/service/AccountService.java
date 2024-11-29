package lianxitx.service;

public interface AccountService {
    //事务接口
    //转账业务  从这个账户转出，到哪个账户，金额
    void transfer(String fromActno,String toActno,double money);

}

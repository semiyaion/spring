package lianxitx.service;

import lianxitx.dao.AccountDao;
import lianxitx.pojo.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService{
    @Autowired
    private AccountDao accountDao;

    @Override
    public void transfer(String fromActno, String toActno, double money) {
        //查询转出账户余额是否充足
        Account fromaccot = accountDao.selectByActno(fromActno);
        if(fromaccot.getBankmon()<money){
            System.out.println("余额不足转出失败");
            return;
        }
        //余额充足情况
        Account tocount = accountDao.selectByActno(toActno);
        fromaccot.setBankmon(fromaccot.getBankmon()-money);
        tocount.setBankmon(tocount.getBankmon()+money);

        //数据库更新
        int update = accountDao.update(fromaccot);
        int update1 = accountDao.update(tocount);
        if(update1+update!=2){
            System.out.println("转账失败，请重新输入");
            return;
        }else {
            System.out.println("转账成功");
        }


    }
}

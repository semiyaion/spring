package lianxitx.dao;

import lianxitx.pojo.Account;

public interface AccountDao {
    //Dao中没有任何业务逻辑
   public Account selectByActno(String id);
    int update(Account act);

    //根据账号查询账户
    //跟新账户信息
}

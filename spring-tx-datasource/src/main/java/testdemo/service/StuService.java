package testdemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import testdemo.dao.StuDao;
@Service
public class StuService {
    @Autowired
    private StuDao stuDao;
    @Transactional
    /*添加事务
    * 位置：方法/类上
    * 方法：当前方法有事务
    * 类上：类下的所以方法都有事务*/
    public void chageinformation(){
        stuDao.updateAgebyid(28,1);
//        int i=1/0;
//        //此处出现报错，事务回滚，id为1的数据虽然被修改了但出现错误回滚，数据并未发生修改
        stuDao.updateNamebyid("田七",3);
    }

}

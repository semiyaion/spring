package lianxitest2.service;

import org.springframework.stereotype.Service;

@Service
public class VipService {
    public void saveVip(){
        System.out.println("新增会员信息");
    }
    public void delVip(){
        System.out.println("删除会员信息");
    }
    public void modVip(){
        System.out.println("更改会员信息");
    }
    public void getVip(){
        System.out.println("获取会员信息");
    }
}

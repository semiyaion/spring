package lianxitest2.service;

import org.springframework.stereotype.Service;

@Service
public class UserService {
    public void saveUser(){
        System.out.println("新增用户信息");
    }
    public void delUser(){
        System.out.println("删除用户信息");
    }
    public void modUser(){
        System.out.println("更改用户信息");
    }
    public void getUser(){
        System.out.println("获取用户信息");
    }
}

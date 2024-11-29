package aoptest.service;

import org.springframework.stereotype.Service;

@Service
public class Userservice {

    public void login(){
        System.out.println("系统正在进行身份验证");
    }
}

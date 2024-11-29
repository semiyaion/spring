package com.auto.controller;


import com.auto.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class Usercontroller {

    //注入service
//    @Autowired//根据类型找到对象，完成注入
//    private UserService userService;
//    @Autowired //set方法注入
//    public void setUserService(UserService userService) {
//        this.userService = userService;
//    }
    //构造方法上注入
    private UserService userService;
    @Autowired
    public Usercontroller(UserService userService) {
        this.userService = userService;
    }

    public void add(){
        System.out.println("controller....");
        userService.add();
    }
}

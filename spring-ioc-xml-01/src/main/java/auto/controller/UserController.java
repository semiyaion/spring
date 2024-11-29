package auto.controller;

import auto.service.UserService;

public class UserController {
    private UserService userService;

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public void addUser(){
        System.out.println("Controller方法执行了");
        userService.addUserService();
    }
}

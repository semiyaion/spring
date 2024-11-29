package bean_xml.controller;

import bean_xml.Student;
import bean_xml.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class UserController {
    @Autowired
    private UserService userService;
    public void finadAll(){
        List<Student> serviceAll = userService.findAll();
        System.out.println(serviceAll);
    }
}

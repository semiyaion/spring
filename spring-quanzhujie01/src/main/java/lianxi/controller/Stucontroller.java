package lianxi.controller;

import lianxi.Student;
import lianxi.service.StuSer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;
@Controller
public class Stucontroller implements StuSer{
    @Autowired
    private StuSer stuSer;

    @Override
    public List<Student> findAll() {
        List<Student> serviceAll = stuSer.findAll();
        System.out.println(serviceAll);
        return serviceAll;
    }
}

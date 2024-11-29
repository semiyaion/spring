package lianxi.service;

import lianxi.Student;
import lianxi.dao.StuDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StuserImpl implements StuSer{
    @Autowired
    private StuDao stuDao;
    @Override
    public List<Student> findAll() {
        List<Student> userServiceAll = stuDao.querlAll();
        return userServiceAll;
    }
}

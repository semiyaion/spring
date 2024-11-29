package bean_xml.service;

import bean_xml.Student;
import bean_xml.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserDao userDao;
    @Override
    public List<Student> findAll() {
        List<Student> userServiceAll = userDao.queryAll();
        return userServiceAll;
    }
}

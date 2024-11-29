package auto.service;

import auto.dao.UserDao;

public class UserServiceImpl implements  UserService{
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void addUserService() {
       userDao.addUserDAo();
        System.out.println("userservice里面的方法执行了");
    }
}

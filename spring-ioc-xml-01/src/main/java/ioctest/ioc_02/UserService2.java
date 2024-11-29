package ioctest.ioc_02;

public class UserService2 {
    private UserDao userDao;

    public UserService2(UserDao userDao) {
        this.userDao = userDao;
    }
    private int age;
    private  String name;

    public UserService2(UserDao userDao, int age, String name) {
        this.userDao = userDao;
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "UserService2{" +
                "userDao=" + userDao +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}

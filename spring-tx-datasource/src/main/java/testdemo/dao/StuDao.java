package testdemo.dao;

import testdemo.pojo.Student;

public interface StuDao {
    public Student updateNamebyid(String name,Integer id);
    public Student updateAgebyid(Integer age,Integer id);
}

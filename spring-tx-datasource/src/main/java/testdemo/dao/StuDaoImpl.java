package testdemo.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import testdemo.JavaConfig;
import testdemo.pojo.Student;
@Repository
public class StuDaoImpl implements StuDao{
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public Student updateNamebyid(String name, Integer id) {
        String sql="update student01 set name=? where id=?";
        int rows = jdbcTemplate.update(sql, name, id);
        return null;
    }

    @Override
    public Student updateAgebyid(Integer age, Integer id) {
        String sql="update student01 set age=? where id=?";
        jdbcTemplate.update(sql,age,id);
        return null;
    }
}

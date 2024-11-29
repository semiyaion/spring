package lianxi.dao;

import lianxi.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class StuImpl implements StuDao{
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Override
    public List<Student> querlAll() {
        String sql="select id ,name,age,gender,class as classes from student01";
        List<Student> query = jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Student.class));
        return query;
    }
}

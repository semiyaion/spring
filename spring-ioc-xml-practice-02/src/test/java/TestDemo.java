import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import pojo.Student;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class TestDemo {
    @Test
    public void test() {
        //创建ioc容器
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-01.xml");

        //获取jdbcTemlate组件
        JdbcTemplate jdbctmp = applicationContext.getBean(JdbcTemplate.class);

        //进行数据库crud动作
        String sql = "insert into student01 (name,gender,age,class) values (?,?,?,?)";
        int update = jdbctmp.update(sql, "张三", "男", 17, "高三三班");
        System.out.println(update);
        String sql02 = "select * from student01 where id=?";
        Student student01 = jdbctmp.queryForObject(sql02, (rs, rowNum) -> {
            //rs 结果集
            //rownum 结果行数
            //rs结果集中获取列的值，赋值给实体对象
            Student student = new Student();
            student.setId(rs.getInt("id"));
            student.setAge(rs.getInt("age"));
            student.setClasses(rs.getString("class"));
            student.setName(rs.getString("name"));
            student.setGender(rs.getString("gender"));
            return student;

        }, 1);
        System.out.println(student01);

        //查询所有学院数据
        String sql03 = "select id ,name,gender,age, class as classes from student01;";
        List<Student> query = jdbctmp.query(sql03, new BeanPropertyRowMapper<>(Student.class));
        System.out.println(query);


    }
}



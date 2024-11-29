package user_order.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import user_order.pojo.Goods;
import user_order.pojo.User;
@Repository
public class UserDaoImpl implements Userdao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public User getUserById(int userId) {
        String sql = "select id,username,uesrorder,checking from user001 WHERE id = ?";
        User user = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(User.class),userId);
        return user;
    }

    @Override
    public void updateUserOrder(int userId, String order) {
        String sql = "UPDATE user001 SET uesrorder = ? WHERE id = ?";
        jdbcTemplate.update(sql, order, userId);
    }

    @Override
    public void updateUserChecking(int userId, double newChecking) {
        String sql = "UPDATE user001 SET checking = ? WHERE id = ?";
        jdbcTemplate.update(sql, newChecking, userId);
    }
}
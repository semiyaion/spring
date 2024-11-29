package lianxitx.dao;

import lianxitx.pojo.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public class AccountDaoImpl implements AccountDao{
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public Account selectByActno(String id) {
        String sql="select id,bankname ,bankmon from bank where id=?";
        Account account = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(Account.class), id);
        return account;
    }

    @Override
    public int update(Account act) {
        String sql="update bank set bankmon=? where id=?";
        int update = jdbcTemplate.update(sql, act.getBankmon(), act.getId());
        return update;
    }
}

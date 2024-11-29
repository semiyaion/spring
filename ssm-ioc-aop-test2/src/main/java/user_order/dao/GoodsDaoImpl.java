package user_order.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import user_order.pojo.Goods;
@Repository
public class GoodsDaoImpl implements GoodsDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public Goods getGoodsById(int goodsId) {
        String sql = "SELECT id,goodsname,goodscost FROM goods WHERE id = ?";
        Goods goods = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(Goods.class),goodsId);
        return goods;
    }
}




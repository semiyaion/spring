package user_order.dao;

import user_order.pojo.Goods;

public interface GoodsDao {
    Goods getGoodsById(int goodsId);
}

package user_order.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import user_order.dao.GoodsDao;
import user_order.dao.Userdao;
import user_order.pojo.Goods;
import user_order.pojo.User;
@Service
public class User_GoodsImpl implements User_Goods{

    @Autowired
    private Userdao userDao;

    @Autowired
    private GoodsDao goodsDao;

    @Override
    public void purchaseGoods(int userId, int goodsId) {
        // 获取用户和商品信息
        User user = userDao.getUserById(userId);
        Goods goods = goodsDao.getGoodsById(goodsId);

        if (user.getChecking() < goods.getGoodscost()) {
            throw new RuntimeException("Insufficient balance");
        }

        // 更新用户订单信息
        String newOrder = goods.getGoodsname();
        userDao.updateUserOrder(userId, newOrder);

        // 扣减用户余额
        double newBalance = user.getChecking() - goods.getGoodscost();
        userDao.updateUserChecking(userId, newBalance);
    }
}



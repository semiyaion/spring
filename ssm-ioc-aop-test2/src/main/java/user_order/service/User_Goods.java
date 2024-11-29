package user_order.service;

public interface User_Goods {
    //根据提供的id购买数据更新到用户数据表中
    //减少用户金额

        void purchaseGoods(int userId, int goodsId);

}

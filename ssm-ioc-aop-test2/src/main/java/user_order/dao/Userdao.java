package user_order.dao;

import user_order.pojo.User;

public interface Userdao {
    User getUserById(int userId);
    void updateUserOrder(int userId, String order);
    void updateUserChecking(int userId, double newChecking);
}


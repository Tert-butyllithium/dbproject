package edu.sustech.dbproject.dao;

import edu.sustech.dbproject.entity.Order;

import java.util.List;

public interface OrderDao {

    /**
     * list bought orders for users
     * @param user
     * @param page
     * @return
     */
    List<Order> getBuyingOrders(Integer user,Integer page);

    /**
     * list all orders sold by users
     * @param user
     * @param page
     * @return
     */
    List<Order> getSoldOrders(Integer user,Integer page);

    /**
     * insert an order to database
     * @param order
     */
    void insert(Order order);

    /**
     * change status an order whose status=1 (undone)
     * to -1 (deleted)
     * @param order
     */
    void deleteUndoneOrder(Integer order);
}

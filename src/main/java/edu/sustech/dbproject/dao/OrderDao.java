package edu.sustech.dbproject.dao;

import edu.sustech.dbproject.entity.Order;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderDao {

    /**
     * list bought orders for users
     * @param user
     * @param page
     * @return
     */
    List<Order> getBoughtOrders(Integer user,Integer page);
//
//    /**
//     * list all orders sold by users
//     * @param user
//     * @param page
//     * @return
//     */
//    List<Order> getSoldOrders(Integer user,Integer page);

    /**
     * get the order by the good
     * @param good
     * @return
     */
    Order getByGoodId(Integer good);

    /**
     * insert an order to database
     * @param order
     */
    void insert(Order order);

    /**
     * change status an order whose status=0 (undone)
     * to -1 (deleted)
     * @param order
     */
    void deleteUndoneOrder(Integer order);

    /**
     * change status an order whose status=0 (undone)
     * to 1 (done)
     * @param order
     */
    void done(Integer order);
}

package edu.sustech.dbproject;

import edu.sustech.dbproject.dao.GoodsDao;
import edu.sustech.dbproject.dao.OrderDao;
import edu.sustech.dbproject.entity.Order;
import edu.sustech.dbproject.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class OrderDaoTest {
    @Autowired
    OrderDao orderDao;

    @Autowired
    GoodsDao goodsDao;

    @Test
    public void insertTest(){
        var goods=goodsDao.findByKeyword("testGood");
        for(var c:goods){
            var order=new Order();
            order.setBuyer_id(42);
            order.setGoods_id(c.getGoods_id());
            orderDao.insert(order);
        }
    }

    @Test
    public void getBuyingListTest(){
        System.out.println(orderDao.getBoughtOrders(42,1));
        System.out.println(orderDao.getBoughtOrders(42,2));
    }

    @Test
    public void getByGoodIdTest(){
        System.out.println(orderDao.getByGoodId(211));
    }

    @Test
    public void doneTest(){
        for(int i=103;i<=202;i++){
            orderDao.done(i);
        }
    }
}

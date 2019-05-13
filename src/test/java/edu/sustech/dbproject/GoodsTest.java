package edu.sustech.dbproject;

import edu.sustech.dbproject.dao.GoodsDao;
import edu.sustech.dbproject.entity.Good;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class GoodsTest {
    @Autowired
    GoodsDao goodsDao;

    @Test
    public void InsertTest(){
        for(int i=0;i<100;i++) {
            Good good = new Good();
            good.setName("testGood"+i);
            goodsDao.insert(good);
        }
    }
}

package edu.sustech.dbproject;

import edu.sustech.dbproject.dao.GoodsDao;
import edu.sustech.dbproject.entity.Good;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.validator.PublicClassValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
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

    @Test
    public void updateTest(){
        Good good=goodsDao.findByName("testGood11").get(0);
        System.out.println(good.getGoods_id());
        good.setGoods_tag(2);
        goodsDao.update(good);
    }


    @Test
    public void findByIDtest(){
        System.out.println(goodsDao.findById(1));
    }

    @Test
    public void PictureInsertTest(){
        goodsDao.addPicture(1,"/pict/a1.png");
    }

    @Test
    public void PictureListTest(){
        System.out.println(goodsDao.listPictures(1));
    }

    @Test
    public void findBySellerTest(){
        System.out.println(goodsDao.findBySeller(1,1));
        System.out.println(goodsDao.findBySeller(1,2));
    }

    @Test
    public void findByNameTest(){
        System.out.println(goodsDao.findByName("iPhone"));
    }

    @Test
    public void findByKeyword(){
        System.out.println(goodsDao.findByKeyword("iPhone"));
    }

    @Test
    public void findWithTag(){
        System.out.println(goodsDao.findWithTag("iPhone XI",1));
    }

    @Test
    public void findKeywordWithtag(){
        System.out.println(goodsDao.findKeywordWithTag("iPhone",1));
    }
}

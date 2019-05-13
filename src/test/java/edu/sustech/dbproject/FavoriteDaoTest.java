package edu.sustech.dbproject;

import edu.sustech.dbproject.dao.FavoriteDao;
import edu.sustech.dbproject.dao.UserDao;
import edu.sustech.dbproject.entity.User;
import net.bytebuddy.asm.Advice;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class FavoriteDaoTest {

    @Autowired
    private FavoriteDao favoriteDao;


    @Test
    public void findFavoritesTest(){

        System.out.println(favoriteDao.findFavorites(1,1));
    }

    @Test
    public void insertTest(){
        for(int i=1;i<10;i++)
            favoriteDao.mark(1,i);
    }

    @Test
    public void deleteTest(){
        favoriteDao.delete(1,1);
        favoriteDao.delete(1,1);
    }
}

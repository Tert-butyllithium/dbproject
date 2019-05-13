package edu.sustech.dbproject;

import edu.sustech.dbproject.dao.FavoriteDao;
import edu.sustech.dbproject.dao.MessageDao;
import edu.sustech.dbproject.dao.UserDao;
import edu.sustech.dbproject.entity.Message;
import net.bytebuddy.NamingStrategy;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

@RunWith(SpringRunner.class)
@SpringBootTest
public class JDBCTest {
    @Test
    public void connect() throws SQLException {
        String url = "jdbc:postgresql://localhost/lumia?user=lumia&password=0qwerty&ssl=false";
        Properties props = new Properties();
        props.setProperty("user", "fred");
        props.setProperty("password", "secret");
        props.setProperty("ssl", "true");
        Connection conn = DriverManager.getConnection(url, props);
//
//        String url = "jdbc:postgresql://localhost/test?user=fred&password=secret&ssl=true";
//        Connection conn = DriverManager.getConnection(url);
    }

    @Autowired
    UserDao userDao;

    @Test
    public void getAllUserTest(){
        var c=userDao.findAll(1);
        System.out.println(userDao.findAll(1));
    }

    @Autowired
    FavoriteDao favoriteDao;

    public void testFavorite(){
        System.out.println(favoriteDao.findFavorites(1,1));
    }

    @Autowired
    MessageDao messageDao;
    public void testMessage(){
        System.out.println(messageDao.findMessage(1,1,1));
    }
}

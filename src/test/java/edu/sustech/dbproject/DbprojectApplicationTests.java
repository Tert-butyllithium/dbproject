package edu.sustech.dbproject;

import edu.sustech.dbproject.dao.MessageDao;
import edu.sustech.dbproject.dao.UserDao;
import edu.sustech.dbproject.entity.Message;
import edu.sustech.dbproject.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DbprojectApplicationTests {

    @Test
    public void contextLoads() {
    }

    @Autowired
//    private MessageDao messageDao;
    private UserDao userDao;

    @Test
    public void queryMessageByID(){
//        Message message=messageDao.queryMessageByID(1);
//        System.out.println(message);
//        System.out.println(userDao.findByNickname("wxydj"));
        User user=new User();
        user.setUser_id(9);
//        user.setPermission(1);
//        user.setStatus(1);
//        user.setOpen_id(1);
//        user.setEmail_address("09212908209280@mail.sustech.edu.cn");

        user.setAvatar_url("/home/lumia");
        userDao.update(user);
        for(int i=1;i<=99;i++){
            User user1=new User();
            user1.setEmail_address(String.format("131111%02d@mail.sustech.edu.cn",i));
            userDao.insert(user1);
        }
    }

    @Test
    public void selectUser(){
        System.out.println(userDao.findAll(1));
    }

    @Test
    public void findUser(){
        System.out.println(userDao.findByNickname(null,2));
    }

    @Test
    public void Update(){
        for(int i=10;i<100;i++){
            User user=userDao.find(i);
            user.setNickname(String.format("%d%d%d%d",i,i+1,i+2,i-1));
            userDao.update(user);
        }
    }

}

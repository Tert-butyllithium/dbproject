package edu.sustech.dbproject;

import edu.sustech.dbproject.dao.MessageDao;
import edu.sustech.dbproject.entity.Message;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@SpringBootTest
@RunWith(SpringRunner.class)
public class MessageDaoTest {
    @Autowired
    MessageDao messageDao;

    @Test
    public void testInsert(){
        Message message=new Message();
        message.setBuyer_id(1);
        message.setGoods_id(1);
        message.setChat_content("守护最好的坤坤");
        message.setChat_type(1);
//        System.out.println(messageDao);
        messageDao.insert(message);
    }
}

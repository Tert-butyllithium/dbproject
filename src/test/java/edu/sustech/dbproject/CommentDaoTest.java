package edu.sustech.dbproject;

import edu.sustech.dbproject.dao.CommentDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class CommentDaoTest {
    @Autowired
    CommentDao commentDao;

    @Test
    public void showAllCommentTest(){
        System.out.println(commentDao.showAllComment(1,1));
    }


}

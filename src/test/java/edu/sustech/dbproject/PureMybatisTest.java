package edu.sustech.dbproject;

import edu.sustech.dbproject.dao.UserDao;
import edu.sustech.dbproject.entity.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;
import java.util.List;

public class PureMybatisTest {
    public static void main(String[] args) {
        try  {

            String resource = "mybatis/mybatis-config.xml";
            InputStream inputStream = Resources.getResourceAsStream(resource);
            SqlSessionFactory sqlSessionFactory = new
                    SqlSessionFactoryBuilder().build(inputStream);

            SqlSession session = sqlSessionFactory.openSession();

            UserDao userDao=session.getMapper(UserDao.class);

            List<User> list = userDao.findAll(1);

            for (var a : list) {
                System.out.println(a);
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}

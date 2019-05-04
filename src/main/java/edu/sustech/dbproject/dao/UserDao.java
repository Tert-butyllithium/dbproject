package edu.sustech.dbproject.dao;

import edu.sustech.dbproject.entity.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserDao {

    /**
     * list all users
     * @param page
     * @return
     */
    List<User> findAll(Integer page);


    /**
     * find all users with saome nickname
     * @param nickname
     * @return
     */
    List<User> findByNickname(@Param("nickname") String nickname,@Param("page") Integer page);

    /**
     * find a specific user by user_id
     * Note: the user my be not valid
     * @param user
     * @return a user
     */

    User find(Integer user);

    /**
     * add a new user to table
     * Note: the user_id cannot be set
     * @param user
     */
    void insert(User user);

    /**
     * update an info for some user
     * @param user
     */
    void update(User user);


}

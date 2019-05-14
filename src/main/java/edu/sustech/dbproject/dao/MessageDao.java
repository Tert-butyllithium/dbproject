package edu.sustech.dbproject.dao;

import edu.sustech.dbproject.entity.Message;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import javax.xml.crypto.Data;
import java.util.List;

@Repository
public interface MessageDao {

    /**
     * list several messages
     * found by buyer and good
     * @param buyer
     * @param good
     * @param pages
     * @return
     */
    List<Message> findMessage(Integer buyer,Integer good,Integer pages);

    /**
     * find latest ten messages before time
     * @param buyer
     * @param good
     * @param time the time should not be null
     * @return
     */
    List<Message> findLatestMessage(@Param("buyer") Integer buyer, @Param("good") Integer good,@Param("time") Data time);

    /**
     * insert a message
     * @param message
     */
    void insert(Message message);

}

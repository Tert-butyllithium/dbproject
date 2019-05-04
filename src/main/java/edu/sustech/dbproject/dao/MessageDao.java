package edu.sustech.dbproject.dao;

import edu.sustech.dbproject.entity.Message;

import java.util.List;

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
     * insert a message
     * @param message
     */
    void insert(Message message);

}

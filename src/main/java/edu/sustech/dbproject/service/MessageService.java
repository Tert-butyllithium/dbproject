package edu.sustech.dbproject.service;

import edu.sustech.dbproject.entity.Message;
import java.util.List;

public interface MessageService {
    /**
     * 信息表格
     *
     * @return messageList
     */
    List<Message> queryMessages();

//    /**
//     * 根据ID返回某个信息
//     *
//     * @return message
//     */
//    Message queryMessageByID(int messageID);

    /**
     * 添加信息
     *
     * @return messageID
     */
    void insertMessage(Message message);
}

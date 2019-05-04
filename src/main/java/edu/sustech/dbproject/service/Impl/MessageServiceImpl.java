package edu.sustech.dbproject.service.Impl;

import edu.sustech.dbproject.dao.MessageDao;
import edu.sustech.dbproject.entity.Message;
import edu.sustech.dbproject.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@Service
public class MessageServiceImpl implements MessageService {
    @Autowired
    private MessageDao messageDao;

    @Override
    public List<Message> queryMessages() {
        return null;
    }

//    @Override
//    public Message queryMessageByID(int messageID) {
//        return messageDao.queryMessageByID(messageID);
//    }

    @Transactional
    @Override
    public void insertMessage(Message message) {
        if(message.getRecvUserID() != null && message.getRecvUserID() != null &&
                message.getContent() != null && !"".equals(message.getContent())){
            message.setMessageTime(new Date());
            try{
                messageDao.insert(message);

            }catch (Exception e){
                throw new RuntimeException("插入信息失败：" + e.getMessage());
            }
        }else{
            throw new RuntimeException("插入信息失败：插入的信息不能为空！" + message.toString());
        }
    }


}

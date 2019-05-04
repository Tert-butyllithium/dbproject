package edu.sustech.dbproject.entity;

import java.util.Date;

public class Message {
    //主键ID
    private Integer messageID;
    //发送者ID
    private Integer sendUserID;
    //接受者ID
    private Integer recvUserID;
    //时间
    private Date messageTime;
    //内容
    private String content;
    //内容类型
    private Integer contentType;
    //direction
    private boolean direction;

    public Integer getMessageID() {
        return messageID;
    }

    public Integer getSendUserID() {
        return sendUserID;
    }

    public Integer getRecvUserID() {
        return recvUserID;
    }

    public Date getMessageTime() {
        return messageTime;
    }

    public String getContent() {
        return content;
    }

    public Integer getContentType() {
        return contentType;
    }

    public boolean isDirection() {
        return direction;
    }

    public void setMessageID(Integer messageID) {
        this.messageID = messageID;
    }

    public void setSendUserID(Integer sendUserID) {
        this.sendUserID = sendUserID;
    }

    public void setRecvUserID(Integer recvUserID) {
        this.recvUserID = recvUserID;
    }

    public void setMessageTime(Date messageTime) {
        this.messageTime = messageTime;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setContentType(Integer contentType) {
        this.contentType = contentType;
    }

    public void setDirection(boolean direction) {
        this.direction = direction;
    }

}


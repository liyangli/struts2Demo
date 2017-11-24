package com.ylisoftware.action;

import com.opensymphony.xwork2.ActionSupport;
import com.ylisoftware.model.MessageStore;

/**
 * author:liyangli
 * date: 2017/11/15 下午10:50.
 */
public class HelloWorldAction extends ActionSupport {

    private static int helloCount = 0;
    private MessageStore messageStore;
    private String userName;

    public String execute(){
        messageStore = new MessageStore();
        if(userName != null){
            messageStore.setMessage(messageStore.getMessage()+" "
            +userName);
        }
        helloCount ++;
        return SUCCESS;
    }

    public  int getHelloCount() {
        return helloCount;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public MessageStore getMessageStore() {
        return messageStore;
    }
}

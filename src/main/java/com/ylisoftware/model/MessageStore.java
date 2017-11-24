package com.ylisoftware.model;

/**
 * author:liyangli
 * date: 2017/11/15 下午10:48.
 */
public class MessageStore {

    private String message;


    public MessageStore(){
        message = "Hello Struts User";
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "MessageStore{" +
                "message='" + message + '\'' +
                '}';
    }
}

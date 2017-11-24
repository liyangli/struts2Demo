package com.ylisoftware.bean;

/**
 * 实体bean.进行处理数据映射
 * author:liyangli
 * date: 2017/11/22 上午12:06.
 */
public class User {
    private String userName;
    private String password;
    private String password2;
    private String fullName;
    private String formAddress;
    private String replyToAddress;


    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", password2='" + password2 + '\'' +
                ", fullName='" + fullName + '\'' +
                ", formAddress='" + formAddress + '\'' +
                ", replyToAddress='" + replyToAddress + '\'' +
                '}';
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword2() {
        return password2;
    }

    public void setPassword2(String password2) {
        this.password2 = password2;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getFormAddress() {
        return formAddress;
    }

    public void setFormAddress(String formAddress) {
        this.formAddress = formAddress;
    }

    public String getReplyToAddress() {
        return replyToAddress;
    }

    public void setReplyToAddress(String replyToAddress) {
        this.replyToAddress = replyToAddress;
    }
}

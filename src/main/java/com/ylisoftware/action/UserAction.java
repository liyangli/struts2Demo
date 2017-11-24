package com.ylisoftware.action;

import com.opensymphony.xwork2.ActionSupport;
import com.ylisoftware.bean.User;

/**
 * author:liyangli
 * date: 2017/11/22 上午12:05.
 */
public class UserAction extends ActionSupport {

    private User user;

    /**
     * 注册方法，主要进行处理用户注册
     * @return
     */
    public String login(){
        System.out.println("User->"+user);
        return SUCCESS;
    }

    //增加具体方法的验证方法：
    /*public void validateLogin(){

        String userName = user.getUserName();
        if("".equals(userName)){
            addFieldError("user.userName","用户名不允许为空");
        }
        String password = user.getPassword();
        if("".equals(password)){
            addFieldError("user.password","密码不允许为空");
        }else if(password.length() < 3){
            addFieldError("user.password","密码长度必须大于3位");
        }
    }*/



    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}

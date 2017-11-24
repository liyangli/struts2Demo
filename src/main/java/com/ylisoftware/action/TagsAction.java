package com.ylisoftware.action;

import com.opensymphony.xwork2.ActionSupport;
import com.ylisoftware.bean.User;

import java.util.ArrayList;
import java.util.List;

/**
 * author:liyangli
 * date: 2017/11/23 上午6:25.
 */
public class TagsAction extends ActionSupport {

    private User user;
    private List<String> list;


    public String execute(){
        list = new ArrayList<String>();
        user = new User();
        user.setFullName("lyl");
        user.setPassword("12323");
        user.setFormAddress("beijingaddress");

        list.add("lyl");
        list.add("lzy");
        list.add("gjy");
        list.add("lzy");

        return SUCCESS;
    }


    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}

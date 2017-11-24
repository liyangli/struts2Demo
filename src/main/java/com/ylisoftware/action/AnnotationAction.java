package com.ylisoftware.action;

import com.opensymphony.xwork2.ActionSupport;
import com.ylisoftware.bean.User;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.InterceptorRef;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;

/**
 * author:liyangli
 * date: 2017/11/25 上午6:25.
 */
@ParentPackage("struts-default")
public class AnnotationAction extends ActionSupport {


    private User user;

    @Action(value = "findNames",results = {
            @Result(name="success",location = "/annotation.jsp"),

    },
            interceptorRefs = {
                @InterceptorRef("defaultStack")
            }
    )
    public String findNames(){
        user = new User();
        user.setUserName("liyangli");
        user.setFullName("lyl");
        user.setPassword("123456");
        return SUCCESS;
    }


    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}

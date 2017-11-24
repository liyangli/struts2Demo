package com.ylisoftware.action;

import com.opensymphony.xwork2.ActionSupport;
import com.ylisoftware.bean.User;
import org.apache.struts2.ServletActionContext;

import javax.servlet.http.HttpServletResponse;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.PrintWriter;

/**
 * author:liyangli
 * date: 2017/11/22 上午3:49.
 */
public class AjaxAction extends ActionSupport {

    private User user;
    private InputStream inputStream;
    /**
     *
     * @return
     */
    public void noReturnAjax() throws Exception{
        HttpServletResponse resp = ServletActionContext.getResponse();
        resp.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html;charset=utf-8");
        PrintWriter out = resp.getWriter();
        out.print("{'userName':'"+user.getUserName()+"'}");
        out.flush();
        out.close();
    }

    public String streamAjax() throws Exception{
        String msg = "{'userName':'"+user.getUserName()+"'}";
        inputStream = new ByteArrayInputStream(msg.getBytes("UTF-8"));
        return SUCCESS;
    }
    public String jsonAjax(){
        return SUCCESS;
    }

    public InputStream getInputStream() {
        return inputStream;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}

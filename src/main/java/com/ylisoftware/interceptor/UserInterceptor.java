package com.ylisoftware.interceptor;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionEventListener;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;
import com.opensymphony.xwork2.util.ValueStack;
import org.apache.struts2.dispatcher.HttpParameters;

/**
 * author:liyangli
 * date: 2017/11/22 上午1:57.
 */
public class UserInterceptor implements Interceptor{

    public void destroy() {
        System.out.println("interceptor destory method..");
    }

    public void init() {
        System.out.println("interceptor init method..");
    }

    /**
     * 拦截器真正拦截处理操作
     * @param actionInvocation
     * @return
     * @throws Exception
     */
    public String intercept(ActionInvocation actionInvocation) throws Exception {
        //调用方法之前处理操作
        before(actionInvocation);

        String result = actionInvocation.invoke();
        //返回数据了。可以进行之后数据进行操作
        System.out.println("after return ->"+result);
        return result;
    }

    private void before(ActionInvocation ai){
        ActionContext ac = ai.getInvocationContext();
        HttpParameters parameters = ac.getParameters();
        System.out.println("userName->"+parameters.get("user.userName").getValue());

    }
}

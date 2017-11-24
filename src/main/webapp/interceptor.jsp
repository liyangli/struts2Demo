<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
   拦截器进行处理操作；
   1、请求后进行通过拦截器进行验证数据；
  Created by IntelliJ IDEA.
  User: liyangli
  Date: 2017/11/22
  Time: 上午1:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>拦截器处理</title>
</head>
<body>

<s:form action="/interceprotDemo">
    <s:textfield label="用户名" name="user.userName"/>
    <s:password label="密码" name="user.password"/>
    <s:submit value="提交" />
</s:form>
</body>
</html>

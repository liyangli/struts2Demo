<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: liyangli
  Date: 2017/11/25
  Time: 上午6:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>注解处理类</title>
</head>
<body>
user:${user}
<br/>
<s:form action="findNames" >
    <s:textfield label="用户名" name="user.userName"/>
    <s:password label="密码" name="user.password"/>
    <s:submit value="提交" />
</s:form>
</body>
</html>

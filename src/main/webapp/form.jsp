<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  用户注册：
  1、页面上对应填写form表单
  2、进行提交给后台，后台进行验证；
  3、错误信息进行反馈给前端进行验证处理
  Created by IntelliJ IDEA.
  User: liyangli
  Date: 2017/11/21
  Time: 上午6:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>registor User</title>
</head>
<br>
<s:form action="login" >
    <s:textfield label="用户名" name="user.userName"/>
    <s:password label="密码" name="user.password"/>
    <s:submit value="提交" />
</s:form>
</body>
</html>

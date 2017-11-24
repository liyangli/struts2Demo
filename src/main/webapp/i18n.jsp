<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: liyangli
  Date: 2017/11/24
  Time: 上午6:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>i18n</title>
</head>
<body>
<a href="/lang?request_locale=zh_CN">中文</a>
<a href="/lang?request_locale=en_US">English</a>

<s:form>
    <s:textfield name="username" key="login.username"/>
    <s:textfield name="password" key="login.password"/>
    <s:submit key="login.submit"/>
</s:form>

</body>
</html>

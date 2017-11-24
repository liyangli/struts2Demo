<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: liyangli
  Date: 2017/11/15
  Time: 下午10:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Hello World!</title>
</head>
<body>

<!---->
<s:property value="messageStore"/>
<br/>
<!--static field-->
<p>i've said hello-> <s:property value="helloCount"/> </p>
<br/>
<h2><s:property value="messageStore.message" /></h2>
</body>
</html>

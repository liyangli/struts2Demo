<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
   文件上传操作。主要进行处理上传文件内容处理
  Created by IntelliJ IDEA.
  User: liyangli
  Date: 2017/11/22
  Time: 上午2:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>文件上传</title>
</head>
<body>
<s:fielderror/>
<s:form action="upload" method="POST" enctype="multipart/form-data">
    <s:file name="file" label="上传文件"/>
    <s:submit value="上传"/>
</s:form>
</body>
</html>

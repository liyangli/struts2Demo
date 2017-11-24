<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
 对文件上传
  Created by IntelliJ IDEA.
  User: liyangli
  Date: 2017/11/22
  Time: 上午3:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>多文件上传</title>
</head>
<body>
<s:form action="multUpload" method="POST" enctype="multipart/form-data">
    <s:file name="file" label="文件1"/>

   <s:file name="file" label="文件2"/>

    <s:submit value="上传"/>
</s:form>

</body>
</html>

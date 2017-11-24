<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>主入口处理</title>
</head>
<body>

<h1>包含的主题</h1>
<ul>
    <li>
        <a href="helloWord.jsp">1、hello</a>
    </li>
    <li>
        <a href="form.jsp">2、Form、验证</a>
    </li>
    <li>
        <a href="interceptor.jsp">3、拦截器</a>
    </li>
    <li>
        4、文件上传
        <br/>
        <a href="upload.jsp">单文件</a>
        <br/>
        <a href="multUpload.jsp">多文件</a>
    </li>
    <li>
        5、国际化与标签
        <br/>
        <a href="/strutsTag">标签</a>
        <br/>
        <a href="i18n.jsp">国际化</a>

    </li>
    <li>
        <a href="ajax.jsp">6、Ajax讲解</a>
    </li>
    <li>
        <a href="annotation.jsp">7、注解方式处理</a>
    </li>
</ul>





</body>
</html>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: liyangli
  Date: 2017/11/22
  Time: 下午7:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    request.setAttribute("age",30);
%>
<html>
<head>
    <title>struts核心标签</title>
</head>
<body>
<!--subset-->
subset after:
<s:subset source="list" start="1" count="2">
    <s:iterator>
        <s:property/>
    </s:iterator>
</s:subset>

<br/>
<!--sort 排序-->
<s:bean name="com.ylisoftware.utils.NameComparator" var="nameComparator"/>
<s:sort comparator="#nameComparator" source="list" >
    <s:iterator value="list" var="str">
        compartor-><s:property value="str"/>
    </s:iterator>
</s:sort>
<br/>
<!--merge 进行合并集合数据-->
<s:merge var="allData">
    <s:param value="list"/>
    <s:param value="list"/>
</s:merge>

<!--iterator-->
<s:iterator value="allData" var="str">
    str-><s:property value="str"/>
</s:iterator>
<br/>
<s:iterator value="{1,2,3,4,5,6,7}" var="number">
    iterator-><s:property value="number"/>
</s:iterator>
<br/>
<!--临时定义对象进行操作-->
<s:bean name="com.ylisoftware.bean.User" var="user1">
    <s:param name="password2" value="12345"/>
    密码： <s:property value="password2"/><br/>
</s:bean>

<s:if test="age== 30">
    而立之年
</s:if>
<s:elseif test="aget == 40">
    不惑之年
</s:elseif>
<s:else>
    ${user}
    <br/>
    ${user1}
    -------------------------------
    <br/>
    用户名：<s:property value="user.fullName"/>
    密码： <s:property value="user1.password2"/>
    地址： <s:property value="user.formAddress"/>
</s:else>

</body>
</html>

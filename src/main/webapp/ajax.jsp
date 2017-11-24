<%--
  Created by IntelliJ IDEA.
  User: liyangli
  Date: 2017/11/22
  Time: 上午3:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>异步交互</title>
    <script type="text/javascript"  src="js/jquery-3.2.1.js"></script>
    <script type="text/javascript">
        $(function(){
            $(".btn").bind("click",function(){
                var url = $(this).attr("attr-url");
                var userName = $("#userName").val();
                var password = $("#password").val();
                //开始进行异步方式进行交互
                $.ajax({
                    url: "/"+url,
                    method: "post",
                    data: {
                        "user.userName": userName,
                        "user.password": password
                    },
                    success: function(result){
                        console.info(result);
                        $("#resultMsg").html(result);
                    },
                    error: function(){
                        console.error("error");
                    }
                });
            })
        });
    </script>
</head>
<body>
    用户名： <input type="text" id="userName"/>
    密码： <input type="password" id="password"/>

    <input type="button" value="登陆(noReturn)" class="btn" attr-url="noReturnAjax" />
    <input type="button" value="登陆(return Stream)" class="btn" attr-url="streamAjax"/>
    <input type="button" value="登陆(return json)" class="btn" attr-url="jsonAjax"/>

<div id="resultMsg">

</div>

</body>
</html>

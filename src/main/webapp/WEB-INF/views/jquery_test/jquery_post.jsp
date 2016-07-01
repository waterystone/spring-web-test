<%--
  Created by IntelliJ IDEA.
  User: yunjie.du
  Date: 2016/7/1
  Time: 9:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <script type="text/javascript" src="/js/jquery-3.0.0.js"></script>
    <script type="text/javascript">
        function button_click() {
            $.post("http://localhost:8087/user/login",
                    {
                        account:"waterystone",
                        password:"123456"
                    },
                    function(data,status){
                        alert("Data: " + data + "\nStatus: " + status);
                        location.href = "http://localhost:8087/login";
            });
        }
    </script>
</head>
<body>
<button onclick="button_click()">登陆</button>
</body>
</html>

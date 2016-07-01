<%--
  Created by IntelliJ IDEA.
  User: yunjie.du
  Date: 2016/7/1
  Time: 15:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <script type="text/javascript" src="/js/jquery.js"></script>
    <script type="text/javascript">
        $(document).ready(function () {
            $("p").mouseover(function () {
                $("div").html($(this).css("background-color"));
            });
        });
    </script>
</head>
<body>
<p style="background-color: #ff0000">这是一个段落。</p>
<p style="background-color: #00ff00">这是一个段落。</p>
<p style="background-color: #0000ff">这是一个段落</p>
<div style="background-color: gainsboro;border: 2px;width: 200px;height: 100px;"></div>
</body>
</html>

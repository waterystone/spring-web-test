<%--
  Created by IntelliJ IDEA.
  User: yunjie.du
  Date: 2016/7/1
  Time: 10:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <script type="text/javascript" src="/js/jquery-3.0.0.js"></script>
    <script type="text/javascript">
        $(document).ready(function () {
            $("button").click(function () {
                $("#div1").fadeOut();
                $("#div2").fadeOut("slow");
                $("#div3").fadeOut(3000);
            });
        });
    </script>
</head>
<body>
<p>演示带有不同参数的 fadeOut() 方法。</p>
<button>点击这里，使三个矩形淡出</button>
<br><br>
<div id="div1" style="width:80px;height:80px;background-color: red;"></div>
<br>
<div id="div2" style="width: 80px;height: 80px;background-color: green;"></div>
<br>
<div id="div3" style="width: 80px;height: 80px;background-color: blue;"></div>
</body>
</html>

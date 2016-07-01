<%--
  Created by IntelliJ IDEA.
  User: yunjie.du
  Date: 2016/7/1
  Time: 11:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <script type="text/javascript" src="/js/jquery.js"></script>
    <script type="text/javascript">
        $(document).ready(function () {
            $(".ex .hide").click(function () {
                $(this).parents(".ex").hide();
            });
        });
    </script>

    <style type="text/css">
        div.ex {
            background-color: #e5eecc;
            padding: 7px;
            border: solid 1px #c3c3c3;
        }
    </style>
</head>
<body>
<h3>中国办事处</h3>
<div class="ex">
    <button class="hide">隐藏</button>
    <p>联系人：张先生<br/>
        北三环中路 100 号<br/>
        北京
    </p>
</div>

<h3>美国办事处</h3>
<div class="ex">
    <button class="hide">隐藏</button>
    <p>联系人：David<br/>
        第五大街 200 号<br/>
        纽约
    </p>
</div>
</body>
</html>

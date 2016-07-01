<%--
  Created by IntelliJ IDEA.
  User: yunjie.du
  Date: 2016/7/1
  Time: 11:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <script type="text/javascript" src="/js/jquery-3.0.0.js"></script>
    <script type="text/javascript">
        $(document).ready(function () {
            $(".flip").click(function () {
                $(".panel").slideToggle("slow");
            });
        });
    </script>
    <style type="text/css">
        div.panel, p.flip {
            margin: 0px;
            padding: 5px;
            text-align: center;
            background: #e5eecc;
            border: solid 1px #c3c3c3;
        }

        div.panel {
            height: 120px;
            display: none;
        }
    </style>
</head>
<body>
<div class="panel">
    <p>W3School - 领先的 Web 技术教程站点</p>
    <p>在W3School，你可以找到你所需要的所有网站建设教程。</p>
</div>
<p class="flip">请点击这里</p>
</body>
</html>

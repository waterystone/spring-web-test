<%--
  Created by IntelliJ IDEA.
  User: yunjie.du
  Date: 2016/7/1
  Time: 14:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <script type="text/javascript" src="/js/jquery.js"></script>
    <script type="text/javascript">
        $(document).ready(function () {
            $("#button1").click(function () {
                $("h1").before("<b>Before</b>");
            });
            $("#button2").click(function () {
                $("h1").after("<i>After</i>");
            });
        });
    </script>
</head>
<body>
<h1>W3School</h1>
<button id="button1">在前面添加文本</button>
<button id="button2">在后面添加文本</button>
</body>
</html>

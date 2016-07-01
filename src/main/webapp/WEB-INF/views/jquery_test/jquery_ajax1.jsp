<%--
  Created by IntelliJ IDEA.
  User: yunjie.du
  Date: 2016/7/1
  Time: 15:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="zh-CN">
<head>
    <script type="text/javascript" src="/js/jquery.js"></script>
    <script type="text/javascript">
        $(document).ready(function () {
            $("button").click(function () {
                $("div").load("/WEB-INF/views/index.jsp");
            });
        });
    </script>
</head>
<body>
<div>通过 AJAX 改变文本。</div>
<button>Click me</button>
</body>
</html>

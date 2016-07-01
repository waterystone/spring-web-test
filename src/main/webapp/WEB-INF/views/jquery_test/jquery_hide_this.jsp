<%--
  Created by IntelliJ IDEA.
  User: yunjie.du
  Date: 2016/6/30
  Time: 16:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <script type="text/javascript" src="/js/jquery.js"></script>
    <script type="text/javascript">
        $(document).ready(function () {
          $("button").click(function () {
              $(this).hide();
          });
        });
    </script>
</head>
<body>
<button type="button">Click me</button>
</body>
</html>

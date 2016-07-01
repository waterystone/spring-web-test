<%--
  Created by IntelliJ IDEA.
  User: yunjie.du
  Date: 2016/7/1
  Time: 10:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <script type="text/javascript" src="/js/jquery-3.0.0.js"></script>
    <script type="text/javascript">
        $(document).ready(function () {
            $("p").click(function () {
                $(this).hide();
            });
        });
    </script>
</head>
<body>
<p>如果您点击我，我会消失。</p>
<p>点击我，我会消失。</p>
<p>也要点击我哦。</p>
</body>
</html>

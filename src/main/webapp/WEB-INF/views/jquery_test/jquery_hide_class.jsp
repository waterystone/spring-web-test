<%--
  Created by IntelliJ IDEA.
  User: yunjie.du
  Date: 2016/6/30
  Time: 16:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <script type="text/javascript" src="/js/jquery-3.0.0.js"></script>
    <script type="text/javascript">
        $(document).ready(function () {
            $("button").click(function () {
                $(".test").hide();
            });
        });
    </script>
</head>
<body>
<h2 class="test">This is a heading</h2>
<p class="test">This is a paragraph.</p>
<p>This is another paragraph.</p>
<button>Click me</button>
</body>
</html>

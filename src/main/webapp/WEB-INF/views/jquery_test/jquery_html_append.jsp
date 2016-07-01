<%--
  Created by IntelliJ IDEA.
  User: yunjie.du
  Date: 2016/7/1
  Time: 14:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <script type="text/javascript" src="/js/jquery.js"></script>
    <script type="text/javascript">
        $(document).ready(function () {
            $("#button1").click(function () {
                $("p").append("<b>Appended text</b>.")
            });
            $("#button2").click(function () {
                $("ol").append("<li>Appended item</li>")
            });
        });
    </script>
</head>
<body>
<p>This is a paragraph.</p>
<p>This is another paragraph.</p>
<ol>
    <li>List item 1</li>
    <li>List item 2</li>
    <li>List item 3</li>
</ol>
<button id="button1">追加文本</button>
<button id="button2">追加列表</button>
</body>
</html>

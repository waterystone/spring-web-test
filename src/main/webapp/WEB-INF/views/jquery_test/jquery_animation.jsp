<%--
  Created by IntelliJ IDEA.
  User: yunjie.du
  Date: 2016/7/1
  Time: 12:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <script type="text/javascript" src="/js/jquery-3.0.0.js"></script>
    <script type="text/javascript">
        $(document).ready(function () {
            $("button").click(function () {
                var div = $("div");
                div.animate({height: '300px', opacity: '0.4'}, 5000);
                div.animate({width: '300px', opacity: '0.8'}, 5000);
                div.animate({height: '100px', opacity: '0.4'}, 5000);
                div.animate({width: '100px', opacity: '0.8'}, 5000);
            });
        });
    </script>
</head>
<body>
<button>开始动画</button>
<p>默认情况下，所有HTML位置都是静态的，并且无法移动。如需对位置进行操作，记得首先把元素的CSS position属性设置为relative、fixed或absolute。</p>
<div style="background: #98bf21;height: 100px;width: 100px;position: absolute;text-align: justify;">
    Hello,World!
</div>
</body>
</html>

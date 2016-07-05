<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="zh-CN">
<head>
    <meta charset="utf-8">
    <meta http-equiv="x-ua-compatible" content="IE=edge">
    <%--为了确保适当的绘制和触屏缩放--%>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <%--上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随期后！--%>
    <link rel="icon" href="/icon/favicon.ico">
    <title>Bootstrap 101 Template</title>

    <%--Bootstrap--%>
    <link href="/css/bootstrap.css" rel="stylesheet">
    <%--jQuery (necessary for Bootstrap's JavaScript plugins)--%>
    <script src="/js/jquery.js"></script>
    <script src="/js/bootstrap.js"></script>

    <%--Custom styles for this template--%>
    <link href="/css/bootstrap-test/sticky-footer.css" rel="stylesheet">
    <%--Custom javascripts for this template--%>

</head>

<body>
<div class="container">
    <div class="page-header">
        <h1>Sticky footer</h1>
    </div>
    <p class="lead">Pin a fixed-height footer to the bottom of the viewport in desktop browsers with this custom
        HTML and CSS.</p>
    <p>Use <a href="./sticky-footer-navbar">the sticky footer with a fixed navbar</a> if need be, too </p>
</div>

<footer class="footer">
    <div class="container">
        <p class="text-muted">Place sticky footer content here.</p>
    </div>
</footer>
</body>
</html>
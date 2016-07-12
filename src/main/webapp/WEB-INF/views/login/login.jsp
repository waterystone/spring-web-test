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
    <title>Signin Template for Bootstrap</title>

    <%--Bootstrap--%>
    <link href="/css/bootstrap.css" rel="stylesheet">
    <%--jQuery (necessary for Bootstrap's JavaScript plugins)--%>
    <script src="/js/jquery.js"></script>
    <script src="/js/bootstrap.js"></script>

    <%--Custom styles for this template--%>
    <link href="/css/user/login.css" rel="stylesheet">
    <%--Custom javascripts for this template--%>
    <script src="/js/user/login.js"></script>

</head>

<body>
<div class="container">

    <form class="form-signin" role="form">
        <h2 class="form-signin-heading">Please sign in</h2>
        <label for="inputAccount" class="sr-only">Email address</label>
        <input type="text" id="inputAccount" class="form-control" placeholder="Account" required autofocus>
        <label for="inputPassword" class="sr-only">password</label>
        <input type="password" id="inputPassword" class="form-control" placeholder="Password" required>
        <label for="inputSrcUrl" class="sr-only">srcUrl</label>
        <input type="hidden" id="inputSrcUrl" class="form-control" value="${srcUrl}">
        <div class="checkbox">
            <label><input id="inputRemember" type="checkbox" value="true"> Remember me</label>
        </div>
        <a class="btn btn-lg btn-primary btn-block" href="javascript:;" onclick="login_submit()">Sign in</a>
    </form>
</div>


</body>
</html>
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
    <%--Custom javascripts for this template--%>

</head>

<body>
<div class="container">

    <form action="/file/upload" enctype="multipart/form-data" method="post">
        <input type="text" name="name" class="form-control" placeholder="姓名" required autofocus>
        <input type="file" name="file" class="form-control" >
        <input type="submit" value="上传">
    </form>
</div>


</body>
</html>
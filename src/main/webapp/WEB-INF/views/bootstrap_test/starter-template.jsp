<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="zh-CN">
<head>
    <meta charset="utf-8">
    <meta http-equiv="x-ua-compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <%--上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随期后！--%>

    <link rel="icon" href="/icon/favicon.ico">
    <title>Starter Template for Bootstrap</title>

    <%--Bootstrap CSS--%>
    <link href="/css/bootstrap.css" rel="stylesheet">

    <%--jQuery (necessary for Bootstrap's JavaScript plugins)--%>
    <script src="/js/jquery.js"></script>
    <%--Include all compiled plugins (below), or include individual --%>
    <script src="/js/bootstrap.js"></script>

    <%--Custom styles for this template--%>
    <link href="/css/bootstrap/starter-template.css" rel="stylesheet">

    <%--Custom javascripts for this template--%>

</head>

<body>

<nav class="navbar navbar-inverse navbar-fixed-top">
    <div class="container">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle collapse" data-toggle="collapse" data-target="#navbar"
                    aria-expanded="false" aria-controls="navbar">
                <span class="sr-only" Toggle navigation></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="#">Project name</a>
        </div>
        <div id="navbar" class="collapse navbar-collapse">
            <ul class="nav navbar-nav">
                <li class="active"><a href="#">Home</a></li>
                <li><a href="#about">About</a></li>
                <li><a href="#contact">Contact</a></li>
            </ul>
        </div>
        <%--/.nav-collapse--%>
    </div>
</nav>

<div class="container starter-template">
    <h1>Bootstrap starter template</h1>
    <p class="lead">Use this document as a way to quickly start an new project.<br> All you get is this text and a
        mostly barebones HTML document.</p>
</div>
</body>
</html>
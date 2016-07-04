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
    <%--Include all compiled plugins (below), or include individual --%>
    <script src="/js/bootstrap.js"></script>

    <%--Custom styles for this template--%>
    <link href="/css/bootstrap-test/navbar.css" rel="stylesheet">

    <%--Custom javascripts for this template--%>

</head>

<body>
<div class="container">
    <nav class="navbar navbar-default">
        <div class="container-fluid">
            <div class="navbar-header">
                <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar"
                        aria-expanded="false" aria-controls="navbar">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="#">Project name</a>
            </div>
            <div id="navbar" class="navbar-collapse collapse">
                <ul class="nav navbar-nav">
                    <li class="active"><a href="#">Home</a></li>
                    <li><a href="#">About</a></li>
                    <li><a href="#">Contact</a></li>
                    <li class="dropdown">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true"
                           aria-expanded="false">Dropdown <span class="caret"></span></a>
                        <ul class="dropdown-menu">
                            <li><a href="#">Action</a></li>
                            <li><a href="#">Another action</a></li>
                            <li><a href="#">Something else here</a></li>
                            <li role="separator" class="divider"></li>
                            <li class="dropdown-header">Nav header</li>
                            <li><a href="#">Separated link</a></li>
                            <li><a href="#">One more separated link</a></li>
                        </ul>
                    </li>
                </ul>
                <ul class="nav navbar-nav navbar-right">
                    <li class="active"><a href="./">Default<span class="sr-only">(current)</span> </a></li>
                    <li><a href="./navbar-static-top">Static top</a></li>
                    <li><a href="./navbar-fixed-top">Fixed top</a></li>
                </ul>
            </div>

        </div>
    </nav>

    <div class="jumbotron">
        <h1>Navbar example</h1>
        <p class="lead">This example is a quick exercise to illustrate how the default, static navbar and fixed to top
            navbar work. It includes the responsive CSS and HTML, so it also adapts to your viewport and device.</p>
        <p><a href="http://v3.bootcss.com/components/#navbar" class="btn btn-primary btn-lg" role="button">View navbar
            docs &raquo;</a></p>
    </div>
</div>
<%--end of container--%>
</body>
</html>
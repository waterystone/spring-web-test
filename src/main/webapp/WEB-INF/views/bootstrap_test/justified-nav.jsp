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
    <title>Justified Nav Template for Bootstrap</title>

    <%--Bootstrap--%>
    <link href="/css/bootstrap.css" rel="stylesheet">
    <%--jQuery (necessary for Bootstrap's JavaScript plugins)--%>
    <script src="/js/jquery.js"></script>
    <script src="/js/bootstrap.js"></script>

    <%--Custom styles for this template--%>
    <link href="/css/bootstrap-test/justified-nav.css" rel="stylesheet">

    <%--Custom javascripts for this template--%>

</head>

<body>
<div class="container">
    <div class="masthead">
        <h3 class="text-muted">Project name</h3>
        <nav>
            <ul class="nav nav-justified">
                <li class="active"><a href="#">Home</a></li>
                <li><a href="#">Projects</a></li>
                <li><a href="#">Services</a></li>
                <li><a href="#">Downloads</a></li>
                <li><a href="#">About</a></li>
                <li><a href="#">Contact</a></li>
            </ul>
        </nav>
    </div>


    <div class="jumbotron">
        <h1>Marketing stuff!</h1>
        <p class="lead">Cras justo odio, dapibus ac facilisis in, egestas eget quam. Fusce dapibus, tellus ac cursus
            commodo, tortor
            mauris condimentum nibh, ut fermentum massa justo sit amet.</p>
        <p><a href="http://v3.bootcss.com/examples/justified-nav/#" class="btn btn-success btn-lg" role="button">Get
            started today</a></p>
    </div>

    <div class="row">
        <div class="col-lg-4">
            <h2>Safari bug warning!</h2>
            <p class="text-danger">As of v8.0, Safari exhibits a bug in which resizing your browser horizontally causes
                rendering errors in the justified nav that are cleared upon refreshing.</p>
            <p>Donec id elit non mi porta gravida at eget metus. Fusce dapibus, tellus ac cursus commodo, tortor mauris
                condimentum nibh, ut fermentum massa justo sit amet risus. Etiam porta sem malesuada magna mollis
                euismod. Donec sed odio dui.</p>
            <p><a href="#" class="btn btn-primary" role="button">View details &raquo;</a></p>
        </div>
        <div class="col-lg-4">
            <h2>Heading</h2>
            <p>Donec id elit non mi porta gravida at eget metus. Fusce dapibus, tellus ac cursus commodo, tortor mauris
                condimentum nibh, ut fermentum massa justo sit amet risus. Etiam porta sem malesuada magna mollis
                euismod. Donec sed odio dui.</p>
            <p><a href="#" class="btn btn-primary" role="button">View details &raquo;</a></p>
        </div>
        <div class="col-lg-4">
            <h2>Heading</h2>
            <p>Donec id elit non mi porta gravida at eget metus. Fusce dapibus, tellus ac cursus commodo, tortor mauris
                condimentum nibh, ut fermentum massa justo sit amet risus. Etiam porta sem malesuada magna mollis
                euismod. Donec sed odio dui.</p>
            <p><a href="#" class="btn btn-primary" role="button">View details &raquo;</a></p>
        </div>
    </div>

    <footer class="footer">
        <p>&copy; Company 2014</p>
    </footer>
</div>
</body>
</html>
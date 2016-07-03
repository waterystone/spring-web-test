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
    <title>Theme template for Bootstrap</title>

    <%--Bootstrap--%>
    <link href="/css/bootstrap.css" rel="stylesheet">
    <link href="/css/bootstrap-theme.css" rel="stylesheet">
    <%--jQuery (necessary for Bootstrap's JavaScript plugins)--%>
    <script src="/js/jquery.js"></script>
    <%--Include all compiled plugins (below), or include individual --%>
    <script src="/js/bootstrap.js"></script>
    <script src="/js/docs.min.js"></script>

    <%--Custom styles for this template--%>
    <link href="/css/bootstrap/theme.css" rel="stylesheet">

    <%--Custom javascripts for this template--%>

</head>

<div role="document">

    <%--Fixed navbar--%>
    <nav class="navbar navbar-inverse navbar-fixed-top">
        <div class="container">
            <%--navbar header--%>
            <div class="navbar-header">
                <button type="button" class="navbar-toggle collapse" data-toggle="collapse" data-target="#navbar"
                        aria-expanded="false" aria-controls="navbar">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="#">Bootstrap theme</a>
            </div>

            <%--navbar collapse--%>
            <div id="navbar" class="navbar-collapse collapse">
                <ul class="nav navbar-nav">
                    <li class="active"><a href="#">Home</a></li>
                    <li><a href="#about">About</a></li>
                    <li><a href="#contact">Contact</a></li>
                    <li class="dropdown">
                        <a class="dropdown-toggle" href="#" data-toggle="dropdown" role="button" aria-haspopup="true"
                           aria-expanded="false">Dropdown <span class="caret"></span> </a>
                        <ul class="dropdown-menu">
                            <li><a href="#">Action</a></li>
                            <li><a href="#">Another Action</a></li>
                            <li><a href="#">Something else here</a></li>
                            <li class="divider" role="separator"></li>
                            <li class="dropdown-header">Nav header</li>
                            <li><a href="#">Separated link</a></li>
                            <li><a href="#">One more separated link</a></li>

                        </ul>
                    </li>
                </ul>
                <%--/.nav-collapse--%>

            </div>
        </div>
    </nav>

    <div class="container theme-showcase" role="main">
        <%--Main jupbotron for a primary marketing message call to action--%>
        <div class="jumbotron">
            <h1>THeme example</h1>
            <p>This is a themplate showcasing the optional theme stylesheet included in Bootstrap. Use it as a starting
                point to create something more unique by building on or modifying it.</p>
        </div>

        <%--Button--%>
        <div class="page-header">
            <h1>Buttons</h1>
        </div>
        <p>
            <button type="button" class="btn btn-lg btn-default">Default</button>
            <button type="button" class="btn btn-lg btn-primary">Primary</button>
            <button type="button" class="btn btn-lg btn-success">Success</button>
            <button type="button" class="btn btn-lg btn-info">Info</button>
            <button type="button" class="btn btn-lg btn-warning">Warning</button>
            <button type="button" class="btn btn-lg btn-danger">Danger</button>
            <button type="button" class="btn btn-lg btn-link">Link</button>
        </p>
        <p>
            <button type="button" class="btn btn btn-default">Default</button>
            <button type="button" class="btn btn-primary">Primary</button>
            <button type="button" class="btn btn-success">Success</button>
            <button type="button" class="btn btn-info">Info</button>
            <button type="button" class="btn btn-warning">Warning</button>
            <button type="button" class="btn btn-danger">Danger</button>
            <button type="button" class="btn btn-link">Link</button>
        </p>
        <p>
            <button type="button" class="btn btn-sm btn-default">Default</button>
            <button type="button" class="btn btn-sm btn-primary">Primary</button>
            <button type="button" class="btn btn-sm btn-success">Success</button>
            <button type="button" class="btn btn-sm btn-info">Info</button>
            <button type="button" class="btn btn-sm btn-warning">Warning</button>
            <button type="button" class="btn btn-sm btn-danger">Danger</button>
            <button type="button" class="btn btn-sm btn-link">Link</button>
        </p>
        <p>
            <button type="button" class="btn btn-xs btn-default">Default</button>
            <button type="button" class="btn btn-xs btn-primary">Primary</button>
            <button type="button" class="btn btn-xs btn-success">Success</button>
            <button type="button" class="btn btn-xs btn-info">Info</button>
            <button type="button" class="btn btn-xs btn-warning">Warning</button>
            <button type="button" class="btn btn-xs btn-danger">Danger</button>
            <button type="button" class="btn btn-xs btn-link">Link</button>
        </p>


        <%--Table--%>
        <div class="page-header">
            <h1>Tables</h1>
        </div>
        <div class="row">
            <div class="col-md-6">
                <table class="table">
                    <thead>
                    <tr>
                        <th>#</th>
                        <th>First Name</th>
                        <th>Last Name</th>
                        <th>Username</th>
                    </tr>
                    </thead>
                    <tbody>
                    <tr>
                        <td>1</td>
                        <td>Mark</td>
                        <td>Otto</td>
                        <td>@Mdo</td>
                    </tr>
                    <tr>
                        <td>2</td>
                        <td>Jacob</td>
                        <td>Thornton</td>
                        <td>@fat</td>
                    </tr>
                    <tr>
                        <td>3</td>
                        <td>Larry</td>
                        <td>the Bird</td>
                        <td>@twitter</td>
                    </tr>
                    </tbody>
                </table>
            </div>
            <div class="col-md-6">
                <table class="table table-striped">
                    <thead>
                    <tr>
                        <th>#</th>
                        <th>FIrst Name</th>
                        <th>Second Name</th>
                        <th>User Name</th>
                    </tr>
                    </thead>
                    <tbody>
                    <tr>
                        <td>1</td>
                        <td>Mark</td>
                        <td>Otto</td>
                        <td>@mdo</td>
                    </tr>
                    <tr>
                        <td>2</td>
                        <td>Jacob</td>
                        <td>Thornton</td>
                        <td>@fat</td>
                    </tr>
                    <tr>
                        <td>3</td>
                        <td>Larry</td>
                        <td>the Bird</td>
                        <td>@twitter</td>
                    </tr>
                    </tbody>
                </table>
            </div>
        </div>

        <div class="row">
            <div class="col-md-6">
                <table class="table table-bordered">
                    <thead>
                    <th>#</th>
                    <th>First Name</th>
                    <th>Second Name</th>
                    <th>Username</th>
                    </thead>
                    <tbody>
                    <tr>
                        <td rowspan="2">1</td>
                        <td>Mark</td>
                        <td>Otto</td>
                        <td>@mdo</td>
                    </tr>
                    <tr>
                        <td>Mark</td>
                        <td>Otto</td>
                        <td>@TwBootstrap</td>
                    </tr>
                    <tr>
                        <td>2</td>
                        <td>Jacob</td>
                        <td>Thornton</td>
                        <td>@fat</td>
                    </tr>
                    <tr>
                        <td>3</td>
                        <td colspan="2">Larry the Bird</td>
                        <td>@twitter</td>
                    </tr>
                    </tbody>
                </table>
            </div>
            <div class="col-md-6">
                <table class="table table-condensed">
                    <thead>
                    <tr>
                        <th>#</th>
                        <th>FIrst Name</th>
                        <th>Second Name</th>
                        <th>User Name</th>
                    </tr>
                    </thead>
                    <tbody>
                    <tr>
                        <td>1</td>
                        <td>Mark</td>
                        <td>Otto</td>
                        <td>@mdo</td>
                    </tr>
                    <tr>
                        <td>2</td>
                        <td>Jacob</td>
                        <td>Thornton</td>
                        <td>@fat</td>
                    </tr>
                    <tr>
                        <td>3</td>
                        <td>Larry</td>
                        <td>the Bird</td>
                        <td>@twitter</td>
                    </tr>
                    </tbody>
                </table>
            </div>
        </div>
        <%--/.Table--%>

        <%--Thumbnail--%>
        <div class="page-header">
            <h1>Thumbnails</h1>
        </div>
        <div class="row">
            <div class="col-md-3">
                <div class="thumbnail">
                    <img src="/pic/submarine.jpg"
                         alt="海底世界">
                </div>
            </div>
            <div class="col-md-3">
                <div class="thumbnail">
                    <img src="/pic/dog.jpg"
                         alt="宠物狗">
                </div>
            </div>
        </div>
        <%--/.Thumbnails--%>

        <%--Label--%>
        <div class="page-header">
            <h1>Labels</h1>
        </div>
        <h1>
            <span class="label label-default">Default</span>
            <span class="label label-primary">Primary</span>
            <span class="label label-success">Success</span>
            <span class="label label-info">Info</span>
            <span class="label label-warning">Warning</span>
            <span class="label label-danger">Danger</span>
        </h1>
        <h2>
            <span class="label label-default">Default</span>
            <span class="label label-primary">Primary</span>
            <span class="label label-success">Success</span>
            <span class="label label-info">Info</span>
            <span class="label label-warning">Warning</span>
            <span class="label label-danger">Danger</span>
        </h2>
        <h3>
            <span class="label label-default">Default</span>
            <span class="label label-primary">Primary</span>
            <span class="label label-success">Success</span>
            <span class="label label-info">Info</span>
            <span class="label label-warning">Warning</span>
            <span class="label label-danger">Danger</span>
        </h3>
        <h4>
            <span class="label label-default">Default</span>
            <span class="label label-primary">Primary</span>
            <span class="label label-success">Success</span>
            <span class="label label-info">Info</span>
            <span class="label label-warning">Warning</span>
            <span class="label label-danger">Danger</span>
        </h4>
        <h5>
            <span class="label label-default">Default</span>
            <span class="label label-primary">Primary</span>
            <span class="label label-success">Success</span>
            <span class="label label-info">Info</span>
            <span class="label label-warning">Warning</span>
            <span class="label label-danger">Danger</span>
        </h5>
        <h6>
            <span class="label label-default">Default</span>
            <span class="label label-primary">Primary</span>
            <span class="label label-success">Success</span>
            <span class="label label-info">Info</span>
            <span class="label label-warning">Warning</span>
            <span class="label label-danger">Danger</span>
        </h6>

        <%--Badge--%>
        <div class="page-header">
            <h1>Badges</h1>
        </div>
        <a href="#">Inbox <span class="badge">42</span> </a>
        <ul class="nav nav-pills" role="tablist">
            <li role="presentation" class="active"><a href="#">Home <span class="badge">42</span> </a></li>
            <li role="presentation"><a href="#">Profile</a></li>
            <li role="presentation"><a href="#">Messages <span class="badge">3</span></a></li>
        </ul>
    </div>
    <%--end of Badge--%>

    <%--Dropdown--%>
    <div class="page-header">
        <h1>Dropdown menus</h1>
    </div>
    <div class="dropdown">
        <a id="dropdownMenu1" href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true"
           aria-expanded="false">Dropdown <span class="caret"></span> </a>
        <ul class="dropdown-menu">
            <li><a href="#">Action</a></li>
            <li><a href="#">Another Action</a></li>
            <li><a href="#">Something else</a></li>
            <li role="separator" class="divider"></li>
            <li><a href="#">Separated link</a></li>
        </ul>
    </div>
    <%--end of Dropdown--%>

    <%--Navs--%>
    <div class="page-header">
        <h1>Navs</h1>
    </div>
    <ul class="nav nav-tabs" role="tablist">
        <li role="presentation"><a href="#">Home</a></li>
        <li role="presentation" class="active"><a href="#">Profile</a></li>
        <li role="presentation"><a href="#">Messages</a></li>
    </ul>
    <ul class="nav nav-pills" role="tablist">
        <li role="presentation" class="active"><a href="#">Home</a></li>
        <li role="presentation"><a href="#">Profile</a></li>
        <li role="presentation"><a href="#">Messages</a></li>
    </ul>
    <%--end of Navs--%>

    <%--Navbar--%>
    <div class="page-header">
        <h1>Navbars</h1>
    </div>
    <nav class="nav navbar-default">
        <div class="container">
            <div class="navbar-header">
                <button type="button" class="navbar-toggle collapsed" data-toggle="collapse"
                        data-target=".navbar-collapse">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="#">Project name</a>
            </div>
            <div class="navbar-collapse collapse">
                <ul class="nav navbar-nav">
                    <li class="active"><a href="#">Home</a></li>
                    <li><a href="#">About</a></li>
                    <li><a href="#">Contact</a></li>
                    <li class="dropdown">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true"
                           aria-expanded="false">Dropdown <span class="caret"></span> </a>
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
            </div>
        </div>
    </nav>
    <nav class="nav navbar-inverse">
        <div class="container">
            <div class="navbar-header">
                <button type="button" class="navbar-toggle collapsed" data-toggle="collapse"
                        data-target=".navbar-collapse">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="#">Project name</a>
            </div>
            <div class="navbar-collapse collapse">
                <ul class="nav navbar-nav">
                    <li class="active"><a href="#">Home</a></li>
                    <li><a href="#">About</a></li>
                    <li><a href="#">Contact</a></li>
                    <li class="dropdown">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true"
                           aria-expanded="false">Dropdown <span class="caret"></span> </a>
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
            </div>
        </div>
    </nav>
    <%--end of Navbar--%>

    <%--Alert--%>
    <div class="page-header">
        <h1>Alerts</h1>
    </div>
    <div class="alert alert-success" role="alert">
        <strong>Well done!</strong> You successfully read this import alert message.
    </div>
    <div class="alert alert-info" role="alert">
        <strong>Heads up!</strong> THis alert needs you attention, but it's not super import.
    </div>
    <div class="alert alert-warning" role="alert">
        <strong>Warning!</strong> Best check youself, you're not looking too good.
    </div>
    <div class="alert alert-danger" role="alert">
        <strong>Oh snap!</strong> Change a few things up and try summitting again.
    </div>
    <%--end of Alert--%>

    <%--Progess bar--%>
    <div class="page-header">
        <h1>Progess bars</h1>
    </div>
    <div class="progress">
        <div class="progress-bar" role="progressbar" aria-valuenow="60" aria-valuemin="0" aria-valuemax="100"
             style="width: 60%;">
            <span>60% Complete (success)</span>
        </div>
    </div>
    <div class="progress">
        <div class="progress-bar progress-bar-success" role="progressbar" aria-valuenow="40" aria-valuemin="0"
             aria-valuemax="100"
             style="width: 40%;">
            <span>40% Complete (success)</span>
        </div>
    </div>
    <div class="progress">
        <div class="progress-bar progress-bar-info" role="progressbar" aria-valuenow="20" aria-valuemin="0"
             aria-valuemax="100"
             style="width: 20%;">
            <span>20% Complete (info)</span>
        </div>
    </div>
    <div class="progress">
        <div class="progress-bar progress-bar-warning" role="progressbar" aria-valuenow="60" aria-valuemin="0"
             aria-valuemax="100" style="width: 60%;">
            <span>60% Complete (warning)</span>
        </div>
    </div>
    <div class="progress">
        <div class="progress-bar progress-bar-danger" role="progressbar" aria-valuenow="80" aria-valuemin="0"
             aria-valuemax="100" style="width: 80%;">
            <span>80% Complete (success)</span>
        </div>
    </div>
    <div class="progress">
        <div class="progress-bar progress-bar-striped" role="progressbar" aria-valuenow="60" aria-valuemin="0"
             aria-valuemax="100" style="width: 60%;">
            <span>60% Complete (striped)</span>
        </div>
    </div>
    <div class="progress">
        <div class="progress-bar progress-bar-success" style="width: 35%;">
            <span>35% Complete (success)</span>
        </div>
        <div class="progress-bar progress-bar-warning" style="width: 20%;">
            <span>20% Complete (warning)</span>
        </div>
        <div class="progress-bar progress-bar-danger" style="width: 10%;">
            <span>10% Complete (danger)</span>
        </div>
    </div>
    <%--end of Progess bar--%>

    <%--List group--%>
    <div class="page-header">
        <h1>List groups</h1>
    </div>
    <div class="row">
        <div class="col-md-4">
            <ul class="list-group">
                <li class="list-group-item">Cras justo odio</li>
                <li class="list-group-item">Dapibus ac facilisis in</li>
                <li class="list-group-item">MOrbi leo risus</li>
                <li class="list-group-item">Porta ac consecteturac</li>
                <li class="list-group-item">Vestibulum at eros</li>
            </ul>
        </div>
        <div class="col-md-4">
            <div class="list-group">
                <a href="#" class="list-group-item active">Cras justo odio</a>
                <a href="#" class="list-group-item">Dapibus acfacilisis in</a>
                <a href="#" class="list-group-item">MOrbi leo risus</a>
                <a href="#" class="list-group-item">Porta ac consecteturac</a>
                <a href="#" class="list-group-item">Vestibulum at eros</a>
            </div>
        </div>
        <div class="col-md-4">
            <div class="list-group">
                <a href="#" class="list-group-item active">
                    <h4 class="list-group-item-heading">List group item heading</h4>
                    <p class="list-group-item-text">Donec id elit non mi porta gravida at eget metus. Maecenas sed diam
                        eget
                        risus varius blandit.</p>
                </a>
                <a href="#" class="list-group-item">
                    <h4 class="list-group-item-heading">List group item heading</h4>
                    <p class="list-group-item-text">Donec id elit non mi porta gravida at eget metus. Maecenas sed diam
                        eget
                        risus varius blandit.</p>
                </a>
                <a href="#" class="list-group-item">
                    <h4 class="list-group-item-heading">List group item heading</h4>
                    <p class="list-group-item-text">Donec id elit non mi porta gravida at eget metus. Maecenas sed diam
                        eget
                        risus varius blandit.</p>
                </a>
                <a href="#" class="list-group-item">
                    <h4 class="list-group-item-heading">List group item heading</h4>
                    <p class="list-group-item-text">Donec id elit non mi porta gravida at eget metus. Maecenas sed diam
                        eget
                        risus varius blandit.</p>
                </a>
            </div>
        </div>
    </div>
    <%--end of List group--%>

    <%--Panel--%>
    <div class="page-header">
        <h1>Pannls</h1>
    </div>
    <div class="row">
        <div class="col-md-4">
            <div class="panel panel-default">
                <div class="panel-heading">
                    <h3 class="panel-title">Pannel title</h3>
                </div>
                <div class="panel-body">
                    Panel content
                </div>
            </div>

            <div class="panel panel-primary">
                <div class="panel-heading">
                    <h3 class="panel-title">Pannel title</h3>
                </div>
                <div class="panel-body">
                    Panel content
                </div>
            </div>
        </div>

        <div class="col-md-4">
            <div class="panel panel-success">
                <div class="panel-heading">
                    <h3 class="panel-title">Pannel title</h3>
                </div>
                <div class="panel-body">
                    Panel content
                </div>
            </div>

            <div class="panel panel-info">
                <div class="panel-heading">
                    <h3 class="panel-title">Pannel title</h3>
                </div>
                <div class="panel-body">
                    Panel content
                </div>
            </div>
        </div>

        <div class="col-md-4">
            <div class="panel panel-warning">
                <div class="panel-heading">
                    <h3 class="panel-title">Pannel title</h3>
                </div>
                <div class="panel-body">
                    Panel content
                </div>
            </div>

            <div class="panel panel-danger">
                <div class="panel-heading">
                    <h3 class="panel-title">Pannel title</h3>
                </div>
                <div class="panel-body">
                    Panel content
                </div>
            </div>
        </div>
    </div>
    <%--end of Panel--%>

    <%--Well--%>
    <div class="page-header">
        <h1>Wells</h1>
    </div>
    <div class="well">
        <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Maecenas sed diam eget risus varius blandit sit amet
            non
            magna. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Praesent commodo cursus magna, vel
            scelerisque
            nisl consectetur et. Cras mattis consectetur purus sit amet fermentum. Duis mollis, est non commodo luctus,
            nisi
            erat porttitor ligula, eget lacinia odio sem nec elit. Aenean lacinia bibendum nulla sed consectetur.</p>
    </div>
    <%--end of Well--%>

    <%--Carousel--%>
    <div class="page-header">
        <h1>Carsouel</h1>
    </div>
    <div id="carousel-example-generic" class="carousel slide" data-ride="carousel">
        <ol class="carousel-indicators">
            <li data-target="#carousel-example-generic" data-slide-to="0" class="active"></li>
            <li data-target="#carousel-example-generic" data-slide-to="1"></li>
            <li data-target="#carousel-example-generic" data-slide-to="2"></li>
        </ol>
        <div class="carousel-inner" role="listbox">
            <div class="item active">
                <img src="/pic/submarine.jpg" alt="海底世界">
            </div>
            <div class="item">
                <img src="/pic/dog.jpg" alt="宠物狗">
            </div>
            <div class="item">
                <img src="/pic/waterfall.jpg" alt="瀑布">
            </div>
        </div>
        <a class="left carousel-control" href="#carousel-example-generic" role="button" data-slide="prev">
            <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
            <span class="sr-only">Previous</span>
        </a>
        <a class="right carousel-control" href="#carousel-example-generic" role="button" data-slide="next">
            <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
            <span class="sr-only">Next</span>
        </a>
    </div>
    <%--end of Carousel--%>
</div>
<%--/.container--%>
</body>
</html>
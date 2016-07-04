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
    <title>Grid Template for Bootstrap</title>

    <%--Bootstrap--%>
    <link href="/css/bootstrap.css" rel="stylesheet">
    <%--jQuery (necessary for Bootstrap's JavaScript plugins)--%>
    <script src="/js/jquery.js"></script>
    <%--Include all compiled plugins (below), or include individual --%>
    <script src="/js/bootstrap.js"></script>

    <%--Custom styles for this template--%>
    <link href="/css/bootstrap-test/grid.css" rel="stylesheet">

    <%--Custom javascripts for this template--%>

</head>

<body>
<div class="container">
    <div class="page-header">
        <h1>Bootstrap grid examples</h1>
        <p class="lead">Basic grid layouts to get you familiar with building within the Bootstrap grid system.</p>
    </div>

    <h3>Three equal columns</h3>
    <p>Get three equal-width columns <strong>starting at desktop and scaling to large desktops</strong>. On mobile
        devices, tablets and below, the columns will automatically stack.</p>
    <div class="row">
        <div class="col-md-4">.col-md4</div>
        <div class="col-md-4">.col-md4</div>
        <div class="col-md-4">.col-md4</div>
    </div>


    <h3>Three unequal columns</h3>
    <p>Get three columns <strong>starting at desktops and scaling to large desktops</strong> of various widths.
        Remember, grid columns should add up to twelve for a single horizontal block. More than that, and columns start
        stacking no matter the viewport.</p>
    <div class="row">
        <div class="col-md-3">.col-md-3</div>
        <div class="col-md-6">.col-md-6</div>
        <div class="col-md-3">.col-md-3</div>
    </div>

    <h3>Two columns</h3>
    <p>Get two columns <strong>starting at desktops and scaling to large desktops</strong>.</p>
    <div class="row">
        <div class="col-md-8">.col-md-8</div>
        <div class="col-md-4">.col-md-4</div>
    </div>


    <h3>Full width, single column</h3>
    <p class="text-warning">NO grid classes are necessary for full-width elements.</p>

    <hr>

    <h3>Two columns with two nested columns</h3>
    <p>Per the documentation, nesting is easy-just put a row of columns within an existing column. This gives you two
        columns <strong>starting at desktops and scaling to large desktops</strong>, with another two (equal widths)
        within the large column.</p>
    <p>At mobile device sizes, tablets and down, these columns and their nested columns will stack.</p>
    <div class="row">
        <div class="col-md-8">
            .col-md-8
            <div class="row">
                <div class="col-md-6">.col-md-6</div>
                <div class="col-md-6">.col-md-6</div>
            </div>
        </div>
        <div class="col-md-4">.col-md-4</div>
    </div>

    <h3>Mixed: mobile and desktop</h3>
    <p>The Bootstrap 3 grid system has four tiers of classes: xs (phones), sm (tablets), md (desktops) and lg (large
        desktops). You can use nearly any combination of these classes to create more dynamic and flexible layouts.</p>
    <p>Each tier of classes scales up, meaning if you plan on setting the same widths for xs and sm, you only need to
        specify xs.</p>

    <div class="row">
        <div class="col-xs-12 col-md-8">.col-xs-12 .col-md-8</div>
        <div class="col-xs-6 col-md-4">.col-xs-6 .col-md-4</div>
    </div>

    <div class="row">
        <div class="col-xs-6 col-md-4">.col-xs-6 .col-md-4</div>
        <div class="col-xs-6 col-md-4">.col-xs-6 .col-md-4</div>
        <div class="col-xs-6 col-md-4">.col-xs-6 .col-md-4</div>
    </div>


    <div class="row">
        <div class="col-xs-6">.col-xs-6</div>
        <div class="col-xs-6">.col-xs-6</div>
    </div>

    <hr>

    <h3>Mixed: mobile, tablet, and desktop</h3>
    <p></p>
    <div class="row">
        <div class="col-xs-12 col-sm-6 col-lg-8">.col-xs-12 .col-sm-6 .col-lg-8</div>
        <div class="col-xs-6 col-lg-4">.col-xs-6 .col-lg-4</div>
    </div>
    <div class="row">
        <div class="col-md-4 col-lg-8">.col-md-4 .col-lg-8</div>
        <div class="col-md-8 col-lg-4">.col-md-8 .col-lg-4</div>
    </div>
    <div class="row">
        <div class="col-xs-6 col-sm-4">.col-xs-6 .col-sm-4</div>
        <div class="col-xs-6 col-sm-4">.col-xs-6 .col-sm-4</div>
        <div class="col-xs-6 col-sm-4">.col-xs-6 .col-sm-4</div>
    </div>

    <h3>Column clearing</h3>
    <p><a href="http://getbootstrap.com/css/#grid-responsive-resets">Clear floats</a> at specific breakpoints to prevent
        awkward wrapping with uneven content. </p>
    <div class="row">
        <div class="col-xs-6 col-sm-3">
            .col-xs-6 .col-sm-3
            <br>
            Resize your viewport or check it out on you phone for an example.
        </div>
        <div class="col-xs-6 col-sm-3">.col-xs-6 .col-sm-3</div>
        <div class="clearfix visible-xs"></div>
        <div class="col-xs-6 col-sm-3">.col-xs-6 .col-sm-3</div>
        <div class="col-xs-6 col-sm-3">.col-xs-6 .col-sm-3</div>
    </div>

    <hr>
    <h3>Offset, push, and pull resets</h3>
    <p>Reset offsets, pushes, and pulls at specific breakpoints.</p>
    <div class="row">
        <div class="col-sm-5 col-md-6">.col-sm-5 .col-md-6</div>
        <div class="col-sm-5 col-sm-offset-2 col-md-6 col-md-offset-0">.col-sm-5 .col-sm-offset-2 .col-md-6
            .col-md-offset-0
        </div>
    </div>

    <div class="row">
        <div class="col-sm-6 col-md-5 col-lg-6">.col-sm-6 .col-md-5 .col-lg-6</div>
        <div class="col-sm-6 col-md-5 col-md-offset-2 col-lg-6 col-lg-offset-0">.col-sm-6 .col-md-5 .col-md-offset-2
            .col-lg-6 .col-lg-offset-0
        </div>
    </div>
</div>
</body>
</html>
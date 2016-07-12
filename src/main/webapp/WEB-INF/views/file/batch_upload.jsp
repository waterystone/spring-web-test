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
    <title>File Upload</title>

    <%--Bootstrap--%>
    <link href="/css/bootstrap.css" rel="stylesheet">
    <%--jQuery (necessary for Bootstrap's JavaScript plugins)--%>
    <script src="/js/jquery.js"></script>
    <script src="/js/bootstrap.js"></script>

    <%--Custom styles for this template--%>
    <%--Custom javascripts for this template--%>
    <script type="text/javascript">
        j = 1;
        $(document).ready(function () {

            $("#btn_add").click(function () {
                document.getElementById("newUpload").innerHTML += '<div id="div_' + j + '"><input  name="file_' + j + '" type="file"  /><input type="button" value="删除"  onclick="del_2(' + j + ')"/></div>';
                j = j + 1;
            });
        });


        function del_2(o) {
            document.getElementById("newUpload2").removeChild(document.getElementById("div_" + o));
        }

    </script>

</head>

<body>
<div class="container">

    <form action="/file/batchUpload" enctype="multipart/form-data" method="post">
        <div id="newUpload">
            <input type="file" name="file">
        </div>
        <input type="button" id="btn_add" value="增加一行">
        <input type="submit" value="上传">


    </form>
</div>


</body>
</html>
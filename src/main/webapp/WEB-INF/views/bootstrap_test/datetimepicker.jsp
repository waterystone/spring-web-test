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
    <title>Template for Bootstrap Datetimepicker</title>

    <%--Bootstrap--%>
    <link href="/css/bootstrap.css" rel="stylesheet">
    <link href="/css/bootstrap-datetimepicker.css" rel="stylesheet">
    <%--jQuery (necessary for Bootstrap's JavaScript plugins)--%>
    <script src="/js/jquery.js"></script>
    <script src="/js/bootstrap.js"></script>
    <script src="/js/bootstrap-datetimepicker.js"></script>
    <script src="/js/locales/bootstrap-datetimepicker.zh-CN.js"></script>

    <%--Custom styles for this template--%>

    <%--Custom javascripts for this template--%>
    <script type="text/javascript">
        $(document).ready(function () {
            $(".form-datetime").datetimepicker({
                language: "zh-CN",
                format: 'yyyy-mm-dd hh:ii',
                autoclose: true,
                todayBtn: true,
                todayHighlight: true,
                showMeridian: true,
                pickerPosition: "bottom-right",
                startView: 2,//0:hour;1:day;2:month;3:year;4:decade
                minView: 0,//日期时间选择器所能够提供的最精确的时间选择视图
                minuteStep: 1,
            });

            $(".form-date").datetimepicker({
                language: "zh-CN",
                format: 'yyyy-mm-dd',
                autoclose: true,
                todayBtn: true,
                todayHighlight: true,
                showMeridian: true,
                pickerPosition: "bottom-right",
                startView: 2,//0:hour;1:day;2:month;3:year;4:decade
                minView: 2,//日期时间选择器所能够提供的最精确的时间选择视图
            });

            $(".form-time").datetimepicker({
                language: "zh-CN",
                format: 'hh:ii:ss',
                autoclose: true,
                showMeridian: true,
                pickerPosition: "bottom-right",
                startView: 1,//0:hour;1:day;2:month;3:year;4:decade
                minView: 0,//日期时间选择器所能够提供的最精确的时间选择视图
                maxView: 1,
                minuteStep: 1,
            });
        });
    </script>

</head>

<body>
<div class="container">
    <div class="page-header">
        <h1>date</h1>
    </div>


    <form role="form">
        <div class="form-group">
            <label class="col-md-2 control-label">Datetime picking</label>
            <div class="input-group date form-datetime col-md-3">
                <input class="form-control" size="16" type="text" value="" readonly>
                <span class="input-group-addon"><span class="glyphicon glyphicon-remove"></span> </span>
                <span class="input-group-addon"><span class="glyphicon glyphicon-calendar"></span> </span>
            </div>
        </div>
        <div class="form-group">
            <label class="col-md-2 control-label">Date picking</label>
            <div class="input-group date form-date col-md-3">
                <input class="form-control" size="16" type="text" value="" readonly>
                <span class="input-group-addon"><span class="glyphicon glyphicon-remove"></span> </span>
                <span class="input-group-addon"><span class="glyphicon glyphicon-calendar"></span> </span>
            </div>
        </div>
        <div class="form-group">
            <label class="col-md-2 control-label">Time picking</label>
            <div class="input-group date form-time col-md-3">
                <input class="form-control" size="16" type="text" value="" readonly>
                <span class="input-group-addon"><span class="glyphicon glyphicon-remove"></span> </span>
                <span class="input-group-addon"><span class="glyphicon glyphicon-calendar"></span> </span>
            </div>
        </div>
    </form>


</div>


</body>
</html>
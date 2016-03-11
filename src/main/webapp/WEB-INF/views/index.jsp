<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<html>
<head>
<title>Index</title>
</head>
<body>
	<c:if test="${currentUser!=null}"> 
        你好：${currentUser.name} ,已成功登陆。
        <a href="<c:url value="/login/logout" />">注销</a>
	</c:if>
	<c:if test="${currentUser==null}"> 
        你好：你还未登陆，请登陆。
        <a href="<c:url value="/login" />">登陆</a>
	</c:if>
</body>
</html>

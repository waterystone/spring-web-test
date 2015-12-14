<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%
	boolean isLogin = false;
	String loginName = (String) request.getSession().getAttribute("_USER_INFO_LOGIN_NAME_");
	if (loginName != null && !"".equals(loginName)) {
		isLogin = true;
	}
	request.setAttribute("isLogin", isLogin);
	request.setAttribute("loginName", loginName);
%>

<html>
<head>
<title>Index</title>
</head>
<body>
	<c:if test="${isLogin}"> 
        你好：${loginName} ,已成功登陆。
        <a href="<c:url value="/login/logout" />">注销</a>
	</c:if>
	<c:if test="${!isLogin}"> 
        你好：你还未登陆，请登陆。
        <a href="<c:url value="/login" />">登陆</a>
	</c:if>
</body>
</html>

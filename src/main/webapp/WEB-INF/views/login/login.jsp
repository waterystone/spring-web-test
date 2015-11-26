<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<html>
<head>
<title>登陆</title>
</head>
<body>
	<form method="post" action="login/commit">
		<table>
			<tr>
				<td>用户名:</td>
				<td><input type="text" name="name" /></td>
				<!-- name要与User的属性名一致 -->
			</tr>
			<tr>
				<td>密码:</td>
				<td><input type="password" name="password" /></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" name="登陆" /></td>
				<td colspan="2"><input type="reset" name="重置" /></td>
			</tr>
		</table>
	</form>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<jsp:include page="/menu.jsp" />
	<h1>Login!</h1>
	<form action="login" method="post">
		<p>
			Username: <input type="text" name="uname">
		</p>
		<p>
			Password: <input type="password" name="pass">
		</p>
		<p>
			<input type="submit" value="Next">
		</p>
		<p style="color: red;">${error }</p>
	</form>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
		<%session.setAttribute("name","kamal"); 
// 		session.setMaxInactiveInterval(0);
		out.print(session.getAttribute("name"));
		%>
		<br><br>
		Click to get value of session in another page!
		<br>
		<h1><a href="GetSession.jsp">click</a></h1>
</body>
</html>
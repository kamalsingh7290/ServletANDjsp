<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<H1>This is our Jsp Page <H1>
<form action="NewFile.jsp" method="post">
<%request.setAttribute("naam", "kamal"); %>
	Name : <input type="text" name="fname"> 
	Id : <input type="text" name="id">
	<input type="submit">
	<%request.getRequestDispatcher("NewFile.jsp").include(request, response); %>
	</form>
</body>
</html>
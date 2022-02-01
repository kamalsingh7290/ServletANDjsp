<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
Value of session is: 
<%=session.getAttribute("name") %>
<br>
Session id is <%=session.getId() %>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>setAttribute에서 넘어온 값</h2>
<h3>Name : <%=request.getAttribute("name") %></h3>
<br />
<hr />
<h2>for m에서 넘어온 값</h2>
<h3>UserID : <%=request.getParameter("userid") %></h3>
<h3>Password : <%=request.getParameter("password") %></h3>
</body>
</html>
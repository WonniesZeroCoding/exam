<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% 
	//forward1.jsp 넘긴 값 가져오려고 할 때 ==> request.getParameter
	
	
	request.setAttribute("name", "홍길동");

	pageContext.forward("forward3.jsp");	
%>
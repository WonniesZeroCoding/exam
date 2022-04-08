<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%--removeAttribute("이름") : 특정 세션 값 삭제 --%> 
<%
	//특정 세션 삭제
	session.removeAttribute("name");
	//원래 있던 곳으로 돌아가기
	response.sendRedirect("sessionTest1.jsp");

%>
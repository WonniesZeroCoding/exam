<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%--
    jsp 페이지를 include 하는 두가지 방법
    1) include 지시어 사용
    	- 1)은 main.jsp 참고
    	- 컴파일 시점에 페이지를 합침
    2) pageContext 객체의 include 이용 
    	- 실행할 때 페이지를 합침
     --%>
<% pageContext.include("../header.jsp"); %>
<main>
	<h1>pageContext2 페이지</h1>
</main>
<% pageContext.include("../footer.jsp"); %>
<%@page import="book.dao.BookDAO"%>
<%@page import="java.sql.Connection"%>
<%@page import="book.dao.JdbcUtil"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	//delete.jsp에서 넘긴 값 가져오기 - code
	int code = Integer.parseInt(request.getParameter("code"));
	//db 작업
	Connection con = JdbcUtil.getConnection();
	BookDAO dao = new BookDAO(con);
	
	boolean result = dao.delete(code);
	//페이지 이동
	//성공 시, listPro.jsp / 실패 시, delete.jsp
	String path ="";
	if(result) {
		JdbcUtil.commit(con);
		path = "listPro.jsp";
		
	} else {
		JdbcUtil.rollback(con);
		path = "delete.jsp";
	}
	response.sendRedirect(path);
	JdbcUtil.close(con);
	
%>
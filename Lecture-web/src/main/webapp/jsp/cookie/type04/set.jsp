<%@page import="java.net.URLEncoder"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	Cookie c = new Cookie("type01", URLEncoder.encode("루트 설정", "utf-8"));
	c.setPath("/");
	c.setMaxAge(0);
	
	Cookie c2 = new Cookie("type02", 
			URLEncoder.encode("/Lecture-web/jsp/cookie/type02 설정", "utf-8"));
	c2.setPath("/Lecture-web/jsp/cookie/type02");
	c.setMaxAge(0);
	
	Cookie c3 = new Cookie("type03", 
			URLEncoder.encode("/Lecture-web/jsp/cookie/type03 설정", "utf-8"));
	c3.setPath("/Lecture-web/jsp/cookie/type03");
	c.setMaxAge(0);
	
	Cookie c4 = new Cookie("type04", 
			URLEncoder.encode("/Lecture-web/jsp/cookie/type04 설정", "utf-8"));
	c4.setPath("/Lecture-web/jsp/cookie/type04");
	c.setMaxAge(0);
	
	response.addCookie(c);
	response.addCookie(c2);
	response.addCookie(c3);
	response.addCookie(c4);
	
%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>쿠키 삭제 완료</h2>
	<a href="get.jsp">쿠키 확인</a>
</body>
</html>
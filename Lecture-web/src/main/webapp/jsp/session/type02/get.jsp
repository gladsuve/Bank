<%@page import="kr.ac.kopo.member.MemberVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
// 	String id = (String)session.getAttribute("id");
// 	String password = (String)session.getAttribute("password");

	MemberVO member = (MemberVO)session.getAttribute("member");
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%-- 	설정된 ID : <%= id %><br> --%>
<%-- 	설정된 ID : ${ sessionScope.id }<br> --%>
<%-- 	설정된 PASSWORD : ${ sessionScope.password }<br> --%>
	<%
		if(member != null) {
	%>
	설정된 ID : <%= member.getId() %><br>
	<%
		}
	%>
	설정된 ID : <%= member.getId() %><br>
	설정된 ID : ${ sessionScopr.member }<br>
	설정된 PASSWORD : ${ member.password }<br>
	<a href="remove.jsp"> 세션 삭제</a>
</body>
</html>
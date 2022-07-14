<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	1값을 가지는 변수 cnt 선언(page 공유영역)<br>
	<c:set var="cnt" value="1" />
	공유영경에 설정된 cnt변수 : ${ cnt }<br>
	<%-- <%
		int cnt = Integer.parseInt((String)pageContext.getAttribute("cnt"));
		++cnt;
		pageContext.setAttribute("cnt", cnt);
	%> --%>
	
	<c :set var="cnt" value="${ cnt+1 }" scope = "request"/>
	cnt에 1증가한 값 : ${ cnt }<br>
	request cnt : ${ requsetScope.cnt }<br>
</body>
</html>
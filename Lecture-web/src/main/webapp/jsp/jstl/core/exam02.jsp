<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	value 속성만 지정 : <c:out value="hello JSTL..."/><br>
	el msg : ${ msg }<br>
	<%-- <%
		if(pageContext.getAttribute("msg") == null) {
			out.prin("msg 변수를 찾을 수 없음");
		}
	%> --%>
	msg : <c:out value="${ msg }" default="msg 변수 찾을 수 없음"/><br>
	escapeXML = true 설정<br>
	<c:set var="msg" value="<em>hello...</em><hr>"/>
	<c:out value="${ msg }"/>
	escapeXML = false 설정<br>
	<c:out value="${ msg }" escapeXML="false"/>
	${ msg }<br>
</body>
</html>
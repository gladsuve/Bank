<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<%
	String[] names = {"홍길동", "강길동", "윤길동", "박길동"};

	pageContext.setAttribute("names", names);
	pageContext.setAttribute("length", names.length-1);
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	이름배열의 개수 : ${ fn:length(names) }<br>
	<c:forEach items="${ names }" var="name" varStatus="loop">
		<c:if test="${ not loop.first }">
		,
		</c:if>
		${ name }
	
	</c:forEach>
	<c:forEach items="${ names }" var="name" varStatus="loop">
		${ loop.first } : ${ loop.last } : ${ loop.index } : ${ loop.count }<br>
	</c:forEach>





	<c:set var="cnt" value="1"/>
	<c:forEach items="${ names }" var="name">
		<c:if test="${ cnt ne 1 }">
		,</c:if>
		${ name }
	<c:set var="cnt" value="${ cnt+1 }"/>
	</c:forEach>
	<c:remove var="cnt" scope="page"/><br>
	





	<c:forEach begin="0" end="${ length }" var="i">
<%-- 		<c:if test="${ i ne 0 }">
		,
		</c:if> --%>
		
		${ names[i] }
	<c:if test="${ i ne length }">,</c:if>		
	</c:forEach>

	<c:forEach items="${ names }" var="name">
	${ name }
	</c:forEach>



	<h2>1 ~ 10 사이의 정수 출력</h2>
	<c:forEach begin="1" end="10" var="i">
		${ i }
	</c:forEach>
	<br>
	년도선택 : 
	<select>
		<c:forEach begin="1970" end="2022" var="year">
		<option>${ year }</option>
		</c:forEach>

	</select>
</body>
</html>
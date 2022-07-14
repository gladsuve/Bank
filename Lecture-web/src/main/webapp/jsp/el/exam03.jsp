<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<% 
	/*
		객체등록 : 공유영역.satAttribute("이름", 값);
		JSP 공유영역 4가지 : pageContext, request, session, application
	*/
	
	pageContext.setAttribute("msg", "pageContext 영역에 등록완료");

	
	// "id"라는 이름으로 "홍길동"값을 가진 객체 등록
	
	pageContext.setAttribute("id", "홍길동");
	
	request.setAttribute("msg", "request 영역에 등록완료");
	pageContext.setAttribute("length", "request 영역에 등록완료".length());
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%--
		EL 공유영역 4가지 : pageScope, requestScope, sessionScope, applicationScope
	
	 --%>
	 empty msg : ${ empty msg }<br>	
	 msg : <%= pageContext.getAttribute("msg") %><br>
	 el msg : ${ pageScope.msg }<br>
	 el msg : ${ msg }<br> <!-- pageScope가 제일 앞이기 때문에 생략 가능 -->
	 el id : ${ id }<br>
	 
	 request msg : ${ requestScope.msg }<br>
	 request msg length : <%= ((String)request.getAttribute("msg")).length() %><br>
	 el length : ${ length }<br>
</body>
</html>
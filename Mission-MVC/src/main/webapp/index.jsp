<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<a href="${ pageContext.request.contextPath }/board/list.do">게시판</a><br>
	<a href="${ pageContext.request.contextPath }/board/writeForm.do">새글등록</a><br>
	<a href="${ pageContext.request.contextPath }/login.do">로그인</a>
</body>
</html>
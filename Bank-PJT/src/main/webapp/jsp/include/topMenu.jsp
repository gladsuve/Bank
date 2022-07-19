<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="/Bank-PJT/resource/css/styles.css">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor" crossorigin="anonymous"></script>
</head>
<body>
      <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
            <div class="container px-5">
                <a class="navbar-brand" href="/Bank-PJT/index.jsp">JH BANK</a>
                <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation"><span class="navbar-toggler-icon"></span></button>
                <div class="collapse navbar-collapse" id="navbarSupportedContent">
                    <ul class="navbar-nav ms-auto mb-2 mb-lg-0">
                        <li class="nav-item"><a class="nav-link active" aria-current="page" href="/Bank-PJT/index.jsp">Home</a></li>
                        <li class="nav-item"><a class="nav-link" href="#">오픈뱅킹</a></li>
                        <li class="nav-item"><a class="nav-link" href="jsp/board/list.jsp">게시판</a></li>
                        <c:choose>				 	
				 			<c:when test="${ empty user }">
				 			<li class="nav-item"><a class="nav-link" href="${ pageContext.request.contextPath }/login.do">로그인</a><li>
				 			<li class="nav-item"><a class="nav-link" href="${ pageContext.request.contextPath }/signup.do">회원가입</a></li>
				 			</c:when>
				 			<c:otherwise>
				 			<li class="nav-item"><a class="nav-link" href="${ pageContext.request.contextPath }/accList.do">계좌조회</a><li>
				 			<li class="nav-item"><a class="nav-link" href="/Bank-PJT/jsp/login/logout.jsp">로그아웃</a><li>
				 			</c:otherwise>
				 			
				 		</c:choose>
     
           
                    </ul>
                </div>
            </div>
        </nav>
       
</body>
</html>
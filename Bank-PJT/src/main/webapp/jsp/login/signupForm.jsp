<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="/jsp/include/topMenu.jsp"></jsp:include>

<form action="${ pageContext.request.contextPath }/signupProcess.do" method="post"
			name="loginForm">
				<table style="width : 10%">
					<tr>
						<th>ID</th>
						<td><input type="text" name="id"></td>
					</tr>
					<tr>
						<th>PASSWORD</th>
						<td><input type="password" name="pwd"></td>
					</tr>
				</table>
				<input type="submit" value="회원가입">
			</form>

<jsp:include page="/jsp/include/footer.jsp"></jsp:include>
</body>
</html>
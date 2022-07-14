<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인</title>
<link rel="stylesheet" href="/Mission-web/resource/css/layout.css">
<link rel="stylesheet" href="/Mission-web/resource/css/table.css">
<script src="/Mission-web/resource/lib/myJs.js"></script>
<script>
	
/* 	function isNull(obj, msg) {
		if(odj.value==''){
			alert(msg)
			obj.focus()
			return true
		}
		return false
	} */




	function checkForm(){
		
		let f = document.loginForm
		
		if(isNull(f.id, "아이디를 입력하세요") || isNull(f.password, "패스워드를 입력하세요"))
			return false
// 		isNull(f.password)
		
		if(f.id.value == ''){
			alert('아이디를 입력하세요')
			f.id.focus()
			return false;
		}
		
		if(f.password.value == ''){
			alert('비밀번호를 입력하세요')
			f.password.focus()
			return false;
		}
		
		
		return true;
	}

</script>
</head>
<body>
	<header>
		<jsp:include page="/jsp/include/topMenu.jsp"></jsp:include>
	</header>
	<section>
		<div align="center">
			<hr>
				<h2>로그인</h2>
			<hr>
			<br>
			<form action="${ pageContext.request.contextPath }/loginProcess.do" method="post"
			onsubmit="return checkForm()" name="loginForm">
				<table style="width : 10%">
					<tr>
						<th>ID</th>
						<td><input type="text" name="id"></td>
					</tr>
					<tr>
						<th>PASSWORD</th>
						<td><input type="password" name="password"></td>
					</tr>
				</table>
				<input type="submit" value="로그인">
			</form>
		</div>
	</section>
	<footer>
		<%@ include file="/jsp/include/footer.jsp" %>
	</footer>

</body>
</html>
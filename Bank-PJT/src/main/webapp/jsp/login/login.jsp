<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인</title>
<link rel="stylesheet" href="/Bank-PJT/resource/css/styles.css">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor" crossorigin="anonymous"></script>
<script src="/Mission-web/resource/lib/myJs.js"></script>
<script src="//developers.kakao.com/sdk/js/kakao.min.js"></script>
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
			<form action="loginProcess.jsp" method="post"
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
			
			
		<a id="kakao-login-btn"></a><br>
    	<a href="http://developers.kakao.com/logout">Logout</a>
    		<script type='text/javascript'>
        	//<![CDATA[
        	// 사용할 앱의 JavaScript 키를 설정해 주세요.
        Kakao.init('57b67e8948a779c9f529a3c7df8d6029');
        // 카카오 로그인 버튼을 생성합니다.
        Kakao.Auth.createLoginButton({
            container: '#kakao-login-btn',
            success: function (authObj) {
                alert(JSON.stringify(authObj));
            },
            fail: function (err) {
                alert(JSON.stringify(err));
            }
        });
    		</script>
			
			
			
		</div>
	</section>
	<footer>
		<%@ include file="/jsp/include/footer.jsp" %>
	</footer>

</body>
</html>
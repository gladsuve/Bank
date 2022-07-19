<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="/Bank-PJT/resource/css/signup.css">
<script type="text/javascript">
function test(){
	
	if(submit.id.value ==""||submit.id.value.length == 0){
		alert("아이디를 입력하세요");
		submit.id.focus();
		return false
		
		}
	if(submit.pwd.value==""||submit.pwd.values.length == 0){
		alert("비밀번호를 입력하세요");
		submit.Pwd.focus();
		return false;
	}
	
	if(submit.pwd2.value==""||submit.pwd2.values.length == 0){
		alert("비밀번호를 한번 더 입력하세요");
		submit.Pwd2.focus();
		return false;
	}
	
	if(submit.pwd.value !="" && submit.pwd2.value != ""){
		if(submit.pwd.value != submit.pwd2.value){
			alert("비밀번호가 일치하지 않습니다");
			return false;
		}
	}
	if(submit.name.value==""||submit.name.values.legnth == 0){
		alert("이름을 입력해주세요");
		return false;
	}
	if(submit.email.value==""||submit.email.values.legnth == 0){
		alert("이메일을 입력해주세요");
		return false;
	}
	if(submit.phone.value==""||submit.phone.values.legnth == 0){
		alert("전화번호를 입력해주세요");
		return false;
	}
	if(submit.addr.value==""||submit.addr.values.legnth == 0){
		alert("주소를 입력해주세요");
		return false;
	}
	
	alert("회원 가입에 성공했습니다")
	return true;
		
}	
</script>









</head>
<body>
<jsp:include page="/jsp/include/topMenu.jsp"></jsp:include>


	<div class="container col-lg-3">
		<div class="col-lg-12 margin-auto" >
			<div class="jumbotron" style="padding-top: 20px;">
			<form action="${ pageContext.request.contextPath }/signupProcess.do" method="post"
			name="loginForm" onsubmit="return test()">
					<h3 style="text-align: center;">회원가입 화면</h3>
					<div class="form-group">
						<input type="text" class="form-control" placeholder="아이디" name="id" maxlength="20" required>
					</div>
					<div class="form-group">
						<input type="password" class="form-control" placeholder="비밀번호" name="pwd" maxlength="20" required>
					</div>
					<div class="form-group">
						<input type="password" class="form-control" placeholder="비밀번호 확인" name="pwd2" maxlength="20" required>
					</div>
					<div class="form-group">
						<input type="text" class="form-control" placeholder="이름" name="name" maxlength="20" required>
					</div>
					<div class="form-group">
						<input type="email" class="form-control" placeholder="이메일" name="email" maxlength="20" required>
					</div>
					<div class="form-group">
						<input type="text" class="form-control" placeholder="전화번호" name="phone" maxlength="50" required>
					</div>
					<div class="form-group">
						<input type="text" class="form-control" placeholder="주소" name="addr" maxlength="200" required>
					</div>
					<div class="form-group">
						<input type="submit" class="btn btn-dark form-control padding-10px;"  value="회원가입">
					</div>
				</form>
			</div>
		</div>
		<div class="col-lg-4"></div>
	</div>

<jsp:include page="/jsp/include/footer.jsp"></jsp:include>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<link rel="stylesheet" href="/Bank-PJT/resource/css/styles.css">
<link rel="stylesheet" href="/Bank-PJT/resource/css/signup.css">
</head>
<body>
<jsp:include page="/jsp/include/topMenu.jsp"></jsp:include>


	<div class="container col-lg-3">
		<div class="col-lg-12 margin-auto" >
			<div class="jumbotron" style="padding-top: 20px;">
			<form action="${ pageContext.request.contextPath }/transferProcess.do" method="post"
			name="transferForm" onsubmit="return test()">
					<h3 style="text-align: center;">계좌이체</h3>
													
					
					<div class="form-group">	
							<input type="text" class="form-control" value="9" name="sendBankCode" maxlength="20" required readonly/>	
					</div>
													
													
					<div class="form-group">	
							<input type="text" class="form-control" value="${ account_number }" name="sendAccountNum" id="sendAccountNum" maxlength="20" required readonly/>	
					</div>

					<div class="form-group">
						<select class="form-control" name="bankCode" id="bankCode" maxlength="20" required>
							<option selected="">입금은행</option>
							<option value="9">JH_BANK</option>
							<option value="2">BK_BANK</option>
							<option value="20">J_INVESTMENT_BANK</option>
							<option value="14">BERRY_BANK</option>
						</select>
					</div>
					<div class="form-group">
						<input type="text" class="form-control" name ="receiveAccountNum" id="receiveAccountNum" placeholder="입금계좌" maxlength="50" required>
					</div>
					<div class="form-group">
						<input type="number" class="form-control" name = "transferAmount" id = "transferAmount" placeholder="송금액" maxlength="200" required>
					</div>
					<div class="form-group">
						<input type="password" class="form-control" name="accountPassword" id = "accountPassword" placeholder="비밀번호" name="pwd" maxlength="20" required>
					</div>
					<div class="form-group">
						<input type="submit" class="btn btn-dark form-control padding-10px;"  value="이체하기">
					</div>
				</form>
			</div>
		</div>
		<div class="col-lg-4"></div>
	</div>

<jsp:include page="/jsp/include/footer.jsp"></jsp:include>

</body>
</html>
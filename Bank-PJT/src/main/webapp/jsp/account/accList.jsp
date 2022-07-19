<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>계좌 조회</title>
<link rel="stylesheet" href="/Bank-PJT/resource/css/styles.css">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor" crossorigin="anonymous"></script>

<link rel="stylesheet" href="/Bank-PJT/resource/css/signup.css">
</head>
<body>
<jsp:include page="/jsp/include/topMenu.jsp"></jsp:include>

<!--                     <div class="col-lg-4 mb-5 mb-lg-0"> -->
<!--                         <div class="feature bg-primary bg-gradient text-white rounded-3 mb-3"><i class="bi bi-collection"></i></div> -->
<!--                         <h2 class="h4 fw-bolder">Featured title</h2> -->
<!--                         <p>Paragraph of text beneath the heading to explain the heading. We'll add onto it with another sentence and probably just keep going until we run out of words.</p> -->
<!--                         <a class="text-decoration-none" href="#!"> -->
<!--                             Call to action -->
<!--                             <i class="bi bi-arrow-right"></i> -->
<!--                         </a> -->
<!--                     </div> -->
                    
 <section class="py-5 border-bottom" id="accList">
            <div class="container px-5 my-5">
                <div class="row gx-5">
                    <c:forEach items="${ list }" var="account" varStatus="loop">
	                    <div class="col-lg-4 mb-5 mb-lg-0">
	                       
	                        <h4> ${ account.bank_alias }</h4>
	                        <h4> ${ account.account_number }</h4>
	                        <h4>잔액 : ${ account.balance }원</h4>
	                        <a class="text-decoration-none" href="${ pageContext.request.contextPath }/transfer.do?account_number=${ account.account_number }" >
	                            이체하기
	                            <i class="bi bi-arrow-right"></i>
	                        </a>
	                        <a class="text-decoration-none" href="#!">
	                            내역보기
	                            <i class="bi bi-arrow-right"></i>
	                        </a>
	                    </div>
                    </c:forEach>
<%--                        <div class="col-lg-4 mb-5 mb-lg-0">
                       
                        <c:forEach items="${ list }" var="account" varStatus="loop">
                        <h4> ${ account.bank_alias }</h4>
                        <h4> ${ account.account_number }</h4>
                        <h4>잔액 : ${ account.balance }원</h4>
                        </c:forEach>
                        <a class="text-decoration-none" href="${ pageContext.request.contextPath }/transfer.do">
                            이체하기
                            <i class="bi bi-arrow-right"></i>
                        </a>
                        <a class="text-decoration-none" href="#!">
                            내역보기
                            <i class="bi bi-arrow-right"></i>
                        </a>
                    </div> --%>
                    
                   
                </div>
            </div>
        </section>


<jsp:include page="/jsp/include/footer.jsp"></jsp:include>
</body>
</html>
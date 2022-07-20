<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>내역 조회</title>
</head>
<body>
<header>
		<jsp:include page="/jsp/include/topMenu.jsp"></jsp:include>
	</header>
<%--
	url : http://localhost:9999/Mission-web/jsp/board/list.jsp
 --%>
 	<section>
 	<div align="center">
 		<hr>
 		<h1>내역조회</h1>
		<hr>
		<br>
		<table border="1" style="width:80%">
			<tr>
				<th width="7%">번호</th>
				<th>이체</th>
				<th width="16%"></th>
				<th width="20%">등록일</th>
			</tr>
			<c:forEach items="${ list }" var="transaction" varStatus="loop">
			<tr <c:if test="${ loop.count mod 2 eq 0 }" >class="even"</c:if>>
				<td>${ transaction.tran_num }</td>
				<td>
					<a href="javascript:checkLogin(${ board.no })">
						<c:out value= "${ board.title }"/>
					</a>
				
			<%-- 	<a href="detail.jsp?no=${ board.no }"><c:out value= "${ board.title }"/></a> --%>
				</td>
				<td>${ board.writer }</td>
				<td>${ board.regDate }</td>
			</tr>
			
			</c:forEach>
			
			
			
			<%-- <tr>
			<%
				while(rs.next()){
					int no = rs.getInt("no");
					String title = rs.getString("title");
					String writer = rs.getString("writer");
					String reg_date = rs.getString("reg_date");
			%>		
				<tr>
					<th><%= no %></th>
					<th><a href="detail.jsp?no=<%=no%>"><%= title %></a></th>
					<th><%= writer %></th>
					<th><%= reg_date %></th>
				</tr>
			<% 	
				}
			%>
			</tr> --%>
		</table><br>
		<c:if test="${ not empty user }">
		<button id="add">새글등록</button>
		</c:if>
	<!-- 	<button id="update">글수정</button>
		<button id="delete">글삭제</button>
		<button id="list">글목록</button> -->
 	</div>
 	
 	</section>
	<footer>
		<%@ include file="/jsp/include/footer.jsp" %>
	</footer>
</body>
</html>
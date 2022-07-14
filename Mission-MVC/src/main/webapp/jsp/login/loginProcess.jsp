b<%@page import="kr.ac.kopo.member.dao.MemberDao"%>
<%@page import="kr.ac.kopo.member.vo.MemberVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("utf-8");

	String id = request.getParameter("id");
	String password = request.getParameter("password");
	
	MemberVO memberVO = new MemberVO();
	memberVO.setId(id);
	memberVO.setPassword(password);
	
	MemberDao dao = new MemberDao();
	MemberVO userVO = dao.login(memberVO);

	String msg = "";
	String url = ""; 
	if(userVO == null) {
		//로그인 실패
		msg = "아이디 또는 패스워드를 잘못입력했습니다.";
		url = "login.jsp";
	} else {
		//로그인 성공
		switch(userVO.getType()) {
		case "S":
			msg = "관리자님 환영합니다.";
			break;
		case "U":
			msg = userVO.getId() + "님 환영합니다.";
			break;
		}
// 		msg = "로그인을 성공했습니다.";
		url = "/Bank-PJT";
		
		// 세션등록
		session.setAttribute("userVO", userVO);
	}
		
		pageContext.setAttribute("msg", msg);
		pageContext.setAttribute("url", url);
%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script>
	alert('${ msg }');
	location.href = '${ url }';
</script>
</head>
<body>

</body>
</html>
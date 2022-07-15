b<%@page import="kr.ac.kopo.member.vo.SignUpVO"%>
<%@page import="kr.ac.kopo.member.dao.MemberDAO"%>
<%@page import="kr.ac.kopo.member.vo.MemberVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
request.setCharacterEncoding("utf-8");

	String id = request.getParameter("id");
	String pwd = request.getParameter("pwd");
	
	SignUpVO userVO = new SignUpVO();
	userVO.setId(id);
	userVO.setPwd(pwd);
	
	MemberDAO dao = new MemberDAO();
	SignUpVO user = dao.login(userVO);

	String msg = "";
	String url = ""; 
	if(userVO == null) {
		//로그인 실패
		msg = "아이디 또는 패스워드를 잘못입력했습니다.";
		url = "login.jsp";
	} else {
		//로그인 성공
	
		msg = "로그인을 성공했습니다.";
		url = "/Bank-PJT/index.jsp";
		
		// 세션등록
		session.setAttribute("user", user);
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
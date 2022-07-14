package kr.ac.kopo.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


// @WebServlet("/exam") xml과 .java에서 동시에 경로설정을 할 수 없음(하게될 경우 한 쪽은 반드시 주석처리 해야한다!!) 
public class PInfoServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {

		request.setCharacterEncoding("utf-8");
		
		String name = request.getParameter("name");
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		String gender = request.getParameter("gender");
		String notemail = request.getParameter("notemail");
		String advmail = request.getParameter("advmail");
		String devmail = request.getParameter("devmail");
		String job = request.getParameter("job");

		// getParameterValues: 같은 parameter에서 복수의 값을 가지고 오고 싶은 경우 사용(string 배열 값 반환)
		
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		
		out.println("<html>");
		out.println("	<head>");
		out.println("		<title>메소드 요청방식</title>");
		out.println("	</head>");
		out.println("	<body>");
		out.println("		<div align='center'>");
		out.println("	<h2>개인 정보 출력 </h2> " + "<br>");
		out.println("	이름 : " + name + "<br>");
		out.println("	아이디 : " + id + "<br>");
		out.println("	비밀번호 : " + password + "<br>");	
		out.println("	성별 : " + gender + "<br>");	
		out.println("	공지 메일 : ");	
		if(notemail == null) {
			out.println("받지않음");
		} else {
			out.println("받음");
		}
		out.println("<br>");
		out.println("	광고 메일 : ");	
		if(advmail == null) {
			out.println("받지않음");
		} else{
			out.println("받음");
		}
		out.println("<br>");
		out.println("	배송 확인 메일 : ");	
		if(devmail == null) {
			out.println("받지않음");
		} else {
			out.println("받음");
		}
		out.println("<br>");

		out.println("	직업 : " + job + "<br>");	
		out.println("<br>");
		out.println("		</div>");
		out.println("	</body>");
		out.println("</html>");
		
	}
	
	

}

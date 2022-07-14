package kr.ac.kopo.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


// @WebServlet("/exam") xml과 .java에서 동시에 경로설정을 할 수 없음(하게될 경우 한 쪽은 반드시 주석처리 해야한다!!) 
public class ExamServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {

		String method = request.getMethod();
		String uri = request.getRequestURI();
		String name = request.getParameter("name");
		String[] hobby = request.getParameterValues("hobby");
		// getParameterValues: 같은 parameter에서 복수의 값을 가지고 오고 싶은 경우 사용(string 배열 값 반환)
		
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		
		out.println("<html>");
		out.println("	<head>");
		out.println("		<title>메소드 요청방식</title>");
		out.println("	</head>");
		out.println("	<body>");
		out.println("	이름 : " + name + "<br>");
		out.println("	취미 : " );
		for(int i = 0; i < hobby.length; i++) {
			out.println(hobby[i] + "&nbsp;&nbsp;");
		}
		out.println("<br>");
		out.println("	</body>");
		out.println("</html>");
		
	}
	
	

}

package kr.ac.kopo.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import kr.ac.kopo.login.vo.LoginVO;

public class SignUpProcessController implements Controller {

	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		
		request.setCharacterEncoding("utf-8");
		
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		
		if(id.equals("user") && password.equals("user")) {
			//로그인성공
			
			LoginVO userVO = new LoginVO();
			userVO.setId(id);
			userVO.setPassword(password);
			userVO.setName("홍길동");
			userVO.setType("U");
			
			// 세션등록
			HttpSession session = request.getSession();
			session.setAttribute("userVO", userVO);
			
			
			
			return "redirect:";
		}
		// 로그인 실패
		return "redirect:/login.do";
		
		
		
		
		
		
		
		
		
		return null;
	}

}

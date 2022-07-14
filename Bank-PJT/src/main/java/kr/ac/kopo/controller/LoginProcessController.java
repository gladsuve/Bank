package kr.ac.kopo.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import kr.ac.kopo.member.vo.MemberTestVO;

public class LoginProcessController implements Controller {

	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {

		request.setCharacterEncoding("utf-8");
		
		String id = request.getParameter("id");
		String pwd = request.getParameter("pwd");
		

			
			MemberTestVO userVO = new MemberTestVO();
			userVO.setId(id);
			userVO.setPwd(pwd);
	
			
			// 세션등록
			HttpSession session = request.getSession();
			session.setAttribute("userVO", userVO);
			
			

		// 로그인 실패
		return "redirect:/login.do";
	}

}

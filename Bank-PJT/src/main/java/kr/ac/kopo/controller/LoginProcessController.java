package kr.ac.kopo.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import kr.ac.kopo.member.dao.MemberDAO;
import kr.ac.kopo.member.vo.SignUpVO;

public class LoginProcessController implements Controller {

	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {

		request.setCharacterEncoding("utf-8");
		
		String id = request.getParameter("id");
		String pwd = request.getParameter("pwd");
		

			
			SignUpVO userVO = new SignUpVO();
			userVO.setId(id);
			userVO.setPwd(pwd);
	
			MemberDAO dao = new MemberDAO();
			SignUpVO user = dao.login(userVO);
			
			if(user != null) {
				
				// 세션등록
				HttpSession session = request.getSession();
				session.setAttribute("user", user);
				return "redirect:/";
			}
			
			
			
	
			// 로그인 실패
			return "redirect:/list.do";
	}

}

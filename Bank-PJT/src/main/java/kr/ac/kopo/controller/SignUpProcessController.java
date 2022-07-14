package kr.ac.kopo.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import kr.ac.kopo.member.service.SignUpService;
import kr.ac.kopo.member.vo.MemberTestVO;

public class SignUpProcessController implements Controller {

	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		
		request.setCharacterEncoding("utf-8");
		
		String id = request.getParameter("id");
		String pwd = request.getParameter("pwd");
		
		
	
			
			MemberTestVO userVO = new MemberTestVO();
			userVO.setId(id);
			userVO.setPwd(pwd);
			
			SignUpService service = new SignUpService();
			service.addMember(userVO);
			
			// 세션등록
			HttpSession session = request.getSession();
			session.setAttribute("userVO", userVO);
			
			
			

		return "redirect:/login.do";
		
		
		
		
		
		
		
		
	
	}

}

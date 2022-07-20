package kr.ac.kopo.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import kr.ac.kopo.account.service.AccListService;
import kr.ac.kopo.account.vo.AccountVO;
import kr.ac.kopo.member.vo.SignUpVO;

public class AccountListController implements Controller {

	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
	
		HttpSession session = request.getSession();
		AccListService service = new AccListService();
		
		SignUpVO user = (SignUpVO)session.getAttribute("user");
		String phone_number = user.getPhone();
		
		List<AccountVO> list = service.selectAcc();
//		System.out.println(list);
		request.setAttribute("list", list);
		session.setAttribute("list", list);
		
		List<AccountVO> list_jh = service.selectJhBank(phone_number);
//		System.out.println(list);
		request.setAttribute("list_jh", list_jh);
		session.setAttribute("list_jh", list_jh);
		
		List<AccountVO> list_bk = service.selectBkBank(phone_number);
//		System.out.println(list);
		request.setAttribute("list_bk", list_bk);
		session.setAttribute("list_bk", list_bk);
		
		List<AccountVO> list_jb = service.selectJbBank(phone_number);
//		System.out.println(list);
		request.setAttribute("list_jb", list_jb);
		session.setAttribute("list_jb", list_jb);
		
		
		
		
		
		
		return "/jsp/account/accList.jsp";
	}

}

package kr.ac.kopo.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import kr.ac.kopo.account.service.AccListService;
import kr.ac.kopo.account.vo.AccountVO;

public class AccountListController implements Controller {

	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
	
		AccListService service = new AccListService();
		List<AccountVO> list = service.selectAcc();
		System.out.println(list);
		request.setAttribute("list", list);
		HttpSession session = request.getSession();
		session.setAttribute("list", list);
		
		return "/jsp/account/accList.jsp";
	}

}

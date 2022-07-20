package kr.ac.kopo.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import kr.ac.kopo.account.service.AccountService;
import kr.ac.kopo.account.vo.AccountVO;

public class AccountProcessController implements Controller {

	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		request.setCharacterEncoding("utf-8");
		
		String phone = request.getParameter("phone_number");
		String num = request.getParameter("account_number");
		String pwd = request.getParameter("account_password");
		String code = request.getParameter("bank_code");
		String regdate = request.getParameter("bank_reg_date");
//		int balance = Integer.parseInt(request.getParameter("acc_balance"));
		String alias = request.getParameter("bank_alias");
		
	
			
			AccountVO acc = new AccountVO();
			acc.setPhone_number(phone);
			acc.setAccount_number(num);
			acc.setAccount_password(pwd);
			acc.setBank_code(code);
			acc.setBank_reg_date(regdate);
//			acc.setAcc_balance(balance.toString());
			acc.setBank_alias(alias);
		
			
			
			
			AccountService service = new AccountService();
			service.addAccount(acc);
			
			// 세션등록
			HttpSession session = request.getSession();
			session.setAttribute("acc", acc);
			
			
			
//
		return "/jsp/account/accList.jsp";
		
	}

}

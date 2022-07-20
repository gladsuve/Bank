package kr.ac.kopo.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import kr.ac.kopo.account.service.TransactionService;
import kr.ac.kopo.account.vo.TransactionVO;
import kr.ac.kopo.member.vo.SignUpVO;

public class TransactionProcessController implements Controller {

	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		request.setCharacterEncoding("utf-8");
		
		
		
		HttpSession session = request.getSession();
		SignUpVO userVO =(SignUpVO) session.getAttribute("user");
		
		
		String bankCode  =request.getParameter("bankCode");
		String receivceAcocuntNum  =request.getParameter("receiveAccountNum");
		int transferAmount = Integer.parseInt(request.getParameter("transferAmount"));
		System.out.println(transferAmount);
		String acccountPassword  =request.getParameter("accuntPassword");
		String sendAccountNum  =request.getParameter("sendAccountNum");
		String sendBankCode  =request.getParameter("sendbankCode");
		
		
		String PhoneNumber = userVO.getPhone();
		System.out.println(PhoneNumber);
		
		TransactionVO transactionVO = new TransactionVO();
		transactionVO.setDeposit_account_num(PhoneNumber);
		transactionVO.setPhone_number(PhoneNumber);
		transactionVO.setTran_amount(transferAmount);
		transactionVO.setDeposit_bank_code(bankCode);
		transactionVO.setWithrawal_bank_code(sendBankCode);
		transactionVO.setWithrawal_accout_num(sendAccountNum);

		
		
		
		
		TransactionService service = new TransactionService();
		List<TransactionVO> transactionList = service.transactionList(PhoneNumber);
		
		System.out.println(transactionList);
	
		
		request.setAttribute("transactionList", transactionList);
		
		
		return "/jsp/account/detail.jsp";
		
		
			

		
		
			
			
			
//			TransactionService service = new TransactionService();
//			service.transaction(trans);
//			
//			// 세션등록
//			HttpSession session = request.getSession();
//			session.setAttribute("trans", trans);
		
		
	}

}

package kr.ac.kopo.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import kr.ac.kopo.account.service.AccountService;
import kr.ac.kopo.account.service.TransactionService;
import kr.ac.kopo.account.vo.TransactionVO;
import kr.ac.kopo.member.vo.SignUpVO;

public class TransferProcessController implements Controller {

	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {

		request.setCharacterEncoding("utf-8");
		
		String sendAccountNum = request.getParameter("sendAccountNum");
		String receiveAccountNum = request.getParameter("receiveAccountNum");
		String bankCode = request.getParameter("bankCode");
		String sendBankCode = request.getParameter("sendBankCode");
		int transferAmount = Integer.parseInt(request.getParameter("transferAmount"));
		String accountPassword = request.getParameter("accountPassowrd");
		String sendUserName = request.getParameter("sendUserName");
		
		
		
		

		HttpSession session = request.getSession();
		SignUpVO userVO =(SignUpVO) session.getAttribute("user");
		
		
		
		String receivceAcocuntNum  =request.getParameter("receiveAccountNum");
	
		String acccountPassword  =request.getParameter("accuntPassword");
	
		String PhoneNumber = userVO.getPhone();
		System.out.println(PhoneNumber);
		
		TransactionVO transactionVO = new TransactionVO();
		transactionVO.setDeposit_account_num(PhoneNumber);
		transactionVO.setPhone_number(PhoneNumber);
		transactionVO.setTran_amount(transferAmount);
		transactionVO.setDeposit_bank_code(bankCode);
		transactionVO.setWithrawal_bank_code(sendBankCode);
		transactionVO.setWithrawal_accout_num(sendAccountNum);

		
		
		
		
		TransactionService transService = new TransactionService();
		
		transService.transaction(transactionVO);
	
	
	
		
		
	
		AccountService service = new AccountService();
		service.transfer(sendBankCode, sendAccountNum, receiveAccountNum, bankCode,  transferAmount, accountPassword);
	
		
		

		
	
		
		return "transaction.do?";
	}

}

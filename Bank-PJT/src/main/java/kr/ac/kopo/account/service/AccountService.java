package kr.ac.kopo.account.service;

import kr.ac.kopo.account.dao.AccountDAO;
import kr.ac.kopo.account.vo.AccountVO;

public class AccountService {

		
		private AccountDAO dao;
		public AccountService() {
			dao = new AccountDAO();
		}
		
		public void addAccount(AccountVO account) {
			dao.create_acc(account);
	}
		
//		public void transfer(String sendAccountNum,String receiveAccountNum,String transferAmount,String sendBankCode,String bankCode) {
//			
//			dao.transfer(sendAccountNum, receiveAccountNum, transferAmount,sendBankCode,bankCode);
//			
//		}

		public void transfer(String sendBankCode, String sendAccountNum,String receiveAccountNum,String bankCode,int transferAmount,String accountPassowrd) {
			
			dao.transfer(sendBankCode, sendAccountNum, receiveAccountNum,bankCode, transferAmount, accountPassowrd);
			
		}

}



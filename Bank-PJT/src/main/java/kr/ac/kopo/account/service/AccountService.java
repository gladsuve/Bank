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

}



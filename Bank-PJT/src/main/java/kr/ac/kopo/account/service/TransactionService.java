package kr.ac.kopo.account.service;

import java.util.List;

import kr.ac.kopo.account.dao.TransactionDAO;
import kr.ac.kopo.account.vo.TransactionVO;

public class TransactionService {
	
	private TransactionDAO dao;
	public TransactionService() {
		dao = new TransactionDAO();
	}
	
	
	public void transaction(TransactionVO trans) {
		
		dao.selectTransaction(trans);
		
	}
	
	public List<TransactionVO> transactionList(String phoneNumber){
		List <TransactionVO> transList= dao.selectAll(phoneNumber);
		
		return transList;
	}

	


}

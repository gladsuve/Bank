package kr.ac.kopo.account.service;

import java.util.List;

import kr.ac.kopo.account.dao.AccountDAO;
import kr.ac.kopo.account.vo.AccountVO;

public class AccListService {
	
	private AccountDAO dao;
	
	public AccListService() {
		dao = new AccountDAO();
	}
	
	public List<AccountVO> selectAcc() {
		List<AccountVO> accList = dao.selectAcc();
		return accList;
	}



}

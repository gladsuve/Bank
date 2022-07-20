package kr.ac.kopo.account.service;

import java.util.ArrayList;
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
	
	public List<AccountVO> selectJhBank(String phone_number){
		List<AccountVO> acc_List = new ArrayList<>(); 
		acc_List = dao.selectJhBank(phone_number);
		return acc_List;
	}
	
	public List<AccountVO> selectBkBank(String phone_number){
		List<AccountVO> acc_List = new ArrayList<>(); 
		acc_List = dao.selectBkBank(phone_number);
		return acc_List;
	}
	
	public List<AccountVO> selectJbBank(String phone_number){
		List<AccountVO> acc_List = new ArrayList<>(); 
		acc_List = dao.selectJbBank(phone_number);
		return acc_List;
	}
	






}

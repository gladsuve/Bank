package kr.ac.kopo.account.dao;

import java.util.ArrayList;
import java.util.List;

import kr.ac.kopo.account.vo.TransferVO;

public class TransferDAO {
	
	public List<TransferVO> selectTransaction(String id){
			
		List<TransferVO> list = new ArrayList<>();
		StringBuilder sql = new StringBuilder();
		
		sql.append("select withrawal_account_number, deposit_name, deposit_account_num, tran_amount ")
		
		
		return null;
		
	}

}

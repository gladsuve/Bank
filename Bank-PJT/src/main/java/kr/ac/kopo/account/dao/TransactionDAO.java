package kr.ac.kopo.account.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import kr.ac.kopo.account.vo.TransactionVO;
import kr.ac.kopo.util.ConnectionFactory;

public class TransactionDAO {
	
	public void selectTransaction(TransactionVO trans){
			
		StringBuilder sql = new StringBuilder();
		
		sql.append(" INSERT INTO TRANSACTION_HISTORY(TRAN_NUM,DEPOSIT_ACCOUNT_NUM ,WITHRAWAL_ACCOUNT_NUM, DEPOSIT_NAME, WITHRAWAL_NAME,TRAN_AMOUNT,DEPOSIT_BANK_CODE,WITHRAWAL_BANK_CODE,PHONE_NUMBER ");
		sql.append(" VALUES(TRAN_HISTORY_NUM.NEXTVAL, ? ,? ,? ,? ,? ,? ,?) ");
		sql.append("where withrawal_account_num = ? order by tran_num desc ");
		
		try(
			Connection conn = new ConnectionFactory().getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql.toString());) 
		{

			pstmt.setString(1, trans.getDeposit_account_num());
			pstmt.setString(2, trans.getWithrawal_accout_num());
			pstmt.setString(3, trans.getDeposit_name());
			pstmt.setString(4, trans.getWithrawal_name());
			pstmt.setInt(5, trans.getTran_amount());
			pstmt.setString(6, trans.getDeposit_bank_code());
			pstmt.setString(7, trans.getWithrawal_bank_code());
			pstmt.setString(8, trans.getPhone_number());
			
//			pstmt.setString(1, transactionVO.getDeposit_account_num());
	
				
			pstmt.executeUpdate();	
				
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	
		
		

		
	}
	
public List<TransactionVO> selectAll(String PhoneNumber) {
	
	List<TransactionVO> list = new ArrayList<>();
	
	StringBuilder sql = new StringBuilder();
	
	sql.append("select deposit_bank_name as depositBankName, D.bank_name as withrawalBankName, deposit_account_num depositAccountNum, ");
	sql.append(" withrawal_account_num withrawalAccountNum, tran_num tranNum, tran_date tranDate, " );
	sql.append(" withrawal_name withrawalName, deposit_name depositName, tran_amount tranAmount ");
	sql.append(" from (select B.bank_name as deposit_bank_name, tran_num, deposit_account_num, withrawal_account_num, ");
	sql.append(" deposit_name, withrawal_name, deposit_bank_code,withrawal_bank_code,tran_amount,tran_date      \r\n"
			+ "       from transaction_history A, bank_code B ");
	sql.append(" where A.deposit_bank_code = B.bank_code and phone_number= ?) C, bank_code D ");
	sql.append(" where C.withrawal_bank_code = D.bank_code order by tranNum ");
	
	
	try (
		Connection conn = new ConnectionFactory().getConnection();
		PreparedStatement pstmt = conn.prepareStatement(sql.toString());
	){
		
		pstmt.setString(1, PhoneNumber);
		ResultSet rs = pstmt.executeQuery();
		
		if(rs.next()) {
			String deposit_bank = rs.getString("depositBankName");
			String withrawal_bank = rs.getString("withrawalBankName");
			String deposit_num = rs.getString("depositAccountNum");
			String withrawal_num = rs.getString("withrawalAccountNum");
			int tran_num = Integer.parseInt(rs.getString("tranNum"));
			String tran_date = rs.getString("tranDate");
			String withrawal_name = rs.getString("withrawalName");
			String deposit_name = rs.getString("depositName");
			int tran_amount = Integer.parseInt(rs.getString("tranAmount"));
			
			TransactionVO trans = new TransactionVO();
			trans.setDeposit_bank_code(deposit_bank);
			trans.setWithrawal_bank_code(withrawal_bank);
			trans.setDeposit_account_num(deposit_num);
			trans.setWithrawal_accout_num(withrawal_num);
			trans.setTran_num(tran_num);
			trans.setTran_date(tran_date);
			trans.setWithrawal_name(withrawal_name);
			trans.setDeposit_name(deposit_name);
			trans.setTran_amount(tran_amount);
			
			list.add(trans);
		
			
		}
		
		
		
	} catch(Exception e) {
		e.printStackTrace();
	}
	
	
	
	return list;
	
	}

}
































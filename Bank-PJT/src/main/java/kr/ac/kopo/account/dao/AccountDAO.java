package kr.ac.kopo.account.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import kr.ac.kopo.account.vo.AccountVO;
import kr.ac.kopo.member.vo.SignUpVO;
import kr.ac.kopo.util.ConnectionFactory;

public class AccountDAO {

public List<AccountVO> selectAll() {
		
		List<AccountVO> list = new ArrayList<AccountVO>();
		
		StringBuilder sql = new StringBuilder();
		sql.append("select phone_number, account_number, account_password, bank_code, bank_reg_date, balance, bank_alias ");
		sql.append(" from account ");
		
		
		
		
		try (
			Connection conn = new ConnectionFactory().getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql.toString());
			ResultSet rs = pstmt.executeQuery();
				
		) {
			while(rs.next()) {
				String phone = rs.getString("phone_number");
				String num = rs.getString("account_number");
				String pwd = rs.getString("account_password");
				String code = rs.getString("bank_code");
				String regdate = rs.getString("bank_reg_date");
				int balance = rs.getInt("balance");
				String alias = rs.getString("bank_alias");
				
				AccountVO acc = new AccountVO();
				acc.setPhone_number(phone);
				acc.setAccount_number(num);
				acc.setAccount_password(pwd);
				acc.setBank_code(code);
				acc.setBank_reg_date(regdate);
				acc.setBalance(balance);
				acc.setBank_alias(alias);

				
				list.add(acc);
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		return list;
	}

public List<AccountVO> selectJhBank(String phone_number) {
	
	List<AccountVO> list = new ArrayList<AccountVO>();
	
	StringBuilder sql = new StringBuilder();
	sql.append("select phone_number, account_number, account_password,bank_code, bank_reg_date, balance, bank_alias ");
	sql.append(" from account@jh_link a, b_member b ");
	sql.append(" where a.phone_number = b.phone ");
	
	
	
	try (
		Connection conn = new ConnectionFactory().getConnection();
		PreparedStatement pstmt = conn.prepareStatement(sql.toString());)
	
	{
		ResultSet rs = pstmt.executeQuery();	
		while(rs.next()) {
			String phone = rs.getString("phone_number");
			String num = rs.getString("account_number");
			String pwd = rs.getString("account_password");
			String code = rs.getString("bank_code");
			String regdate = rs.getString("bank_reg_date");
			int balance = rs.getInt("balance");
			String alias = rs.getString("bank_alias");
			
			AccountVO acc = new AccountVO();
			acc.setPhone_number(phone);
			acc.setAccount_number(num);
			acc.setAccount_password(pwd);
			acc.setBank_code(code);
			acc.setBank_reg_date(regdate);
			acc.setBalance(balance);
			acc.setBank_alias(alias);

			
			list.add(acc);
		}
		
	} catch(Exception e) {
		e.printStackTrace();
	}
	
	return list;
}

public List<AccountVO> selectBkBank(String phone_number) {
	
	List<AccountVO> list = new ArrayList<AccountVO>();
	
	StringBuilder sql = new StringBuilder();
	sql.append("select phone_number, account_number, account_password,bank_code, bank_reg_date, balance, bank_alias ");
	sql.append(" from account@bk_link a, b_member b ");
	sql.append(" where a.phone_number = b.phone ");
	
	
	
	try (
		Connection conn = new ConnectionFactory().getConnection();
		PreparedStatement pstmt = conn.prepareStatement(sql.toString());)
	
	{
		ResultSet rs = pstmt.executeQuery();	
		while(rs.next()) {
			String phone = rs.getString("phone_number");
			String num = rs.getString("account_number");
			String pwd = rs.getString("account_password");
			String code = rs.getString("bank_code");
			String regdate = rs.getString("bank_reg_date");
			int balance = rs.getInt("balance");
			String alias = rs.getString("bank_alias");
			
			AccountVO acc = new AccountVO();
			acc.setPhone_number(phone);
			acc.setAccount_number(num);
			acc.setAccount_password(pwd);
			acc.setBank_code(code);
			acc.setBank_reg_date(regdate);
			acc.setBalance(balance);
			acc.setBank_alias(alias);

			
			list.add(acc);
		}
		
	} catch(Exception e) {
		e.printStackTrace();
	}
	
	return list;
}

public List<AccountVO> selectJbBank(String phone_number) {
	
	List<AccountVO> list = new ArrayList<AccountVO>();
	
	StringBuilder sql = new StringBuilder();
	sql.append("select phone_number, account_number, account_password, bank_code, bank_reg_date, balance, bank_alias ");
	sql.append(" from account@jb_link a, b_member b");
	sql.append(" where a.phone_number = b.phone ");
	
		
	
	
	try (
		Connection conn = new ConnectionFactory().getConnection();
		PreparedStatement pstmt = conn.prepareStatement(sql.toString());)
	
	{
		ResultSet rs = pstmt.executeQuery();	
		while(rs.next()) {
			String phone = rs.getString("phone_number");
			String num = rs.getString("account_number");
			String pwd = rs.getString("account_password");
			String code = rs.getString("bank_code");
			String regdate = rs.getString("bank_reg_date");
			int balance = rs.getInt("balance");
			String alias = rs.getString("bank_alias");
			
			AccountVO acc = new AccountVO();
			acc.setPhone_number(phone);
			acc.setAccount_number(num);
			acc.setAccount_password(pwd);
			acc.setBank_code(code);
			acc.setBank_reg_date(regdate);
			acc.setBalance(balance);
			acc.setBank_alias(alias);

			
			list.add(acc);
		}
		
	} catch(Exception e) {
		e.printStackTrace();
	}
	
	return list;
}


	
	
	public AccountVO create_acc(AccountVO accountVO) {
		
		StringBuilder sql = new StringBuilder();
		sql.append("insert into account(phone_number, account_number, account_password, bank_alias) ");
		sql.append(" values(?, '009-123-'||round(DBMS_RANDOM.value(100000,999999)) , ?, ?) ");
		
		try (
				Connection conn = new ConnectionFactory().getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql.toString());
		) {
			pstmt.setString(1, accountVO.getPhone_number());
			pstmt.setString(2, accountVO.getAccount_password());
//			pstmt.setString(3, accountVO.getBank_reg_date());
//			pstmt.setInt(5, accountVO.getAccount_password());
			pstmt.setString(3, accountVO.getBank_alias());
		
			

			
			pstmt.executeUpdate();
			
//			while(rs.next()) {
//				SignUpVO memberVO = new SignUpVO();
//				memberVO.setId(rs.getString("id"));
//				memberVO.setPwd(rs.getString("pwd"));
//				memberVO.setName(rs.getString("name"));
//				memberVO.setEmail(rs.getString("email"));
//				memberVO.setPhone(rs.getString("phone"));
//				memberVO.setAddr(rs.getString("addr"));
				
				
//				return memberVO;
//			}
			
		}
		
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return null;
		
	}
	
	

	

	
	
	
	
	
	
	public SignUpVO login(SignUpVO signupVO) {
		
		StringBuilder sql = new StringBuilder();
		sql.append("select id, pwd ");
		sql.append(" from b_member ");
		sql.append(" where id = ? and pwd = ? ");
		
		try(
			Connection conn = new ConnectionFactory().getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql.toString());
		) {
			
			pstmt.setString(1, signupVO.getId());
			pstmt.setString(2, signupVO.getPwd());
			
			ResultSet rs =  pstmt.executeQuery();
			
			if(rs.next()) {
				SignUpVO userVO = new SignUpVO();
				userVO.setId(rs.getString("id"));
				userVO.setPwd(rs.getString("pwd"));
				
				return userVO;
				
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}
	
	
public static List<AccountVO> selectAcc() {
		
		
		List<AccountVO> list = new ArrayList<AccountVO>();
		
		StringBuilder sql = new StringBuilder();
		sql.append("select phone_number, account_number, account_password, bank_code, bank_reg_date, balance, bank_alias, transfer_limit ");
		sql.append(" from account ");
//		sql.append(" where a.phone_number = b.phone ");
		
		
		try(
			Connection conn = new ConnectionFactory().getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql.toString());){
		
//			pstmt.setString(1, "phone");
			ResultSet rs = pstmt.executeQuery();

					
		while(rs.next()) {
			String phone = rs.getString("phone_number");
			String num = rs.getString("account_number");
			String pwd = rs.getString("account_password");
			String regdate = rs.getString("bank_reg_date");
			String code = rs.getString("bank_code");
			int balance= Integer.parseInt(rs.getString("balance"));
			String alias = rs.getString("bank_alias");
			String limit = rs.getString("transfer_limit");
			
			
			AccountVO account = new AccountVO();
			account.setPhone_number(phone);
			account.setAccount_number(num);
			account.setAccount_password(pwd);
			account.setBank_code(code);
			account.setBank_reg_date(regdate);
			account.setBalance(balance);
			account.setBank_alias(alias);
			account.setTransfer_limit(limit);
			
			list.add(account);
		}
		
		
		} catch (Exception e) {
			e.printStackTrace();
		} 
		return list;
	}

	public void transfer(String sendBankCode, String sendAccountNum, String receiveAccountNum, String bankCode, int transferAmount, String accountPassword) {
		
		StringBuilder sql1 = new StringBuilder();
		StringBuilder sql2 = new StringBuilder();
		if(sendBankCode.equals("9") && bankCode.equals("9")) {
		sql1.append("update account set balance = balance - ? where account_number = ?" );
		sql2.append("update account set balance = balance + ? where account_number = ?" );			
		}
		if(sendBankCode.equals("9") && bankCode.equals("2")) {
			sql1.append("update account set balance = balance - ? where account_number = ?" );
			sql2.append("update account@bk_link set balance = balance + ? where account_number = ?" );			
		}
		if(sendBankCode.equals("9") && bankCode.equals("14")) {
			sql1.append("update account set balance = balance - ? where account_number = ?" );
			sql2.append("update account@jb_link set balance = balance + ? where account_number = ?" );			
		}
		if(sendBankCode.equals("9") && bankCode.equals("20")) {
			sql1.append("update account set balance = balance - ? where account_number = ?" );
			sql2.append("update account@jh_link set balance = balance + ? where account_number = ?" );			
		}

		if(sendBankCode.equals("20") && bankCode.equals("9")) {
			sql1.append("update account@jh_link set balance = balance - ? where account_number = ?" );
			sql2.append("update account set balance = balance + ? where account_number = ?" );			
			}
		if(sendBankCode.equals("20") && bankCode.equals("2")) {
				sql1.append("update account@jh_link set balance = balance - ? where account_number = ?" );
				sql2.append("update account@bk_link set balance = balance + ? where account_number = ?" );			
			}
		if(sendBankCode.equals("20") && bankCode.equals("14")) {
				sql1.append("update account@jh_link set balance = balance - ? where account_number = ?" );
				sql2.append("update account@jb_link set balance = balance + ? where account_number = ?" );			
			}
		if(sendBankCode.equals("20") && bankCode.equals("20")) {
				sql1.append("update account@jh_link set balance = balance - ? where account_number = ?" );
				sql2.append("update account@jh_link set balance = balance + ? where account_number = ?" );			
			}
		if(sendBankCode.equals("2") && bankCode.equals("9")) {
			sql1.append("update account@bk_link set balance = balance - ? where account_number = ?" );
			sql2.append("update account set balance = balance + ? where account_number = ?" );			
			}
			if(sendBankCode.equals("2") && bankCode.equals("2")) {
				sql1.append("update account@bk_link set balance = balance - ? where account_number = ?" );
				sql2.append("update account@bk_link set balance = balance + ? where account_number = ?" );			
			}
			if(sendBankCode.equals("2") && bankCode.equals("14")) {
				sql1.append("update account@bk_link set balance = balance - ? where account_number = ?" );
				sql2.append("update account@jb_link set balance = balance + ? where account_number = ?" );			
			}
			if(sendBankCode.equals("2") && bankCode.equals("20")) {
				sql1.append("update account@bk_link set balance = balance - ? where account_number = ?" );
				sql2.append("update account@jh_link set balance = balance + ? where account_number = ?" );			
			}
			
			if(sendBankCode.equals("14") && bankCode.equals("9")) {
				sql1.append("update account@jb_link set balance = balance - ? where account_number = ?" );
				sql2.append("update account set balance = balance + ? where account_number = ?" );			
				}
				if(sendBankCode.equals("14") && bankCode.equals("2")) {
					sql1.append("update account@jb_link set balance = balance - ? where account_number = ?" );
					sql2.append("update account@bk_link set balance = balance + ? where account_number = ?" );			
				}
				if(sendBankCode.equals("14") && bankCode.equals("14")) {
					sql1.append("update account@jb_link set balance = balance - ? where account_number = ?" );
					sql2.append("update account@jb_link set balance = balance + ? where account_number = ?" );			
				}
				if(sendBankCode.equals("14") && bankCode.equals("20")) {
					sql1.append("update account@jb_link set balance = balance - ? where account_number = ?" );
					sql2.append("update account@jh_link set balance = balance + ? where account_number = ?" );			
				}
				
			
		
		
		try(
			Connection conn = new ConnectionFactory().getConnection();
			PreparedStatement pstmt1 = conn.prepareStatement(sql1.toString());
			PreparedStatement pstmt2 = conn.prepareStatement(sql2.toString());) {
		pstmt1.setInt(1, transferAmount);
		pstmt1.setString(2, sendAccountNum);

		pstmt2.setInt(1, transferAmount);
		pstmt2.setString(2, receiveAccountNum);

		pstmt1.executeUpdate();
		pstmt2.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}

		
		
		
	}



}

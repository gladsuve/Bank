package kr.ac.kopo.member.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import kr.ac.kopo.member.vo.SignUpVO;
import kr.ac.kopo.util.ConnectionFactory;

public class MemberDAO {

	public List<SignUpVO> selectAll() {
		
		List<SignUpVO> list = new ArrayList<SignUpVO>();
		
		StringBuilder sql = new StringBuilder();
		sql.append("select id, pwd, name, email, phone, addr ");
		sql.append(" from b_member ");
		
		
		
		
		try (
			Connection conn = new ConnectionFactory().getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql.toString());
			ResultSet rs = pstmt.executeQuery();
				
		) {
			while(rs.next()) {
				String id = rs.getString("id");
				String pwd = rs.getString("pwd");
				String name = rs.getString("name");
				String email = rs.getString("email");
				String phone = rs.getString("phone");
				String addr = rs.getString("addr");

				
				SignUpVO member = new SignUpVO();
				member.setId(id);
				member.setPwd(pwd);
				member.setName(name);
				member.setEmail(email);
				member.setPhone(phone);
				member.setAddr(addr);

				
				list.add(member);
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		return list;
	}
	
	
	public SignUpVO signup(SignUpVO signupVO) {
		
		StringBuilder sql = new StringBuilder();
		sql.append("insert into b_member(id, pwd, name, email, phone, addr) values(?, ?, ?, ?, ?, ?) ");
		
		try (
				Connection conn = new ConnectionFactory().getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql.toString());
		) {
			pstmt.setString(1, signupVO.getId());
			pstmt.setString(2, signupVO.getPwd());
			pstmt.setString(3, signupVO.getName());
			pstmt.setString(4, signupVO.getEmail());
			pstmt.setString(5, signupVO.getPhone());
			pstmt.setString(6, signupVO.getAddr());
			

			
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
		sql.append("select id, pwd, phone ");
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
				String id = rs.getString("id");
				String pwd = rs.getString("pwd");
				String phone = rs.getString("phone");
				
				SignUpVO userVO = new SignUpVO();
				userVO.setId(id);
				userVO.setPwd(pwd);
				userVO.setPhone(phone);
				
				return userVO;
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}
	
}

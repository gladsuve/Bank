package kr.ac.kopo.member.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import kr.ac.kopo.member.vo.MemberTestVO;
import kr.ac.kopo.member.vo.MemberVO;
import kr.ac.kopo.util.ConnectionFactory;

public class MemberDao {

	public List<MemberVO> selectAll() {
		
		List<MemberVO> list = new ArrayList<MemberVO>();
		
		StringBuilder sql = new StringBuilder();
		sql.append("select id, name, password, email_id, email_domain, tel1, tel2, tel3, post, basic_addr, detail_addr ");
		sql.append(" from b_member ");
		sql.append(" order by id desc");
		
		
		
		try (
			Connection conn = new ConnectionFactory().getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql.toString());
			ResultSet rs = pstmt.executeQuery();
				
		) {
			while(rs.next()) {
				String id = rs.getString("id");
				String name = rs.getString("name");
				String pwd = rs.getString("password");
				String email = rs.getString("email_id");
				String domain = rs.getString("email_domain");
				String tel1 = rs.getString("tel1");
				String tel2 = rs.getString("tel2");
				String tel3 = rs.getString("tel3");
				String post = rs.getString("post");
				String addr1 = rs.getString("basic_addr");
				String addr2 = rs.getString("detail_addr");
				String type = rs.getString("type");
				String regDate = rs.getString("reg_date");
				
				MemberVO member = new MemberVO();
				member.setId(id);
				member.setName(name);
				member.setPassword(pwd);
				member.setEmail_id(email);
				member.setEmail_domain(domain);
				member.setTel1(tel1);
				member.setTel2(tel2);
				member.setTel3(tel3);
				member.setPost(post);
				member.setBasic_addr(addr1);
				member.setDetail_addr(addr2);
				member.setType(type);
				member.setReg_date(regDate);
				
				list.add(member);
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		return list;
	}
	
	
	public MemberTestVO signup(MemberTestVO TestVO) {
		
		StringBuilder sql = new StringBuilder();
		sql.append("insert into a_test values(?, ?) ");
		
		try (
				Connection conn = new ConnectionFactory().getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql.toString());
		) {
			pstmt.setString(1, TestVO.getId());
			pstmt.setString(2, TestVO.getPwd());
			
			ResultSet rs =  pstmt.executeQuery();
			
			while(rs.next()) {
				MemberTestVO memberVO = new MemberTestVO();
				memberVO.setId(rs.getString("id"));
				memberVO.setPwd(rs.getString("pwd"));
				
				
				return memberVO;
			}
			
		}
		
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return null;
		
	}
	
	
	
	
	
	
	
	
	
	
	public MemberVO login(MemberVO memberVO) {
		
		StringBuilder sql = new StringBuilder();
		sql.append("select id, password, name, type ");
		sql.append(" from t_member ");
		sql.append(" where id = ? and password = ? ");
		
		try(
			Connection conn = new ConnectionFactory().getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql.toString());
		) {
			
			pstmt.setString(1, memberVO.getId());
			pstmt.setString(2, memberVO.getPassword());
			
			ResultSet rs =  pstmt.executeQuery();
			
			if(rs.next()) {
				MemberVO userVO = new MemberVO();
				userVO.setId(rs.getString("id"));
				userVO.setPassword(rs.getString("password"));
				userVO.setName(rs.getString("name"));
				userVO.setType(rs.getString("type"));
				
				return userVO;
				
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}
	
}

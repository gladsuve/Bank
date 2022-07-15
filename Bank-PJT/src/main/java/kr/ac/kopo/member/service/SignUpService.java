package kr.ac.kopo.member.service;

import kr.ac.kopo.member.dao.MemberDAO;
import kr.ac.kopo.member.vo.SignUpVO;

public class SignUpService {

	private MemberDAO dao;
	public SignUpService() {
		dao = new MemberDAO();
	}
	
	
	
	
	
	public void addMember(SignUpVO signupVO) {
		dao.signup(signupVO);
	}
}

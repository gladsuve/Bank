package kr.ac.kopo.member.service;

import kr.ac.kopo.member.dao.MemberDao;
import kr.ac.kopo.member.vo.MemberTestVO;

public class SignUpService {

	private MemberDao dao;
	public SignUpService() {
		dao = new MemberDao();
	}
	
	
	
	
	
	public void addMember(MemberTestVO TestVO) {
		dao.signup(TestVO);
	}
}

package kr.ac.kopo.member;

public class MemberVO {
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	private String id;
	private String password;
	public MemberVO() {
		
	}
	public MemberVO(String id, String password) {
		super();
		this.id = id;
		this.password = password;
	}

}

package kr.ac.kopo.member.vo;

public class MemberTestVO {

	@Override
	public String toString() {
		return "MemberTestVO [id=" + id + ", pwd=" + pwd + "]";
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	private String id;
	private String pwd;
	public MemberTestVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MemberTestVO(String id, String pwd) {
		super();
		this.id = id;
		this.pwd = pwd;
	}
	
	
}

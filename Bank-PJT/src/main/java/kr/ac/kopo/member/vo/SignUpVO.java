package kr.ac.kopo.member.vo;

public class SignUpVO {
	
	@Override
	public String toString() {
		return "SignUpVO [id=" + id + ", pwd=" + pwd + ", name=" + name + ", email=" + email
				+ ", phone=" + phone + ", addr=" + addr + "]";
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

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	private String id;
	private String pwd;
	private String name;
	private String email;
	private String phone;
	private String addr;
	public SignUpVO(String id, String pwd, String name, String email, String phone, String addr) {
		super();
		this.id = id;
		this.pwd = pwd;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.addr = addr;
	}
	public SignUpVO() {
		super();
		// TODO Auto-generated constructor stub
	}

}

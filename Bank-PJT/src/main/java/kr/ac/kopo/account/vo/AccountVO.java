package kr.ac.kopo.account.vo;

public class AccountVO {
	
	@Override
	public String toString() {
		return "AccountVO [phone_number=" + phone_number + ", account_number=" + account_number + ", account_password="
				+ account_password + ", bank_code=" + bank_code + ", bank_reg_date=" + bank_reg_date + ", balance="
				+ balance + ", bank_alias=" + bank_alias + ", transfer_limit=" + transfer_limit + ", bank_name="
				+ bank_name + "]";
	}



	public String getPhone_number() {
		return phone_number;
	}



	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}



	public String getAccount_number() {
		return account_number;
	}



	public void setAccount_number(String account_number) {
		this.account_number = account_number;
	}



	public String getAccount_password() {
		return account_password;
	}



	public void setAccount_password(String account_password) {
		this.account_password = account_password;
	}



	public String getBank_code() {
		return bank_code;
	}



	public void setBank_code(String bank_code) {
		this.bank_code = bank_code;
	}



	public String getBank_reg_date() {
		return bank_reg_date;
	}



	public void setBank_reg_date(String bank_reg_date) {
		this.bank_reg_date = bank_reg_date;
	}



	public int getBalance() {
		return balance;
	}



	public void setBalance(int balance) {
		this.balance = balance;
	}



	public String getBank_alias() {
		return bank_alias;
	}



	public void setBank_alias(String bank_alias) {
		this.bank_alias = bank_alias;
	}



	public String getTransfer_limit() {
		return transfer_limit;
	}



	public void setTransfer_limit(String transfer_limit) {
		this.transfer_limit = transfer_limit;
	}



	public String getBank_name() {
		return bank_name;
	}



	public void setBank_name(String bank_name) {
		this.bank_name = bank_name;
	}



	private String phone_number;
	private String account_number;
	private String account_password;
	private String bank_code;
	private String bank_reg_date;
	private int balance;
	private String bank_alias;
	private String transfer_limit;
	private String bank_name;
	
	
	
	public AccountVO() {
		super();
		// TODO Auto-generated constructor stub
	}



	public AccountVO(String phone_number, String account_number, String account_password, String bank_code,
			String bank_reg_date, int balance, String bank_alias, String transfer_limit, String bank_name) {
		super();
		this.phone_number = phone_number;
		this.account_number = account_number;
		this.account_password = account_password;
		this.bank_code = bank_code;
		this.bank_reg_date = bank_reg_date;
		this.balance = balance;
		this.bank_alias = bank_alias;
		this.transfer_limit = transfer_limit;
		this.bank_name = bank_name;
	}



	public AccountVO(String phone_number, String account_number, String account_password, String bank_code,
			String bank_reg_date, int balance, String bank_alias) {
		super();
		this.phone_number = phone_number;
		this.account_number = account_number;
		this.account_password = account_password;
		this.bank_code = bank_code;
		this.bank_reg_date = bank_reg_date;
		this.balance = balance;
		this.bank_alias = bank_alias;
	}



	public AccountVO(String bank_code, String bank_name) {
		super();
		this.bank_code = bank_code;
		this.bank_name = bank_name;
	}
	



	

}

	
	


package kr.ac.kopo.account.vo;

public class TransferVO {
	
	@Override
	public String toString() {
		return "TransferVO [tran_num=" + tran_num + ", deposit_account_num=" + deposit_account_num
				+ ", withrawal_accout_num=" + withrawal_accout_num + ", deposit_name=" + deposit_name
				+ ", withrawal_name=" + withrawal_name + ", deposit_bank_code=" + deposit_bank_code
				+ ", withrawal_bank_code=" + withrawal_bank_code + ", tran_amount=" + tran_amount + ", tran_date="
				+ tran_date + ", phone_number=" + phone_number + "]";
	}
	public int getTran_num() {
		return tran_num;
	}
	public void setTran_num(int tran_num) {
		this.tran_num = tran_num;
	}
	public String getDeposit_account_num() {
		return deposit_account_num;
	}
	public void setDeposit_account_num(String deposit_account_num) {
		this.deposit_account_num = deposit_account_num;
	}
	public String getWithrawal_accout_num() {
		return withrawal_accout_num;
	}
	public void setWithrawal_accout_num(String withrawal_accout_num) {
		this.withrawal_accout_num = withrawal_accout_num;
	}
	public String getDeposit_name() {
		return deposit_name;
	}
	public void setDeposit_name(String deposit_name) {
		this.deposit_name = deposit_name;
	}
	public String getWithrawal_name() {
		return withrawal_name;
	}
	public void setWithrawal_name(String withrawal_name) {
		this.withrawal_name = withrawal_name;
	}
	public String getDeposit_bank_code() {
		return deposit_bank_code;
	}
	public void setDeposit_bank_code(String deposit_bank_code) {
		this.deposit_bank_code = deposit_bank_code;
	}
	public String getWithrawal_bank_code() {
		return withrawal_bank_code;
	}
	public void setWithrawal_bank_code(String withrawal_bank_code) {
		this.withrawal_bank_code = withrawal_bank_code;
	}
	public int getTran_amount() {
		return tran_amount;
	}
	public void setTran_amount(int tran_amount) {
		this.tran_amount = tran_amount;
	}
	public String getTran_date() {
		return tran_date;
	}
	public void setTran_date(String tran_date) {
		this.tran_date = tran_date;
	}
	public String getPhone_number() {
		return phone_number;
	}
	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}
	private int tran_num;
	private String deposit_account_num;
	private String withrawal_accout_num;
	private String deposit_name;
	private String withrawal_name;
	private String deposit_bank_code;
	private String withrawal_bank_code;
	private int tran_amount;
	private String tran_date;
	private String phone_number;
	
	
	
	public TransferVO(int tran_num, String deposit_account_num, String withrawal_accout_num, String deposit_name,
			String withrawal_name, String deposit_bank_code, String withrawal_bank_code, int tran_amount,
			String tran_date, String phone_number) {
		super();
		this.tran_num = tran_num;
		this.deposit_account_num = deposit_account_num;
		this.withrawal_accout_num = withrawal_accout_num;
		this.deposit_name = deposit_name;
		this.withrawal_name = withrawal_name;
		this.deposit_bank_code = deposit_bank_code;
		this.withrawal_bank_code = withrawal_bank_code;
		this.tran_amount = tran_amount;
		this.tran_date = tran_date;
		this.phone_number = phone_number;
	}
	public TransferVO() {
		super();
		// TODO Auto-generated constructor stub
	}


	

	
}

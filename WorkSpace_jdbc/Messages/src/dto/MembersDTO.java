package dto;

import java.sql.Timestamp;

import commons.EncryptionUtils;

public class MembersDTO {
	private String id;
	private String pw;
	private String name;
	private String contact;
	private Timestamp reg_date;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		try {
			this.pw = EncryptionUtils.sha256(pw);
		} catch (Exception e) {
			System.out.println("ERROR: 패스워드 암호화");
			e.printStackTrace();
		}
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public Timestamp getReg_date() {
		return reg_date;
	}
	public void setReg_date(Timestamp reg_date) {
		this.reg_date = reg_date;
	}
}

package model;

import java.io.Serializable;

public class Member implements Serializable{
	private Integer id;
	private String memberno;
	private String name;
	private String account;
	private String password;
	private String email;
	private String sex;
	private String nationalid;
	private String address;
	private String phone;
	private String datetime;
	public Member() {
		super();
	}
	public Member(String memberno, String name, String account, String password, String email, String sex,
			String nationalid, String address, String phone) {
		super();
		this.memberno = memberno;
		this.name = name;
		this.account = account;
		this.password = password;
		this.email = email;
		this.sex = sex;
		this.nationalid = nationalid;
		this.address = address;
		this.phone = phone;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getMemberno() {
		return memberno;
	}
	public void setMemberno(String memberno) {
		this.memberno = memberno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getNationalid() {
		return nationalid;
	}
	public void setNationalid(String nationalid) {
		this.nationalid = nationalid;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getDatetime() {
		return datetime;
	}
	public void setDatetime(String datetime) {
		this.datetime = datetime;
	}
	
	
	
	

}

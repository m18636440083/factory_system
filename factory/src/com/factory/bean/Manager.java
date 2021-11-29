package com.factory.bean;

public class Manager {

	private int id;
	private String mname;
	private String username;
	private String password;
	private String mtel;
	private String memail;
	private int mcategory;
	private String mremark;
	public Manager(int id, String mname, String username, String password, String mtel, String memail, int mcategory,
			String mremark) {
		super();
		this.id = id;
		this.mname = mname;
		this.username = username;
		this.password = password;
		this.mtel = mtel;
		this.memail = memail;
		this.mcategory = mcategory;
		this.mremark = mremark;
	}
	public Manager() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Manager [id=" + id + ", mname=" + mname + ", username=" + username + ", password=" + password
				+ ", mtel=" + mtel + ", memail=" + memail + ", mcategory=" + mcategory + ", mremark=" + mremark + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getMtel() {
		return mtel;
	}
	public void setMtel(String mtel) {
		this.mtel = mtel;
	}
	public String getMemail() {
		return memail;
	}
	public void setMemail(String memail) {
		this.memail = memail;
	}
	public int getMcategory() {
		return mcategory;
	}
	public void setMcategory(int mcategory) {
		this.mcategory = mcategory;
	}
	public String getMremark() {
		return mremark;
	}
	public void setMremark(String mremark) {
		this.mremark = mremark;
	}
	
}

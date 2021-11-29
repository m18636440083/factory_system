package com.factory.bean;

public class Worehouse {

	private int hno;
	private int hmanagerId;
	private String hmanagerName;
	private String htel;
	private String hlocation;
	private String hremark;
	public Worehouse(int hno, int hmanagerId, String hmanagerName, String htel, String hlocation, String hremark) {
		super();
		this.hno = hno;
		this.hmanagerId = hmanagerId;
		this.hmanagerName = hmanagerName;
		this.htel = htel;
		this.hlocation = hlocation;
		this.hremark = hremark;
	}
	public Worehouse() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getHno() {
		return hno;
	}
	public void setHno(int hno) {
		this.hno = hno;
	}
	public int getHmanagerId() {
		return hmanagerId;
	}
	public void setHmanagerId(int hmanagerId) {
		this.hmanagerId = hmanagerId;
	}
	public String getHmanagerName() {
		return hmanagerName;
	}
	public void setHmanagerName(String hmanagerName) {
		this.hmanagerName = hmanagerName;
	}
	public String getHtel() {
		return htel;
	}
	public void setHtel(String htel) {
		this.htel = htel;
	}
	public String getHlocation() {
		return hlocation;
	}
	public void setHlocation(String hlocation) {
		this.hlocation = hlocation;
	}
	public String getHremark() {
		return hremark;
	}
	public void setHremark(String hremark) {
		this.hremark = hremark;
	}
	@Override
	public String toString() {
		return "Worehouse [hno=" + hno + ", hmanagerId=" + hmanagerId + ", hmanagerName=" + hmanagerName + ", htel="
				+ htel + ", hlocation=" + hlocation + ", hremark=" + hremark + "]";
	}
	
}

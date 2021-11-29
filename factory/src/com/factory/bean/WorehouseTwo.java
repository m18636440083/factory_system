package com.factory.bean;

public class WorehouseTwo {

	private int hno;
	private int hmanagerId;
	private String hmanagerName;
	private String htel;
	private String hlocation;
	private int pno;
	private String pname;
	private int pprice;
	private int wnumber;
	private String pcreatTime;
	private int mno;
	private String mname;
	private int mnum;
	private int mprice;
	public WorehouseTwo(int hno, int hmanagerId, String hmanagerName, String htel, String hlocation, int pno,
			String pname, int pprice, int wnumber, String pcreatTime, int mno, String mname, int mnum, int mprice) {
		super();
		this.hno = hno;
		this.hmanagerId = hmanagerId;
		this.hmanagerName = hmanagerName;
		this.htel = htel;
		this.hlocation = hlocation;
		this.pno = pno;
		this.pname = pname;
		this.pprice = pprice;
		this.wnumber = wnumber;
		this.pcreatTime = pcreatTime;
		this.mno = mno;
		this.mname = mname;
		this.mnum = mnum;
		this.mprice = mprice;
	}
	public WorehouseTwo() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "WorehouseTwo [hno=" + hno + ", hmanagerId=" + hmanagerId + ", hmanagerName=" + hmanagerName + ", htel="
				+ htel + ", hlocation=" + hlocation + ", pno=" + pno + ", pname=" + pname + ", pprice=" + pprice
				+ ", wnumber=" + wnumber + ", pcreatTime=" + pcreatTime + ", mno=" + mno + ", mname=" + mname
				+ ", mnum=" + mnum + ", mprice=" + mprice + "]";
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
	public int getPno() {
		return pno;
	}
	public void setPno(int pno) {
		this.pno = pno;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getPprice() {
		return pprice;
	}
	public void setPprice(int pprice) {
		this.pprice = pprice;
	}
	public int getWnumber() {
		return wnumber;
	}
	public void setWnumber(int wnumber) {
		this.wnumber = wnumber;
	}
	public String getPcreatTime() {
		return pcreatTime;
	}
	public void setPcreatTime(String pcreatTime) {
		this.pcreatTime = pcreatTime;
	}
	public int getMno() {
		return mno;
	}
	public void setMno(int mno) {
		this.mno = mno;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public int getMnum() {
		return mnum;
	}
	public void setMnum(int mnum) {
		this.mnum = mnum;
	}
	public int getMprice() {
		return mprice;
	}
	public void setMprice(int mprice) {
		this.mprice = mprice;
	}
	
	
}

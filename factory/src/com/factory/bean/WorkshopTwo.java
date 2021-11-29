/*
 * 中北大学软件学院版权所有
 */
package com.factory.bean;

/**
 * 
 * @author 张佳豪
 * @version 1.0
 */
public class WorkshopTwo {
	private int wno;
	private String fname;
	private String wmanager;
	private String wlocation;
	private String wtel;
	private int pno;
	private String pname;
	private int pprice;
	private String pcreatTime;
	public WorkshopTwo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public WorkshopTwo(int wno, String fname, String wmanager, String wlocation, String wtel, int pno, String pname,
			int pprice, String pcreatTime) {
		super();
		this.wno = wno;
		this.fname = fname;
		this.wmanager = wmanager;
		this.wlocation = wlocation;
		this.wtel = wtel;
		this.pno = pno;
		this.pname = pname;
		this.pprice = pprice;
		this.pcreatTime = pcreatTime;
	}
	public int getWno() {
		return wno;
	}
	public void setWno(int wno) {
		this.wno = wno;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getWmanager() {
		return wmanager;
	}
	public void setWmanager(String wmanager) {
		this.wmanager = wmanager;
	}
	public String getWlocation() {
		return wlocation;
	}
	public void setWlocation(String wlocation) {
		this.wlocation = wlocation;
	}
	public String getWtel() {
		return wtel;
	}
	public void setWtel(String wtel) {
		this.wtel = wtel;
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
	public String getPcreatTime() {
		return pcreatTime;
	}
	public void setPcreatTime(String pcreatTime) {
		this.pcreatTime = pcreatTime;
	}
	@Override
	public String toString() {
		return "WorkshopTwo [wno=" + wno + ", fname=" + fname + ", wmanager=" + wmanager + ", wlocation=" + wlocation
				+ ", wtel=" + wtel + ", pno=" + pno + ", pname=" + pname + ", pprice=" + pprice + ", pcreatTime="
				+ pcreatTime + "]";
	}
	
}


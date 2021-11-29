package com.factory.bean;

import java.util.Date;

public class Product {
	// 产品号
	private int pno;
	// 仓库号
	private int hno;
	// 产品名称
	private String pname;
	// 价格
	private int pprice;
	// 车间编号
	private int wnumber;
	// 备注
	private Date pcreateTime;
	// 生产日期
	private String premark;
	
	public Product() {
		super();
	}
	public Product(int pno, int hno, String pname, int pprice, int wnumber, String premark, Date pcreateTime) {
		super();
		this.pno = pno;
		this.hno = hno;
		this.pname = pname;
		this.pprice = pprice;
		this.wnumber = wnumber;
		this.premark = premark;
		this.pcreateTime = pcreateTime;
	}
	public int getPno() {
		return pno;
	}
	public void setPno(int pno) {
		this.pno = pno;
	}
	public int getHno() {
		return hno;
	}
	public void setHno(int hno) {
		this.hno = hno;
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
	public String getPremark() {
		return premark;
	}
	public void setPremark(String premark) {
		this.premark = premark;
	}
	public Date getPcreateTime() {
		return pcreateTime;
	}
	public void setPcreateTime(Date pcreateTime) {
		this.pcreateTime = pcreateTime;
	}
	@Override
	public String toString() {
		return "Product [pno=" + pno + ", hno=" + hno + ", pname=" + pname + ", pprice=" + pprice + ", wnumber="
				+ wnumber + ", premark=" + premark + ", pcreateTime=" + pcreateTime + "]";
	}
	
	
}

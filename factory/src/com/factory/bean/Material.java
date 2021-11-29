package com.factory.bean;

import java.util.Date;

public class Material {
	// 材料号
	private int mno;
	// 材料名称
	private String mname;
	// 库存量
	private int mnum;
	// 价格
	private int mprice;
	// 备注
	private String mremark;
	public Material() {
		super();
	}
	public Material(int mno, String mname, int mnum, int mprice, String mremark) {
		super();
		this.mno = mno;
		this.mname = mname;
		this.mnum = mnum;
		this.mprice = mprice;
		this.mremark = mremark;
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
	public String getMremark() {
		return mremark;
	}
	public void setMremark(String mremark) {
		this.mremark = mremark;
	}
	@Override
	public String toString() {
		return "Material [mno=" + mno + ", mname=" + mname + ", mnum=" + mnum + ", mprice=" + mprice + ", mremark="
				+ mremark + "]";
	}
	
	
	
}

/*
 * 中北大学软件学院版权所有
 */
package com.factory.bean;

/**
 * 
 * @author 张佳豪
 * @version 1.0
 */
public class Workshop {
	int wno;
	String fname;
	String wmanager;
	String wlocation;
	String wtel;
	String wremark;

	/**
	 * @return 车间号
	 */
	public int getWno() {
		return wno;
	}

	/**
	 * @param 设置车间号
	 */
	public void setWno(int wno) {
		this.wno = wno;
	}

	/**
	 * @return 车间名
	 */
	public String getFname() {
		return fname;
	}

	/**
	 * @param 设置车间名
	 */
	public void setFname(String fname) {
		this.fname = fname;
	}

	/**
	 * @return 车间管理员
	 */
	public String getWmanager() {
		return wmanager;
	}

	/**
	 * @param 设置车间管理员
	 */
	public void setWmanager(String wmanager) {
		this.wmanager = wmanager;
	}

	/**
	 * @return 车间地址
	 */
	public String getWlocation() {
		return wlocation;
	}

	/**
	 * @param 设置车间
	 */
	public void setWlocation(String wlocation) {
		this.wlocation = wlocation;
	}

	/**
	 * @return 车间电话
	 */
	public String getWtel() {
		return wtel;
	}

	/**
	 * @param 设置车间电话
	 */
	public void setWtel(String wtel) {
		this.wtel = wtel;
	}

	/**
	 * @return 备注
	 */
	public String getWremark() {
		return wremark;
	}

	/**
	 * @param 设置备注
	 */
	public void setWremark(String wremark) {
		this.wremark = wremark;
	}

	@Override
	public String toString() {
		return "Workshop [wno=" + wno + ", fname=" + fname + ", wmanager=" + wmanager + ", wlocation=" + wlocation
				+ ", wtel=" + wtel + ", wremark=" + wremark + "]";
	}

	/**
	 * 
	 */
	public Workshop() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param 车间号
	 * @param 车间名
	 * @param 车间管理员
	 * @param 车间地址
	 * @param 车间电话
	 * @param 车间备注
	 */
	public Workshop(int wno, String fname, String wmanager, String wlocation, String wtel, String wremark) {
		super();
		this.wno = wno;
		this.fname = fname;
		this.wmanager = wmanager;
		this.wlocation = wlocation;
		this.wtel = wtel;
		this.wremark = wremark;
	}
	public Workshop(int wno, String wmanager, String wlocation, String wtel, String wremark) {
		super();
		this.wno = wno;
		this.wmanager = wmanager;
		this.wlocation = wlocation;
		this.wtel = wtel;
		this.wremark = wremark;
	}

}

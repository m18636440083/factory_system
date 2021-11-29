package com.factory.bean;

import java.util.Date;

public class Factory {
	private String fname;
	private String fleader;
	private String fintroduction;
	private Date fregistertTime;
	private String flocation;
	public Factory() {
		super();
	}
	
	public Factory(String fname, String fleader, String fintroduction, Date fregistertTime, String flocation) {
		super();
		this.fname = fname;
		this.fleader = fleader;
		this.fintroduction = fintroduction;
		this.fregistertTime = fregistertTime;
		this.flocation = flocation;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getFleader() {
		return fleader;
	}
	public void setFleader(String fleader) {
		this.fleader = fleader;
	}
	public String getFintroduction() {
		return fintroduction;
	}
	public void setFintroduction(String fintroduction) {
		this.fintroduction = fintroduction;
	}
	public Date getFregistertTime() {
		return fregistertTime;
	}
	public void setFregistertTime(Date fregistertTime) {
		this.fregistertTime = fregistertTime;
	}
	public String getFlocation() {
		return flocation;
	}
	public void setFlocation(String flocation) {
		this.flocation = flocation;
	}

	@Override
	public String toString() {
		return "Factory [fname=" + fname + ", fleader=" + fleader + ", fintrouction=" + fintroduction
				+ ", fregistertTime=" + fregistertTime + ", flocation=" + flocation + "]";
	}
	
}

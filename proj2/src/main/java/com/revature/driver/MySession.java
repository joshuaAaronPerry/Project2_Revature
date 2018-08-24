package com.revature.driver;

import java.sql.Date;

public class MySession {
private int sid, numOfTest, numOfInclude, numOfExclude, numOfPass, numOfFail, numOfSkipped;
	
	private Date date;
	
	public MySession(int sid, Date date, int numOfTest, int numOfInclude, int numOfExclude, int numOfPass, int numOfFail,
			int numOfSkipped) {
		super();
		this.sid = sid;
		this.numOfTest = numOfTest;
		this.numOfInclude = numOfInclude;
		this.numOfExclude = numOfExclude;
		this.numOfPass = numOfPass;
		this.numOfFail = numOfFail;
		this.numOfSkipped = numOfSkipped;
		this.date = date;
	}
	
	public MySession(Date date, int numOfTest, int numOfInclude, int numOfExclude, int numOfPass, int numOfFail,
			int numOfSkipped) {
		super();
	
		this.numOfTest = numOfTest;
		this.numOfInclude = numOfInclude;
		this.numOfExclude = numOfExclude;
		this.numOfPass = numOfPass;
		this.numOfFail = numOfFail;
		this.numOfSkipped = numOfSkipped;
		this.date = date;
	}
	
	public MySession(int numOfTest, int numOfInclude, int numOfExclude, int numOfPass, int numOfFail,
			int numOfSkipped) {
		super();
	
		this.numOfTest = numOfTest;
		this.numOfInclude = numOfInclude;
		this.numOfExclude = numOfExclude;
		this.numOfPass = numOfPass;
		this.numOfFail = numOfFail;
		this.numOfSkipped = numOfSkipped;
		this.date = date;
	}


	public MySession() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public int getNumOfTest() {
		return numOfTest;
	}

	public void setNumOfTest(int numOfTest) {
		this.numOfTest = numOfTest;
	}

	public int getNumOfInclude() {
		return numOfInclude;
	}

	public void setNumOfInclude(int numOfInclude) {
		this.numOfInclude = numOfInclude;
	}

	public int getNumOfExclude() {
		return numOfExclude;
	}

	public void setNumOfExclude(int numOfExclude) {
		this.numOfExclude = numOfExclude;
	}

	public int getNumOfPass() {
		return numOfPass;
	}

	public void setNumOfPass(int numOfPass) {
		this.numOfPass = numOfPass;
	}

	public int getNumOfFail() {
		return numOfFail;
	}

	public void setNumOfFail(int numOfFail) {
		this.numOfFail = numOfFail;
	}

	public int getNumOfSkipped() {
		return numOfSkipped;
	}

	public void setNumOfSkipped(int numOfSkipped) {
		this.numOfSkipped = numOfSkipped;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "MySession [sid=" + sid + ", date=" + date + ", numOfTest=" + numOfTest + ", numOfInclude=" + numOfInclude + ", numOfExclude="
				+ numOfExclude + ", numOfPass=" + numOfPass + ", numOfFail=" + numOfFail + ", numOfSkipped="
				+ numOfSkipped  + "]";
	}

}

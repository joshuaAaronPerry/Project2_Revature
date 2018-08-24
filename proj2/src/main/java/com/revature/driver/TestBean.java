package com.revature.driver;

public class TestBean {
	private int tid, sid;
	private String error, name, status;
	

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public int getTid() {
		return tid;
	}

	public void setTid(int tid) {
		this.tid = tid;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "TestBean [tid = " + tid + ", sid = " + sid + ", error = " + error + ", name = " + name + ", status = " + status + "]";
	}

	public TestBean(int tid, int sid, String name, String error, String status) {
		super();
		this.tid = tid;
		this.sid = sid;
		this.error = error;
		this.name = name;
		this.status = status;
	}
	public TestBean(int sid, String name, String status, String error) {
		super();
		this.error = error;
		this.sid = sid;
		this.name = name;
		this.status = status;
	}

	public TestBean() {
		super();
		// TODO Auto-generated constructor stub
	}

}

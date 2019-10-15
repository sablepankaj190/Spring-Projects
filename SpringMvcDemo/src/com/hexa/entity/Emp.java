package com.hexa.entity;

import java.time.LocalDate;

public class Emp {

	private int eid;
	private String ename;
	private double sal;
	private String dept;
	private LocalDate doj;
	
	public Emp(int eid, String ename, double sal, String dept, LocalDate doj) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.sal = sal;
		this.dept = dept;
		this.doj = doj;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public LocalDate getDoj() {
		return doj;
	}

	public void setDoj(LocalDate doj) {
		this.doj = doj;
	}

	@Override
	public String toString() {
		return "Emp [eid=" + eid + ", ename=" + ename + ", sal=" + sal + ", dept=" + dept + ", doj=" + doj + "]";
	}
	
	
	
}

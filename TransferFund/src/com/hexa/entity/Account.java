package com.hexa.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="hexa_account")
public class Account {

	@Id
	private int aid;
	@Column(length=20)
	private String cname;
	private double bal;
	
	public int getAid() {
		return aid;
	}

	public void setAid(int aid) {
		this.aid = aid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public double getBal() {
		return bal;
	}
	public void setBal(double bal) {
		this.bal = bal;
	}

	@Override
	public String toString() {
		return aid + " " + cname + " " + bal;
	}
	
}

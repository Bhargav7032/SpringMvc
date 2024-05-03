package com.ciq.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CUSTOMER")
public class Customer {

	@Id
	@Column
	private int cid;
	@Column
	private String cname;
	@Column
	private String ptype;
	@Column
	private double pcost;
	public Customer() {
		super();
	}
	public Customer(int cid, String cname, String ptype, double pcost) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.ptype = ptype;
		this.pcost = pcost;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getPtype() {
		return ptype;
	}
	public void setPtype(String ptype) {
		this.ptype = ptype;
	}
	public double getPcost() {
		return pcost;
	}
	public void setPcost(double pcost) {
		this.pcost = pcost;
	}
	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", cname=" + cname + ", ptype=" + ptype + ", pcost=" + pcost + "]";
	}
	
	
	
}

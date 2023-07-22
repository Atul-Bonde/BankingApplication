package com.BankApplication.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Accounts_Details")
public class Account {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="Acc_No")
	private int accno;
	 
	@Column(name="Customer_Name")
	private String name;
	
	@Column(name="Customer_Add")
	private String add;
	
	@Column(name="Customer_PanNo")
	private String panno;
	
	@Column(name="Account_Balance")
	private double balance;

	public int getAccno() {
		return accno;
	}

	public void setAccno(int accno) {
		this.accno = accno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAdd() {
		return add;
	}

	public void setAdd(String add) {
		this.add = add;
	}

	public String getPanno() {
		return panno;
	}

	public void setPanno(String panno) {
		this.panno = panno;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Account [accno=" + accno + ", name=" + name + ", add=" + add + ", panno=" + panno + ", balance="
				+ balance + "]";
	}
	
	

}

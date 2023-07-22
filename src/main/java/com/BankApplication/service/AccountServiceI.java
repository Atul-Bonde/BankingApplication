package com.BankApplication.service;

import com.BankApplication.model.Account;

public interface AccountServiceI {
	
	
	public Account createacc(Account acc);
	
	public Account viewaccount(int accno);
	
	public Account withdrawl(int accno);
	
	public Account deposit(int accno);
	
	public Account updateacc(int accno);
	
	

}

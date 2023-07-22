package com.BankApplication.controller;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.BankApplication.model.Account;
import com.BankApplication.repository.AccountRepository;
import com.BankApplication.service.AccountServiceI;

@Controller
public class AccountController {
	
	Scanner sc=new Scanner(System.in);
	
	@Autowired
	private AccountServiceI accountServiceI;
	
	
	public Account createacc(Account acc) {
		
		Account createacc = accountServiceI.createacc(acc);
		
		return createacc;
	}
	
	public Account viewaccount(int accno) {
		
		Account viewaccount = accountServiceI.viewaccount(accno);
		
		return viewaccount;
	}
	
	public Account withdrwal(int acc) {
		
		
		Account account= accountServiceI.withdrawl(acc);
		
		return account;
		
		
		
	}
	
	
	
	public Account deposit(int accno) {
		
		Account account = accountServiceI.deposit(accno);
	
			return account;
		}
		
	
	
	public Account update(int aacno) {
		
		Account updateacc = accountServiceI.updateacc(aacno);
		
		return updateacc;
	}

}

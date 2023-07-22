package com.BankApplication;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.BankApplication.controller.AccountController;
import com.BankApplication.model.Account;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		
		AccountController controller = context.getBean(AccountController.class);
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Welcome To Bank Application");
		
		boolean bag=true;
		
		while(bag) {
			
			System.out.println("Press 1 for Create Account");
			System.out.println("Press 2 for View Account Details");
			System.out.println("Press 3 for Withdrawl Money");
			System.out.println("Press 4 for Deposit Money");
			System.out.println("Press 5 for Update Account Details");
			System.out.println("Press 6 for Exit");
			
			int choice = sc.nextInt();
			
			switch(choice) {
			
			case 1:
				Account acc=new Account();
				
				System.out.println("Enter a name:");
				String name = sc.next();
				acc.setName(name);
				
				System.out.println("Enter a Add:");
				String add = sc.next();
				acc.setAdd(add);
				
				System.out.println("Enter a Panno:");
				String panno = sc.next();
				acc.setPanno(panno);
				
				System.out.println("Enter a Money you want to deposit :");
				double bal = sc.nextDouble();
				acc.setBalance(bal);
				
				Account createacc = controller.createacc(acc);
				
				break;
				
			case 2:
				System.out.println("Enter Your Account :");
				int no = sc.nextInt();
				
				Account viewaccount = controller.viewaccount(no);
				
				
				if(viewaccount!=null) {
					
					System.out.println(viewaccount);
				}
				else {
					
					System.out.println("Invalid Account Number");
				}
				
				break;
				
			case 3:
				
				System.out.println("Enter Your Account :");
				int no1 = sc.nextInt();
				
				Account withdrwal = controller.withdrwal(no1);
				
				if(withdrwal!=null) {
					
					System.out.println(withdrwal);
				}
				
				else {
					System.out.println("Invalid Account Number");
				}      
				
				break;
			
			case 4:
				System.out.println("Enter Your Account :");
				int no2 = sc.nextInt();
				
				Account deposit = controller.deposit(no2);
				
				if(deposit!=null) {
					
					System.out.println(deposit);
				}
				
				else {
					
					System.out.println("Invalid Input");
				}
				
				break;
				
			case 5:
				System.out.println("Enter Your Account :");
				int no3 = sc.nextInt();
				
				Account update = controller.update(no3);
				
				if(update!=null) {
					
					System.out.println(update);
				}
				else {
					
					System.out.println("Invalid Account Number");
				}
				
			case 6:
				bag=false;
				break;
				
			default :
				System.out.println("Invalid input");
			}
		}
		
	System.out.println("Thank You For Using XYZ Bank Application");	
	}

}

package com.BankApplication.service;

import java.util.Optional;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BankApplication.model.Account;
import com.BankApplication.repository.AccountRepository;

@Service
public class AccountService implements AccountServiceI {

	Scanner sc = new Scanner(System.in);

	@Autowired
	private AccountRepository accountRepository;
	
	
	

	@Override
	public Account createacc(Account acc) {
		
		System.out.println("Choose a Account Type");

               
		System.out.println("Your are Choose Saving Account Type");
		
		Account save = accountRepository.save(acc);

		return save;
	}
	
	
	
	

	@Override
	public Account viewaccount(int accno) {

		boolean existsById = accountRepository.existsById(accno);

		if (existsById) {

			Account account = accountRepository.findById(accno).get();

			return account;
		} else {

			return null;
		}
	}
	
	
	

	@Override
	public Account withdrawl(int accno) {

		boolean existsById = accountRepository.existsById(accno);

		if (existsById) {

			Account account = accountRepository.findById(accno).get();

			System.out.println("Enter a Amount Want to withdrwal ");
			double nextDouble = sc.nextDouble();

			if (nextDouble <= account.getBalance()) {

				double balance = account.getBalance() - nextDouble;
				account.setBalance(balance);

				accountRepository.save(account);

				System.out
						.println("Money Withdrawl Succesfully..Your Cuurent Account Balance : " + account.getBalance());

				return account;

			} else {

				System.out.println("Insufficient Balance In Your Account");
				return account;
			}

		} else {

			return null;
		}

	}

	
	
	@Override
	public Account deposit(int accno) {

		boolean existsById = accountRepository.existsById(accno);

		if (existsById) {

			Account account = accountRepository.findById(accno).get();

			System.out.println("Enter a Amount You Want to Deposit:");
			double money = sc.nextDouble();

			double balance = money + account.getBalance();

			account.setBalance(balance);

			accountRepository.save(account);

			System.out.println("Money Deposit Successfully..Current Balance in Your Account : " + account.getBalance());

			return account;

		} else {

			return null;
		}
	}
	
	
	

	@Override
	public Account updateacc(int accno) {

		boolean existsById = accountRepository.existsById(accno);

		if (existsById) {

			Account account = accountRepository.findById(accno).get();

			boolean flag = true;

			while (flag) {
				System.out.println("Press 1 for update Name :");
				System.out.println("Press 2 for Update Add");
				System.out.println("Press 3 for update Panno");
				System.out.println("Press 4 for Exit to main menu");

				int nextInt = sc.nextInt();

				switch (nextInt) {

				case 1:
					System.out.println("Enter a Name : ");
					String name = sc.next();
					account.setName(name);
					accountRepository.save(account);
					System.out.println("Name Updated Successfully");
					break;

				case 2:
					System.out.println("Enter a Add");
					String add = sc.next();
					account.setAdd(add);
					accountRepository.save(account);
					System.out.println("Address updated Successfully");
					break;

				case 3:
					System.out.println("Enter a Panno");
					String panno = sc.next();
					account.setPanno(panno);
					accountRepository.save(account);
					System.out.println("Address updated Successfully");
					break;

				case 4:
					flag = false;
					break;

				default:
					System.out.println("Invalid Input");

				}

			}

			return account;
		}

		else {

			return null;
		}
	}

}

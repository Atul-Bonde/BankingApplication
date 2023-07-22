package com.BankApplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.BankApplication.model.Account;

@Repository
public interface AccountRepository extends JpaRepository<Account, Integer> {

}

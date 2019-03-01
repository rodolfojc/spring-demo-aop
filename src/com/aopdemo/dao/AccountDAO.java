package com.aopdemo.dao;

import org.springframework.stereotype.Component;

import com.aopdemo.Account;

@Component
public class AccountDAO {
	
	public void addAccount(Account theAccount, boolean vipFlag) {
		
		System.out.println(getClass()+": DOING MY DB WORK, ACCOUNT");
		
	}
	
	public boolean doWork() {
		
		System.out.println(getClass()+": DOING WORK, ACCOUNT");
		
		return false;
	}
	
	
}

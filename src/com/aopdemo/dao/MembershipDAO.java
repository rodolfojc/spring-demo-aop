package com.aopdemo.dao;

import org.springframework.stereotype.Component;

@Component
public class MembershipDAO {

	public boolean addOtherAccount() {
		
		System.out.println(getClass()+ ": DOING MY DB WORK: MEMBERSHIP");
		
		return false;
	}
	
}

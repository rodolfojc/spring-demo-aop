package com.aopdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.aopdemo.dao.AccountDAO;

public class MainDemoApp {

	public static void main(String[] args) {
		
		//READ CONFIG JAVA CLASS
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);
		
		//GET THE BEAN FROM SPRING CONTAINER
		AccountDAO theAccuntDAO = context.getBean("accountDAO", AccountDAO.class);
		
		//CALL METHOS
		theAccuntDAO.addAccount();
		
		//CLOSE CONTEXT
		context.close();
		
	}

}

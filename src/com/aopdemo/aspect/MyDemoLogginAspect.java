package com.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyDemoLogginAspect {
	
	//RELATED ADVICES FOR LOGGING
	
	//@BEFORE
	@Before("execution(public void com.aopdemo.dao.AccountDAO.addAccount())")
	public void beforeAddAccountAdvice() {
		
		System.out.println("Executing @Before advice on addAccount()");
		
	}

}

package com.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) {
		
		//LOAD THE CONFIG FILE
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//RETRIVE BEAN FROM THE SRPING CONTAINER
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		Coach alphaCoach = context.getBean("tennisCoach", Coach.class);
		
		//PRINT THE RESULT 
		boolean result = (theCoach == alphaCoach);
		
		System.out.print("Pointing to the same object: "+result);
		System.out.print("\nMemory location for theCoach: "+theCoach);
		System.out.println("\nMemory location for alphaCoach: "+alphaCoach);
		
		//CLOSE CONTEXT
		context.close();

	}

}

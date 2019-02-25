package com.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		
		//READ SPRING CONFIG FILE
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//GET THE BEAN FROM THE SPRING CONTATINER
		//Coach theCoach = context.getBean("thatSillyCoach", Coach.class);
		Coach theCoach = context.getBean("tennisCoach", Coach.class);	
		
		//CALL METHOD
		System.out.println(theCoach.getDailyWorkout());
		
		//CALL NEEW METHODS
		System.out.println(theCoach.getDailyFortune());
		
		//CLOSE CONTEXT
		context.close();
	}

}

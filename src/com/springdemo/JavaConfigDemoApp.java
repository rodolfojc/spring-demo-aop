package com.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JavaConfigDemoApp {

	public static void main(String[] args) {
		
		//READ SPRING CONFIG FILE
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(SportConfig.class);
		
		//GET THE BEAN FROM THE SPRING CONTATINER
		Coach theCoach = context.getBean("tennisCoach", Coach.class);	
		
		//CALL METHOD
		System.out.println(theCoach.getDailyWorkout());
		
		//CALL NEEW METHODS
		System.out.println(theCoach.getDailyFortune());
		
		//CLOSE CONTEXT
		context.close();
	}

}

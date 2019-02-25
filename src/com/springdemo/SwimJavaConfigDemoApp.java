package com.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SwimJavaConfigDemoApp {

	public static void main(String[] args) {
		
		//READ SPRING CONFIG FILE
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(MyLoggerConfigTwo.class, SportConfig.class);
		
		//GET THE BEAN FROM THE SPRING CONTATINER
		SwimCoach theCoach = context.getBean("swimCoach", SwimCoach.class);	
		
		//CALL METHOD
		System.out.println(theCoach.getDailyWorkout());
		
		//CALL NEEW METHODS
		System.out.println(theCoach.getDailyFortune());
		
		//NEW METHODS
		System.out.println("email: "+theCoach.getEmail());
		System.out.println("team: "+theCoach.getTeam());	
		
		//CLOSE CONTEXT
		context.close();
	}

}

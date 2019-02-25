package com.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//ADD COMPONENT - ANNOTATION
//@Component("thatSillyCoach")

@Component //DEFAULT BEAN ID - FIRST LETTER LOWER CASE
//@Scope("prototype") // ADD SCOPE 
public class TennisCoach implements Coach {

	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	
	//INIT METHOD
	@PostConstruct
	public void doMyStartupStuff() {
		System.out.println(">>TennisCoach: inside the doMyStartupStuff Method");
	}
	
	//DESTROY
	@PreDestroy
	public void doMyCleanupStuff() {
		System.out.println(">>TennisCoach: inside the doMyCleanupStuff Method");
	}
	
	
	/*@Autowired
	public TennisCoach(FortuneService FortuneService) {
		this.fortuneService = FortuneService;
	}*/
	
	public TennisCoach() {
		System.out.println(">>TennisCoach: inside Default Constructor");
	}
	
	/*@Autowired
	public void doSomeCrazyStuff(FortuneService fortuneService) {
		System.out.println(">>TennisCoach: inside doSomeCrazyStuff() Setter");
		this.fortuneService = fortuneService;
	}*/
	
	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volley";
	}

	@Override
	public String getDailyFortune() {
		return this.fortuneService.getFortune();
	}

}

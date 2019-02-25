package com.springdemo;

import org.springframework.beans.factory.annotation.Value;

//NO @COMPONENT ADDED
public class SwimCoach implements Coach {

	private FortuneService fortuneService;
	
	@Value("${foo.email}")
	private String email;
	
	@Value("${foo.team}")
	private String team;
	
	public SwimCoach(FortuneService FortuneService) {
		this.fortuneService = FortuneService;
	}
	
	public String getEmail() {
		return email;
	}

	public String getTeam() {
		return team;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Swim 1000 meter as a warm up";
	}

	@Override
	public String getDailyFortune() {
		return this.fortuneService.getFortune();
	}

}

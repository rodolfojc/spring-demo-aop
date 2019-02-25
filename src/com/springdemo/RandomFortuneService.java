package com.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	//CREATE AN ARRAY OF STRINGS
	private String[] data = {"The journey is the reward", "Today is the day of success", "Goals!!"};
	private Random myRandom = new Random();
	
	@Override
	public String getFortune() {
		
		int index = this.myRandom.nextInt(data.length);
		String fortune = data[index];
		
		return fortune;
	}

}

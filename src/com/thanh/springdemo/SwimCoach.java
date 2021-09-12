package com.thanh.springdemo;

public class SwimCoach implements Coach {
	private FortuneService fortuneService;

	public SwimCoach() {
		System.out.println("calling constructor of swim coach");
	}

	public SwimCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Swim 1000 meters as a warm up";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}

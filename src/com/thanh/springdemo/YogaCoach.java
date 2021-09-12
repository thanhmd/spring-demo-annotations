package com.thanh.springdemo;

public class YogaCoach implements Coach {
	private FortuneService fortuneService;

	public YogaCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Practice yoga more often, please";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}

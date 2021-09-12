package com.thanh.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig2 {
	@Bean
	public FortuneService excitingFortuneService() {
		return new ExcitingFortuneService();
	}

	@Bean
	public Coach yogaCoach() {
		return new YogaCoach(excitingFortuneService());
	}
}

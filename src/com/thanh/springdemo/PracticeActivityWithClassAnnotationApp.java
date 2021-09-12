package com.thanh.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PracticeActivityWithClassAnnotationApp {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig2.class);

		Coach theCoach = context.getBean("yogaCoach", Coach.class);

		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());

		context.close();
	}
}

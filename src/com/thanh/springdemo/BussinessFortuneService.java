package com.thanh.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class BussinessFortuneService implements FortuneService {
	String[] data = { "I", "am", "a", "bussiness" };
	private Random myRandom = new Random();

	@Override
	public String getFortune() {
		int index = myRandom.nextInt(data.length);
		return data[index];
	}

}

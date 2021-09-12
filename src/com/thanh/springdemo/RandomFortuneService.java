package com.thanh.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
//@Component("name")
public class RandomFortuneService implements FortuneService {
	String[] data = { "asdads", "thanh", "sfsdkf", "asdffasd" };
	private Random myRandom = new Random();

	@Override
	public String getFortune() {
		int index = myRandom.nextInt(data.length);
		return data[index];
	}

}

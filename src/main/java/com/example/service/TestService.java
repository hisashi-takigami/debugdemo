package com.example.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class TestService {
	private Integer testInteger;
	private String testString;
	
	public String testMethod() {
		testInteger = Integer.valueOf(9);
		testString = "aaa";
		//Step In TOだとメソッドの中に入る
		this.intoMethod();
		
		if (testInteger.equals(Integer.valueOf(testString))) {
			System.out.println("testInteger = " + testInteger);
			System.out.println("testString = " + testString);
		}
		
		return testString;
	}
	
	public void intoMethod() {
		//StepInToで進めた場合↓の行に止まる
		testString = "3";
		testInteger = Integer.valueOf(3);
	}
}

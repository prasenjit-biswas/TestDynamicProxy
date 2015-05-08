package com.test.buisness.impl;

import com.test.buisness.MockInterface;

public class MockImpl implements MockInterface {

	@Override
	public String sayHello(String name) {
		String greeting = "Hello "+name;
		System.out.println(greeting);
		return greeting;
	}

}

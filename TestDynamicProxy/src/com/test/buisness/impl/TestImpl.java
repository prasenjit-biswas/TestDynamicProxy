package com.test.buisness.impl;

import com.test.buisness.TestIf;

public class TestImpl implements TestIf{

	@Override
	public String doSomething(String something) {
		String makeSomething = something +" do something";
		System.out.println(" makeSomething : "+makeSomething);
		return makeSomething;
	}

}

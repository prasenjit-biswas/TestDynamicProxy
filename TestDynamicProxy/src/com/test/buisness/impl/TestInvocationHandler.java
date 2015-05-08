package com.test.buisness.impl;

import java.lang.reflect.Method;
import java.util.Arrays;

public class TestInvocationHandler implements java.lang.reflect.InvocationHandler{

	private Object mockImpl;
	
	public TestInvocationHandler(Object mockImpl){
		this.mockImpl = mockImpl;
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("doing something before method call");
		System.out.println("Proxy class name : "+proxy.getClass().getName());
		System.out.println("Method name :"+method.getName());
		System.out.println(Arrays.toString(args));
		Object invoke = method.invoke(mockImpl, args);
		System.out.println("doing somethig after method call");
		return invoke;
	}

}

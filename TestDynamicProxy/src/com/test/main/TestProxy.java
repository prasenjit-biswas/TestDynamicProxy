package com.test.main;

import java.lang.reflect.Proxy;

import com.test.buisness.MockInterface;
import com.test.buisness.TestIf;
import com.test.buisness.impl.MockImpl;
import com.test.buisness.impl.TestImpl;
import com.test.buisness.impl.TestInvocationHandler;

public class TestProxy {
	public static void main(String[] args) {
	
		/*MockInterface mi = (MockInterface) Proxy.newProxyInstance(MockInterface.class.getClassLoader(), 
																  new Class<?>[]{MockInterface.class},
																  new TestInvocationHandler(new MockImpl()));
		mi.sayHello("Prasenjit");*/
		TestIf ti = (TestIf) Proxy.newProxyInstance(TestIf.class.getClassLoader(),
													new Class<?>[]{TestIf.class},
													new TestInvocationHandler(new TestImpl()));
		ti.doSomething("Prasenjit");
	}
}

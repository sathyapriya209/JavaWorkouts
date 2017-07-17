package com.ocjp;

public class OverridingTest {
	protected Number add(Number a, Number b) throws Exception {
		System.out.println("parent");
		int c = a + b;
		return c;
	}
}

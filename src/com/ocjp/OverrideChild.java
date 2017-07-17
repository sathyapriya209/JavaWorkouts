package com.ocjp;

public class OverrideChild extends OverridingTest {
	@Override
	public Integer add(Integer a, Integer b) throws NumberFormatException {
		System.out.println("child");
		int c = a + b;
		return c;
	}

	public static void main(String[] args) {
		OverrideChild ch = (OverrideChild) new OverridingTest();
		System.out.println(ch.add(1, 1));
	}

}

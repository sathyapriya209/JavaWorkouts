package com.ocjp;

public class Test {
	public static void main(String[] args) {
		TestA t = new TestA() {
			@Override
			public String toString() {
				return "test";
			}
		};
		System.out.println(t);
		parse("inv");
	}

	public static void parse(String str) {
		float f = 0;
		try {
			 f = Float.parseFloat(str);
		} catch (NumberFormatException nfe) {
			f = 0;
		} finally {
			System.out.println(f);
		}
	}
}

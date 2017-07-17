package com.ocjp;

public class TestString1 implements Comparable {
	public static void main(String[] args) {
		String str = "420";
		str = "ggg" + 42;
		System.out.print(str);
	}

	static void test() throws RuntimeException {
		try {
			System.out.print("test ");
			throw new RuntimeException();
		} catch (Exception ex) {
			System.out.print("exception ");
		}
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

	
}

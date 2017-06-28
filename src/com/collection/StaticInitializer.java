package com.collection;

import java.util.Scanner;

public class StaticInitializer {
	public static int B = 0;
	public static int H = 0;
	public static int area;
	public static boolean flag = false;


	static {
		Scanner sc = new Scanner(System.in);
		B = sc.nextInt();
		Scanner sc1 = new Scanner(System.in);
		H = sc1.nextInt();
		try {
			if ((B > 0) && (H > 0)) {
				flag = true;
			}
		} catch (Exception e) {
			System.out.print("java.lang.Exception: Breadth and height must be positive");
		}

	}

	public static void main(String[] args) {

		if (flag) {
			int area = B * H;
			System.out.println(area);
		}
	}

}

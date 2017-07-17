package com.ocjp;

import java.util.Arrays;

public class Sort {

		public static void main(String[] args) {
		String[] colors = {"blue", "red", "green", "orange"};
		Arrays.sort(colors);
		int s2 = Arrays.binarySearch(colors, "orange");
		int s3 = Arrays.binarySearch(colors, "pik");
		System.out.println(s2 + " " + s3);
		}
}
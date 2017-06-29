package com.collection;

import java.util.ArrayList;
import java.util.Scanner;

public class SparseArrayTest {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		String[] str = new String[n];
		for (int i = 0; i < n; i++) {
			str[i] = in.next();
		}
		int q = in.nextInt();
		String[] str1 = new String[q];
		for (int i = 0; i < q; i++) {
			str1[i] = in.next();
		}
		int count = 0;
		for (int j = 0; j < q; j++) {
			count = 0;
			for (int i = 0; i < n; i++) {
				if (str[i].equals(str1[j])) {
					count = count + 1;
				}
			}
			System.out.println(count);

		}
		in.close();
	}

}

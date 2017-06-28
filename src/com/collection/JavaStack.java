package com.collection;

import java.util.Stack;

public class JavaStack {

	public static void main(String[] args) {
		Stack<Character> s = new Stack<>();
		String str = "({()})";
		char[] ch1 = str.toCharArray();
		boolean status = true;
		for (char ch : ch1) {
			if (ch == '(' || ch == '{' || ch == '[') {
				s.push(ch);
			} else if ((s.peek() == '(' && ch == ')') || (s.peek() == '{' && ch == '}')
					|| (s.peek() == '[' && ch == ']')) {
				s.pop();
			} else {
				status = false;
				break;
			}
		}
		if (status && s.size() == 0) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}

	}
}

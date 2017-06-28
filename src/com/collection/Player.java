package com.collection;

public class Player implements Comparable<Player> {
	private String name;
	private int score;

	@Override
	public int compareTo(Player o) {
		this.name.compareTo(o.name);
		return 0;
	}
}

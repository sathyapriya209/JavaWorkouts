package com.simplejavaprograms;

public class PassByValue {

	public static void main(String[] args) {
		PassByValue pv = new PassByValue();
		Dog d = pv.new Dog("mani");
		passByValueCheck(d);
		System.out.println(d.getName());
	}

	private static void passByValueCheck(Dog f) {
		PassByValue pv = new PassByValue();
		Dog c = pv.new Dog("jacky");
		f = c;
		//f.setName("jacky");
	}

	class Dog {
		private String name;

		public Dog(String name) {
			this.name = name;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

	}
}

package com.inheritance;

public abstract class TestAnimal {
	
	public abstract void moveAnimal(Animal c);
	
	public static void main(String[] args) {
		Animal c = new Cat();
		Animal d = new Dog();
		Animal a = new Animal();
		
		Cat cc = (Cat) new Animal();
		
		TestAnimal animal = new TestAnimal() {
			
			@Override
			public void moveAnimal(Animal c) {
				c.move();
				
			}
		};
		animal.moveAnimal(c);
		animal.moveAnimal(d);
		animal.moveAnimal(a);
	}

}

package com.inheritance;

public class Child extends Parent {
	
	private int num = 10;

	   // display method of sub class
	@Override
	   public void display() {
	      System.out.println("This is the display method of subclass");
	   }
	   public void my_method() {
	      // Instantiating subclass
	      //Child sub = new Child();

	      // Invoking the display() method of sub class
	      this.display();

	      // Invoking the display() method of superclass
	      super.display();

	      // printing the value of variable num of subclass
	      System.out.println("value of the variable named num in sub class:"+ this.num);

	      // printing the value of variable num of superclass
	      System.out.println("value of the variable named num in super class:"+ super.num);
	   }

	   public static void main(String args[]) {
	      Child obj = new Child();
	      obj.my_method();
	   }


}

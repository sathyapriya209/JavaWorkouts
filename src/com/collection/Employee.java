package com.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Employee  {
	
	private String name;
	private int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	
	
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + "]";
	}
	public static void main(String[] args) {
		List<Employee> li = new ArrayList<Employee>();
		Employee emp1 = new Employee();
		emp1.setAge(31);
		emp1.setName("Sridhar");
		
		Employee emp2 = new Employee();
		emp2.setAge(27);
		emp2.setName("Sathya");
		
		li.add(emp1);
		li.add(emp2);
		System.out.println(li);
		Collections.sort(li, new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				// TODO Auto-generated method stub
				return 0;
			}
		});
		
		System.out.println(li);
	}
	

}

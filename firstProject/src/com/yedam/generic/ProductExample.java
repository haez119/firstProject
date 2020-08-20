package com.yedam.generic;

import com.yedam.classes.Person;

public class ProductExample {

	public static void main(String[] args) {
		
		Product<String, Person> pr1 = new Product<>();
		
		pr1.setModel(new Person());
		pr1.setType("유형"); // String 클래스는 new 생략 가능
		
		Product<String, Integer> p1 = new Product<>();
		p1.setModel(11); 
		p1.setType("이름");
		Product<String, Integer> p2 = new Product<>();
		p2.setModel(11); 
		p2.setType("이름");
		
		
		boolean tof = Utils.compare(p1, p2);
		
		if (tof)
			System.out.println("논리적으로 동등");
		else
			System.out.println("논리적으로 다름");

	}

}

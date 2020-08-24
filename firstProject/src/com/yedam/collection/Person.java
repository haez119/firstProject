package com.yedam.collection;

public class Person implements Comparable <Person> { // 크다 작다 기준을 위해?
	String name;
	int age;
	
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}


	@Override
	public int compareTo(Person o) {
		// TODO Auto-generated method stub
		return this.age - o.age   ; //나이를 기준으로 크다작다를 구분 
		// 음수(오름차순) , this.age - o.age
		// 양수(내림차순) , o.age - this.age
	}
}

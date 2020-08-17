package com.yedam.classes;

public class Person {
	// 필드
	String name;
	int age;
	
	//생성자
	public Person() { // 매개값 없이 생성 >> 기본 생성자(컴파일러가 자동으로) 
		name = "anonymous";
		age= 10;
	} 
	
	public Person(String name) { // 매개값을 하나 받아서 생성
		this.name = name; 
	}
	
	public Person(String name, int age) { // 매개값을 두개 받아서 생성
		this.name = name; 
		this.age = age;
	}
	
	
	//메소드
	public String introduce() {
		return "이름은 " + name + " 나이는 " + age;
	}
	
	
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

}

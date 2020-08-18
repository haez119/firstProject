package com.yedam.classes;

public class Friend {

	private String name;
	private String number;
	private int age;
	
	public Friend() {}
	
	public Friend(String name, int age, String number) {
		this.name = name;
		this.age = age;
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public String getNumber() {
		return number;
	}

	public int getAge() {
		return age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "일반친구 이름: " + this.name + ", 연락처: " + this.number;
	}
	
	
	

}

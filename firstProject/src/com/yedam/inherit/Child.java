package com.yedam.inherit;

public class Child extends Parent {
	
	//필드
	private int grade;
	
	// 생성자1
	// 부모클래스의 생성자와 같아야?
	public Child(String name, int age) {
		super(name, age); // super >> 부모
	}
	
	// 생성자2
	public Child(String name, int age, int grade) {
		super(name, age);
		this.grade = grade;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}
	

}

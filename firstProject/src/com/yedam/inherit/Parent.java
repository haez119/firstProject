package com.yedam.inherit;

public class Parent {
	private String name;
	private int age;
	
	// Parent 는 부모 클래스 > super ?
	// 모든 클래스는 object 클래스를 상속 하고 있다. (생략된)
	
	public Parent(String name, int age) {
		// 부모클래스 생성자 호출 
		super(); 
		this.name = name;
		this.age = age;
	}
	public Parent() {}
	
	
	@Override
	public String toString() {
		//return super.toString(); // Parent의 부모 클래스의 toString 호출 >> 주소값이 출력됨
		return "Parent [name=" + name + ", age=" + age + "]";
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

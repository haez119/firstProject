package com.yedam.classes.exam;

public class Member {
	private String name;
	private String id;
	private String password;
	private int age;
	
	// 생성자
	public Member(String name, String id) {
		this.name = name;
		this.id = id;
	}
	
	// 메소드
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}

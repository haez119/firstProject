package com.yedam.test;

import java.util.Comparator;

public class User implements Comparable<User> {
	
	String name;
	int grade;
	
	public User(String name, int grade) {
		super();
		this.name = name;
		this.grade = grade;
	}

	@Override
	public int compareTo(User o) {
		// 비교하는 객체 - 비교 대상 객체 2 - 1 : 양수 > 내림차순
		// return o.grade - this.grade; // 내림차순
		return this.name.compareTo(o.name); // 이름을 기준으로 오름차순
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", grade=" + grade + "]";
	}
	
	
	


	
	

}

package com.yedam.classes.abstracts;

public class Dog extends Animal {

	@Override
	public void sound() {
		System.out.println("멍멍");
	}
	
	// 추상메소드 외의 멤버들은 자동상속?

}

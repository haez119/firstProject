package com.yedam.classes.abstracts;

public abstract class Animal { // abstract 추상클래스
	
	private String species;
	public Animal() {
		
	}
	public void showInfo() {
		System.out.println("분류는 " + species);
	}
	
	public void breathe() {
		System.out.println("숨을 쉰다.");
	}
	
	public abstract void sound(); // abstract 추상메소드
	// 구현부가 없음 >> 자식객체에서 재정의 하여 구현부를 생성

}

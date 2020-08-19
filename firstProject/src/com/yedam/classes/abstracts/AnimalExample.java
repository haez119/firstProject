package com.yedam.classes.abstracts;

public class AnimalExample {

	public static void main(String[] args) {
		// Animal anm = new Animal(); 추상 클래스는 인스턴스 생성 불가
		Animal anm = new Cat(); // 자식객체
		anm.breathe(); // cat 클래스에는 sound 메소드만 재정의, breathe는 자동으로
		anm.sound();
		
		anm = new Dog(); // promotion 부모 클래스에 자식 클래서 > 자동 형변환
		anm.breathe();
		anm.sound();
		
		int a = 10;
		double b = a; // 자동 형변환 promotion
		a = (int) b; // casting
		
		Dog dog = (Dog) anm; // casting 강제 형변환
		dog.sound();
		
		
	}
}

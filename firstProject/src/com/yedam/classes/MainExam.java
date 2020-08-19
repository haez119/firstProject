package com.yedam.classes;

final class FinalClass {
	// 클래스에도 사용 가능 
	// 문자열 담는 String 클래스가 final
}
class ExtendClass extends FinalClass {
	// 상속이 금지됨
}

class ExString extends String {
	// 상속 금지 
}



public class MainExam {
	
	final int age = 10; // 필드에서도 사용 가능, 초기값은 필수 고정값 적용에 쓰임 (max값 등)
	
	public static void main(String[] args) {
		
		//인스턴스 >> new 사용하여 객체 생성 필수
		Friend fr = new Friend(); // 인스턴스
		fr.getAge(); // 인스턴스 메소드
		// 인스턴스 멤버
		
		//static 정적 >> new 객체 생성 없어도 메소드 사용가능
		// Calculator cal = new Calculator();
		// cal.add(10, 10);
		Calculator.add(10, 10);
		// 정적 멤버
		
		final int val = 10;
		// val = 20; 변수 값 변경x
		
		MainExam ex = new MainExam();
		// ex.age = 20; 접근 불가 final
		
		
		
		
		
		
	}

}

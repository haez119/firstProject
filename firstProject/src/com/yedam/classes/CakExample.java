package com.yedam.classes;

public class CakExample {
	public static void main(String[] args) {
		
		Cal cal = new Cal();
		// cal.r = -5; >> 잘못된 값 넣지 못하게 private 사용 (메소드로 제한하기)
		// System.out.println("반지름: " + cal.r + " 의 넓이는 : " + cal.getArea());
		
		cal.setRadius(-5);
		System.out.println("반지름: " + cal.getRadius() + " 의 넓이는 : " + cal.getArea());
		
		cal.setRadius(5);
		System.out.println("반지름: " + cal.getRadius() + " 의 넓이는 : " + cal.getArea());
		
//		System.out.println(10);
//		System.out.println(10.5);
//		System.out.println("10");
		
		print(200);
	
		
	}
	// 동일한 메소드 명 여러개 사용하기  >> 메소드 오버로딩
	// 메소드 오버로딩 하려면 매개값의 타입이 다르거나 개수가 달라야 함 
	public static void print(int a) {
		System.out.println("입력값은 : " + a);
	}
	
	public static void print(double a) {
		System.out.println("입력값은 : " + a);
	}
	
	public static void print(String a) {
		System.out.println("입력값은 : " + a);
	}
	
	
	
}

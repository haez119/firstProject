package com.yedam.dev;

public class MorningCode {

	public static void main(String[] args) {
		String str1 = "Hello";
		String str2 = "world";
		String name = "민해주";
		
		System.out.println(str1 + ", " + name); 
		
		int v1 = 150, v2 = 270;
		int result = add(v1, v2); // 반환값이  int타입, int 타입 변수에 반환값을 저장해줘야 한다
		System.out.println("결과값: " + result);
		introduce("홍길동"); // 반환 값 x 호출만 하면 된다.
		
		result = minus(v1,v2);
		System.out.println("결과는 " + result);
		
		
	
	} // main
	
	public static void introduce(String name) { 
		System.out.println("안녕하세요. 저는 " + name + "입니다.");
	}
	
	public static int add(int x, int y) { // add 라는 method 생성 
		 //int 수 2개 받아서
		int sum = x + y;
		return sum; //sum을 리턴
		// x, y는 메소드 블럭 안에서 선언 밖에서 사용불가?
	}
	
	public static int minus(int x, int y) {
		int minus = x - y;
		return minus;
	}
	
} // 클래스

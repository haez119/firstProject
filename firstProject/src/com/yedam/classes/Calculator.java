package com.yedam.classes;

public class Calculator {
	
	// static 고정 되어 있다? >> new 키워드 사용하여 새 인스턴스 만들지 않더라고 클래스 이름으로 메소드 호출 가능
	// static 메소드에 필드 사용하려면 필드도 static 선언 해 주어야 함 >> 정적멤버(new 사용 안해도) <> 인스턴스 멤버(new 사용 필)
	// pi 는 new 사용해야 메모리에 로딩되기 때문
	private static double pi = 3.14;
	
	public static String getRectagle(int x, int y) {
		// 메소드 안에 또 메소드를 호출하기
		// return "가로 " + x + ", 세로 " + y + "의 넓이는 " + calRectagle(x,y) + "입니다."
		return "가로 " + x + ", 세로 " + y + "의 넓이는 " + (x * y) + "입니다.";
	}
	
	public static int calRectagle(int x, int y) {
		return x * y;
	}
	
	public static int add(int x, int y) {
		int sum = x + y;
		return sum;
		
	}
	
	public static double add(double x, double y) {
		return x + y;
	}
	
	public static void getArea(double a) {
		double result = pi * a * a;
		System.out.println("반지름 " + a + "의 넓이는 " + result);
	}
	

}

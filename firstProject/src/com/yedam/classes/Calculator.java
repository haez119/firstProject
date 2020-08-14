package com.yedam.classes;

public class Calculator {
	
	double pi = 3.14;
	
	public String getRectagle(int x, int y) {
		// 메소드 안에 또 메소드를 호출하기
		// return "가로 " + x + ", 세로 " + y + "의 넓이는 " + calRectagle(x,y) + "입니다."
		return "가로 " + x + ", 세로 " + y + "의 넓이는 " + (x * y) + "입니다.";
	}
	
	public int calRectagle(int x, int y) {
		return x * y;
	}
	
	public int add(int x, int y) {
		int sum = x + y;
		return sum;
		
	}
	
	public double add(double x, double y) {
		return x + y;
	}
	
	public void getArea(double a) {
		double result = pi * a * a;
		System.out.println("반지름 " + a + "의 넓이는 " + result);
	}
	

}

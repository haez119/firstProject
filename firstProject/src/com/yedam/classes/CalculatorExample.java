package com.yedam.classes;

public class CalculatorExample {
	public static void main(String[] args) {
		
		// Calculator cal = new Calculator();
		
//		System.out.println("10 + 20 = " + cal.add(10, 20));
//		System.out.println("10.0 + 20.0 = " + cal.add(10.0, 20.0));
		
		System.out.println("10 + 20 = " + Calculator.add(10, 20)); // 클래스 이름으로 호출
		System.out.println("10.0 + 20.0 = " + Calculator.add(10.0, 20.0));
		
		double r1 = 3.5;
		// cal.getArea(r1);
		Calculator.getArea(r1);
		
		// System.out.println(cal.getRectagle(4, 5));
		System.out.println(Calculator.getRectagle(4, 5));
		
		
		
	}
}

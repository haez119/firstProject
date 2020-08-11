package com.yedam.test;

public class Test6 {

	public static void main(String[] args) {
		int intValue = 10;
		char charValue = 'A';
		double doubleValue = 5.7;
		String strValue = "A";
		
		double var1 = (double) intValue;
		byte var2 = (byte) intValue;
		int var3 = (int) doubleValue;
		// char var4 = (char) strValue;
		// String는 클래스? 문자열은 기본타입으로 강제 형변환 자체가 안됨
		// 스택영역  힙영역? 기본타입은 / 참조데이터타입? 힙영역 주소?

	}

}

package com.yedam.oper;

public class BitOperatorExample {

	public static void main(String[] args) {
		int v1 = 10;
		int v2 = ~v1; // 비트 반전?
		System.out.println("v1 : " + v1);
		System.out.println("v2 : " + v2);
		
		byte b1 = 10;
		byte b2 = 5;
		int b3 = b1 % b2;  // (모든) 연산 시 int 타입
		
		int result1 = 10 / 4; // 원래 결과 2.5 -> 정수 2만 저장
		double result2 = 10 / 4; // 2.0이 저장 
		double result3 = 10 / 4.0; //연산은 항상 int 10/4.0 -> 크기가 더 큰 double로 자동 형변환 돼서 2.5가 저장됨
		System.out.println(result1 +"," + result2 + "," + result3);
	}

}

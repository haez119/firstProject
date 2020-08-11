package com.yedam.dev;

public class OperatorExample {

	public static void main(String[] args) {
		int val1 = 10;
		int result = -3 + (8 - 5) * 4 + val1++; // -3 => val1++ => 괄호
		System.out.println(result);
		
		
		result = 10 % 7; // 나머지 저장
		System.out.println("나머지 : " + result);
		
		result = 10 / 7; // 몫 저장
		System.out.println("나누기1 : " + result);
		
		// 10 / 7 은 정수로 계산된다 (1.0 으로 출력)
		double r1 = 10 / 7.0; 
		System.out.println("나누기2 : " + r1);
		
		for (int i = 1; i<=10 ; i++) {
			if (i%2 == 1) {
				System.out.println(i + "는 홀수입니다.");
			} else {
				System.out.println(i + "는 짝수입니다.");
			}
		} // for 안에 if / if를 반복
		

	}

}































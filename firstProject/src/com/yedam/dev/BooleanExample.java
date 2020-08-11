package com.yedam.dev;

public class BooleanExample {

	public static void main(String[] args) {
		long l1 = 10L;
		int i1 = 10;
		
		// true false 만 사용가능
		boolean trueOrFalse = false;
		System.out.println(trueOrFalse);
		
		// = 대입 , == 비교, != 비교
		trueOrFalse = l1 != i1;
		
		if (!trueOrFalse) {  // not => !변수 => 변수가 참이면 거짓, 거짓이면 참이 된다
			System.out.println("이 내용은 참일 경우에 출력됩니다.");
		}
		// if (l1 == i1) => true
		
		// >, <, >=, <=
		if (l1 >= i1) {
			System.out.println("왼쪽이 크거나 같습니다.");
		}
		
		

	}

}

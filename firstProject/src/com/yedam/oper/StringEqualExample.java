	package com.yedam.oper;

public class StringEqualExample {

	public static void main(String[] args) {
		int v1 = 20;
		int v2 = 30;
		if (v1 == v2) {
			System.out.println("기본 타입 일 경우 비교");
		}
		
		String str1 = "Hello"; // 문장의 내용이 같으면 같은 주소값 참조
		String str2 = "Hello";
		String str3 = new String ("Hello"); // new? 연산자 사용시 문장의 내용이 같아도 다른 주소값 > .equals 
		
		// == 연산자는 변수가 갖고 있는 실제 값을 비교
		// String 타입 변수는 주소값을 가지고 있음 
		
		if (str1 == str2) { 
			System.out.println("str1, str2는 같은 문자입니다.");
		}
		
		if (str1.equals(str3)) {
			System.out.println("str1, str3은 같은 문자입니다.");
		}
		
		System.out.println((1 == 1) || (2 == 3) );
		
		
		
	}

}

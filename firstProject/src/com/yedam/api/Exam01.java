package com.yedam.api;

import java.io.IOException;

public class Exam01 {

	public static void main(String[] args) throws IOException {
		
		byte[] byte1 = { 72, 101, 108, 108, 111, 32, 74, 97, 118, 97};
		
		// bytes 배열 값을 String 에 저장.. 아스키코드로 보면 Hello java
		String str1 = new String(byte1);
		System.out.println(str1);
		
		String str2 = new String(byte1, 6, 4); // 인덱스 6번에서  4글자만 인덱스 자리 포함
		System.out.println(str2);
		
		byte[] byte2 = new byte[100];
		
		System.out.print("입력: ");
		
		int readByteNo = System.in.read(byte2); // 입력값을 바이트로 저장?
		
		
		 String str = new String(byte2, 0, readByteNo-2);
		 System.out.println(str + ", " + readByteNo);
		
		
		
		String ssn = "12345-1234567";
		char sex = ssn.charAt(7);
		
		switch(sex) {
		
		case '1':
		case '3':
			System.out.println("남자입니다.");
			break;
		case '2':
		case '4':
			System.out.println("남자입니다.");
			break;	
		}
		
		
		
		
		

	}

}

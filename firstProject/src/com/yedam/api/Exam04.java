package com.yedam.api;

public class Exam04 {

	public static void main(String[] args) {

		String ssn[] = { "990205-1234567", "010205/1234567", " 980205*2234567", "0102054734567" };

		for(int i=0; i< ssn.length; i++) {
			switch(method2(ssn[i])) {
			case '1':
			case '3':
				System.out.println("남자입니다.");
				break;
			case '2' :
			case '4' :
				System.out.println("여자입니다.");
				break;
			}
		}
	}
	
	public static char method2(String str) {
		
		return str.substring(str.length()-7, str.length()).charAt(0);
		
	}
}

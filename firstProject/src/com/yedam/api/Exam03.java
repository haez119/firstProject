package com.yedam.api;

public class Exam03 {
	public static void main(String[] args) {
		String subject = "자바 프로그래밍";
		
		// 문자의 위치를 반환 (인덱스)
		int location = subject.indexOf("프로그래밍"); // 프로그래밍 글자의 위치 반환?
		System.out.println(location);
		
		// 해당 문자가 없으면 -1을 반환
		if(subject.indexOf("자바") != -1) {
			System.out.println("자바와 관련된 책이군요");
		} else {
			System.out.println("자바와 관련없는 책이군요");
		}
		
		// 문자 바꾸기
		String str1 = ("자바는 객체지향 언어 입니다. 자바는 풍부한 API를 지원합니다.");
		String str2 = str1.replace("자바", "java");
		System.out.println(str1);
		System.out.println(str2);
		
		
	}

}

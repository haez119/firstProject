package com.yedam.example;

public class NewExample2 {

	public static void main(String[] args) {
		nvl(null, "초기값");
		nvl("입력값", "초기값");

	}
	
	public static void nvl(String str1, String defaultValue) {
		
		System.out.println((str1 == null) ? defaultValue : str1);
	
		
	}

}

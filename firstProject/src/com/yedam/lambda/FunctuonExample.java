package com.yedam.lambda;

import java.util.function.Function;

public class FunctuonExample {
	public static void main(String[] args) {
		
		// 매개값 S, 반환값S
		Function<String, String> func1 = (str) -> {
			return str + " is nothing";
		};
		
		String result= func1.apply("Something");
		System.out.println(result);
		
		// 매개값S, 반환값I
		Function<String, Integer> func2 = (str) -> {
			return str.length();
		};
		
		int len = func2.apply("Hello");
		System.out.println(len);
		
		
		
	}
}

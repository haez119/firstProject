package com.yedam.example;

import java.util.Objects;

public class NullExample {

	public static void main(String[] args) {
		String str1 = "홍길동";
		String str2 = null;
		
		System.out.println(Objects.requireNonNull(str1));
		
		try {
			String name = Objects.requireNonNull(str2);			
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		// 1번 매개값이 null이면 nullpointE~ 발생. 2번 매개값은 nullpointE~ 의 예외메세지
		try {
			String name1 = Objects.requireNonNull(str2, "이름이 없습니다.");	
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		try {
			String name1 = Objects.requireNonNull(str2, () ->"이름 없다고");	//람다식??????
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		String name1 = Objects.requireNonNull(str1, "이름이 없습니다.");	
		System.out.println(name1);
		
	}
}

package com.yedam.example;

import java.util.Objects;

public class NullExample {

	public static void main(String[] args) {
		String str1 = "홍길동";
		String str2 = null;
		
		System.out.println(Objects.requireNonNull(str1));
		
		String name = Objects.requireNonNull(str2);
		
		String name1 = Objects.requireNonNull(str2, "이름이 없습니다.");
	

	}

}

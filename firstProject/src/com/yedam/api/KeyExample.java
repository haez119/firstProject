package com.yedam.api;

import java.util.HashMap;

public class KeyExample {

	public static void main(String[] args) {
		
		// Key를 식별키로 사용해서 String 값 저장하는 hashMap 생성
		
		HashMap<Key, String> hm = new HashMap<>();
		
		hm.put(new Key(1), "홍길동"); // 1번이 생성자. Key클래스의 필드인 id에 홍길동이 저장?
		
		String value = hm.get(new Key(1)); // 키가 1번인 값을 가져와 저장
		System.out.println(value);
		

	}

}

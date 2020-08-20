package com.yedam.collection;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {
		
		// HashSet 자식 / set 부모 (인터페이스 이므로 hashset 이용하여 반드시 구현 해줘야 한다.) 
		Set<Member> set = new HashSet<>(); 
		
		set.add(new Member("이름1", 20));
		set.add(new Member("이름2", 21)); // set는 중복값 저장 x
		set.add(new Member("이름3", 21)); // new 연산자 사용하여 값 넣었기 때문에 전부 저장이 된다.
		
		for (Member mem : set) {
			System.out.println(mem.getName() + ", " + mem.getAge());
		}
		// 이름이 같고 나이가 같으면 동일객체로 보고 생성x >> 
		// 이름만 같으면 동일 객체로 보겠다
		
		

	}

}

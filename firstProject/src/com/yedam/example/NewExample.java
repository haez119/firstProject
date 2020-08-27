package com.yedam.example;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;


public class NewExample {
	Member mem; // 필드
	
	class Member { // 중첩클래스
		String id;
		Member(String id) {
			this.id = id;
		}
		
		@Override
		public boolean equals(Object obj) {
			if(obj instanceof Member) {
				Member mem = (Member) obj;
				return id.equals(mem.id);
				
			} else {
				return false;
			}
		}
		
		@Override
		public int hashCode() {
			//return super.hashCode();
			return Objects.hash(id); // 해시코드 값으로 id를 줌
		}
	}
	
	
	public static void main(String[] args) {
		
		// 중첩 클래스 사용하기 >> 생성 2번
		NewExample ne = new NewExample();
		Member m1 = ne.new Member("hong");
		Member m2 = ne.new Member("hong");
		System.out.println(m1.equals(m2)); // 재정의 전에는 false가 나옴 new라서?
		
		System.out.println(Objects.hash("hhh")); // 동일한 값, 문자열이면 같은 임의의 숫자를 반환
		//System.out.println(hashCode(new Integer(1)));
		
		Set<Member> set = new HashSet<>(); // 중복 제외
		set.add(m1);
		set.add(m2);
		for(Member m : set) {
			System.out.println(m.id);
		}
		
	}
	
	
}


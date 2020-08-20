package com.yedam.collection;

public class Member {
	
	private String name;
	private int age;
	
	public Member(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	@Override
	public int hashCode() {
		
		return this.name.hashCode(); // age 기준으로 age가 같으면 논리적으로 같은 객체로 봄 >> 중복저장x
		//return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		Member mem = (Member) obj; // obj 부모 / member 자식 >> 강제형변환
		//return this.name.equals(mem.name);
		return true;
		// 필드 name과 매개값으로 오는 클래스의 .name이 같으면 ture; >> 동일한 객체로 보겠다.
		
		//return super.equals(obj); >> 주소를 비교 > new 때문에 다른 객체로 인식
	}
	
	
	
	

}

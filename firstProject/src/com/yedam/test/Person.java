package com.yedam.test;

public class Person {
	
	String name;
	int age;
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public int hashCode() { // 기준
		return this.name.hashCode();
	}

	@Override
	public boolean equals(Object obj) { // 옵션?
		
		Person p = (Person) obj; // 매개값으로 들어온 객체 형변환
		return this.name.equals(p.name); // Person의 name과 매개값 형변환 name을 비교
		// return true;
		//return this.age == p.age;
		
	}
	
	// 이름, 나이 같아야 동일객체 >> hashCode, equals 다 재정의
	// 나이만 같으면 동일객체 >> name을 비교했던 equals 는 true를 리턴
	// 이름만 같으면 동일객체 >> hashCode를 name으로 변경? return this.name.hashCode();
	
	
	
	
}

package com.yedam.api;

public class MemberExample {

	public static void main(String[] args) {
		Object obj01 = new Object();
		Object obj02 = new Object();
		
		boolean result = obj01.equals(obj02);
		boolean result2 = obj01 == obj02;
		
		System.out.println("재정의 전: " + result + ", " + result2);
		
		Member obj1 = new Member("blue");
		Member obj2 = new Member("blue");
		Member obj3 = new Member("red");
		
		// equals 재정의 
		if(obj1.equals(obj2)) {
			System.out.println("obj1과 obj2는 동등합니다.");
		}else {
			System.out.println("obj1과 obj2는 동등하지 않습니다.");

		}
		
		if(obj1.equals(obj3)) {
			System.out.println("obj1과 obj3는 동등합니다.");
		}else {
			System.out.println("obj1과 obj3는 동등하지 않습니다.");

		}
		
		
	}

}

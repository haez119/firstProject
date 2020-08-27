package com.yedam.example;

import java.util.Arrays;

import com.yedam.example.MemberExample.Member;

public class MemberExample2 {
	
	static public class Car {
		public String model;
		public Car(String model) {
			this.model = model;
		}
	}

	static class Member implements Cloneable {

		public String name;
		public int age;
		public int[] scores;
		public Car car;

		public Member(String name, int age, int[] scores, Car car) {
			super();
			this.name = name;
			this.age = age;
			this.scores = scores;
			this.car = car;
		}

		// clone() 메소드 재정의
		@Override
		protected Object clone() throws CloneNotSupportedException {
			// 얕은 복제 한 다음에
			Member cloned = (Member) super.clone();
			// 깊은복제하기
			cloned.scores = Arrays.copyOf(this.scores, this.scores.length);
			cloned.car = new Car(this.car.model);
			return cloned;
		}

		public Member getMember() {
			Member cloned = null;
			try {
				cloned = (Member) clone();
			} catch (CloneNotSupportedException e) {
				e.printStackTrace();
			}
			return cloned;
		}
	}

	public static void main(String[] args) {
		
		Member original = new Member("홍길동", 25, new int[] {90, 90}, new Car("소나타"));
		
		Member cloned = original.getMember(); // 복제함수
		cloned.scores[0] = 100;
		cloned.car.model = "그랜저";
		
		System.out.println("[복제 객체의 필드값]");
		System.out.println("name: " + cloned.name);
		System.out.println("age: " + cloned.age);
		System.out.print("scores: {");
		for(int i=0; i<cloned.scores.length; i++) {
			System.out.print(cloned.scores[i]);
			System.out.print(( i ==(cloned.scores.length-1)) ? "" : ",");
		}
		System.out.println("}");
		System.out.println("car: " + cloned.car.model);
		
		System.out.println();
		
		System.out.println("[원본 객체의 필드값]");
		System.out.println("name: " + original.name);
		System.out.println("age: " + original.age);
		System.out.print("scores: {");
		for(int i=0; i<original.scores.length; i++) {
			System.out.print(original.scores[i]);
			System.out.print(( i ==(original.scores.length-1)) ? "" : ",");
		}
		System.out.println("}");
		System.out.println("car: " + original.car.model);
		
		
		System.out.println();
		
		original.scores[0] = 10;
		original.car.model = "차차";

		System.out.println("[원본 객체의 필드값]");
		System.out.println("name: " + original.name);
		System.out.println("age: " + original.age);
		System.out.print("scores: {");
		for(int i=0; i<original.scores.length; i++) {
			System.out.print(original.scores[i]);
			System.out.print(( i ==(original.scores.length-1)) ? "" : ",");
		}
		System.out.println("}");
		System.out.println("car: " + original.car.model);
		
		System.out.println();
		
		System.out.println("[복제 객체의 필드값]");
		System.out.println("name: " + cloned.name);
		System.out.println("age: " + cloned.age);
		System.out.print("scores: {");
		for(int i=0; i<cloned.scores.length; i++) {
			System.out.print(cloned.scores[i]);
			System.out.print(( i ==(cloned.scores.length-1)) ? "" : ",");
		}
		System.out.println("}");
		System.out.println("car: " + cloned.car.model);

	}

}

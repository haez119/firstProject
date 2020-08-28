package com.yedam.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class People {
	String name;
	int age;
	Pet[] pets;
	Fruit[] fruits;

	public People(String name, int age, Pet[] pets, Fruit[] fruits) {
		super();
		this.name = name;
		this.age = age;
		this.pets = pets;
		this.fruits = fruits;
	}

	@Override
	public String toString() {
		return "이름: " + name + ", 나이: " + age + "\n애완동물 " + Arrays.toString(pets)+ "\n과일 "
				+ Arrays.toString(fruits);
	}
}
class Pet {
	String name;
	int age;
	String gender;

	public Pet(String name, int age, String gender) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "이름: " + name + ", 나이: " + age + ", 성별: " + gender;
	}
}

class Fruit {
	String name;
	int price;

	public Fruit(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}

	@Override
	public String toString() {
		return "이름: " + name + ", 가격: " + price ;
	}
	
	
}

public class LastExample {

	public static void main(String[] args) {

		People pp1 = new People("이름1", 21, 
				 	 new Pet[] { new Pet("야옹이", 2, "수컷"), new Pet("멍멍이", 4, "암컷") },
				 	 new Fruit[] { new Fruit("사과", 1000), new Fruit("배", 2000) });
		
		People pp2 = new People("이름2", 21, 
					 new Pet[] { new Pet("거북이", 2, "수컷"), new Pet("붕어", 2, "수컷") },
					 new Fruit[]{ new Fruit("사과", 1000), new Fruit("배", 2000) });
		
		
		People pp3 = new People("이름3", 21, 
					 new Pet[] { new Pet("야옹이", 5, "수컷"), new Pet("멍멍이", 5, "암컷") },
					 new Fruit[] { new Fruit("사과", 1000), new Fruit("배", 2000) });

		List<People> personData = new ArrayList<>();
		personData.add(pp1);
		personData.add(pp2);
		personData.add(pp3);

		for (People p : personData) {
			System.out.println(p);
		}

	}

}

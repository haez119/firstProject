package com.yedam.generic;

public class ContainerExample {

	public static void main(String[] args) {
		
		Container<String, String> con1 = new Container<>();
		
		con1.set("홍길동", "도적");
		String name1 = con1.getKey();
		String job = con1.getValue();
		
		System.out.println("1 " + name1 + " " + job);
		
		Container<String, Integer> con2 = new Container<>();
		con2.set("홍길동", 35);
		String name2 = con2.getKey();
		int age = con2.getValue();
		
		System.out.println("2 " + name2 + " " + age);
	}
}

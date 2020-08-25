package com.yedam.lambda;

import java.util.function.BooleanSupplier;
import java.util.function.IntSupplier;
import java.util.function.Supplier;

public class SupplierExample {

	public static void main(String[] args) {

		// 매개값x 리턴값o
		Supplier<String> supplier = () -> {
			return "Hello, World";
		};
		String result = supplier.get();
		System.out.println(result);

		IntSupplier intSup = () -> {
			int sum = 0;
			for (int i = 1; i <= 10; i++) {
				sum += i;
			}
			return sum;
		};
		System.out.println(intSup.getAsInt());
		
		BooleanSupplier boolSup = () -> {
			class Member {
				String name;
				int age;
				Member(String name, int age) {
					this.name = name;
					this.age = age;
				}
			}
			Member m1 = new Member("Hong", 10);
			Member m2 = new Member("Park", 12);
			return m1.age == m2.age;
		};
		
		System.out.println(boolSup.getAsBoolean());

	}

}

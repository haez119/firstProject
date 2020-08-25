package com.yedam.lambda;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ConsumerExample {
	public static void main(String[] args) {
		
		// 매개값o 리턴값x
		
		Consumer<String> consumer = new Consumer<String>() {
			@Override
			public void accept(String t) {
				System.out.println(t + " 반갑습니다.");
			}
		};
		consumer.accept("이름1");
		
		Consumer<String> con = (t) -> { System.out.println(t + " 반갑습니다."); };
		consumer.accept("이름1");
		
		BiConsumer<String, String> biCon = (a, b) -> { System.out.println(a + "는 " + b ); };
		biCon.accept("사과", "맛있다.");
		
		BiConsumer<Integer, Integer> biInt = (a, b) -> { System.out.println(a + "*" + b + "=" + (a * b)); };
		biInt.accept(24,5);
		
		
		
		
		
		
		
	}
}

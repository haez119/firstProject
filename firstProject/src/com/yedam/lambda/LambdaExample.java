package com.yedam.lambda;

import com.yedam.classes.CakExample;

interface MyFunctionalInterface {
	public void run(); // 추상메소드 abstract method
	// 람다는 구현 해야할 메소드가 1개만 있는 인터페이스만 사용 가능 => 함수적 인터페이스 (functional interface)
}

class MyFuncClass implements MyFunctionalInterface {

	@Override
	public void run() {
		System.out.println("ruuuuun");
	}
	
}
public class LambdaExample {
	public static void main(String[] args) {
		
		MyFunctionalInterface my = new MyFuncClass();
		my.run();
		
		// 인터페이스를 구현할 클래스를 익명으로 생성
		MyFunctionalInterface my1 = new MyFunctionalInterface() {
			@Override
			public void run() {
				System.out.println("runn.");
			}
		};
		my1.run();
		
		// 익명 객체 람다식으로 
		MyFunctionalInterface my2 = () -> {
			System.out.println("runnnnnn");
		};
		my2.run();
		
		// 매개값 넣기
		ShowContent sc = (content) -> { System.out.println("내용은 " + content + " 입니다."); };		
		sc.show("바나나");
		
		ShowContent sc2 = (content) -> { System.out.println("this is " + content + "."); };		
		sc2.show("바나나");
		
		Calculate cal = new Calculate() {
			
			@Override
			public int sum(int a, int b) {
				return a + b;
			}
		};
		System.out.println(cal.sum(1, 2));
		
		// 리턴, 중괄호 생략 가능
		Calculate cal2 = (a, b) -> a+b;
		System.out.println(cal2.sum(10, 2));
		
		
		
		
		
		
		
		
		
		
	}
}

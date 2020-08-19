package com.yedam.interfaces;

 class Anonymous {
	void run() {
		System.out.println("실행.");
	}
}
 
interface AnonymInterface {
	void run();
}

public class AnonymousExample {
		public static void main(String[] args) {
			
			Anonymous anonym = new Anonymous() { // 자식 클래스를 익명
				String str; // 필드 

				@Override
				void run() {
					System.out.println("자식 실행");
				}
				
			}; // 자식 클래스를 생성하지 않고 내용만 바로 적어줌
			
			anonym.run(); // 실행이 아닌 자식실행이 출력됨
			
			AnonymInterface anonymIntf = new AnonymInterface() {
				
				@Override
				public void run() {
					System.out.println("자식 구현 객체 실행");
					
				}
			}; // 인터페이스는 new 뒤에 인터페이스를 구현한 구현객체가 있어야 함 >> 익명 구현 객체로 생성
			
			anonymIntf.run();
			
			
			
			
			
		}

}


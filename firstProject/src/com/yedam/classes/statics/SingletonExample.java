package com.yedam.classes.statics;


public class SingletonExample {
	public static void main(String[] args) {
		
		
		// Singleton s1 = new Singleton(); private 사용 했기 때문에 불가
		Singleton s1 = Singleton.getInstance(); // static 사용했기 때문에 클래스이름으로 메소드 호출은 가능
		Singleton s2 = Singleton.getInstance();
		
		// 주소값 비교 >> new 연산자 사용x 동일한 주소(객체)를 가짐
		if(s1 == s2) {
			System.out.println("동일한 instance 입니다.");
		} else {
			System.out.println("다른 instance 입니다.");
		}
		
		
		
		
	}
}

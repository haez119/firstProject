package com.yedam.generic;

import com.yedam.classes.Person;

public class BoxExample {

	public static void main(String[] args) {
		
		// T가 들어간 <> 사이에 지정할 타입을 적ㅇㅓ줌
		
		Box<String> box = new Box<String>();
		box.set(new String("Hello"));
		String result = box.get();
		
		// 앞에 타입 지정해줬으면 뒤에는 생략 가능
		Box<Person> box2 = new Box<>();
		box2.set(new Person());
		//result = (String) box2.get(); 불가
		Person p1 = box2.get();
		
		Box<String> box3 = Utils.boxing(new String("hhh")); // 매개값으로 Person 넣었으니까 리턴 타입도 Person 
		// result =  Utils.boxing(new String("hhh"); 에러 >> 리턴타입이 박스니까(메소드 내용 확인하기) 박스객체에 리턴
		// result = box3.get(); >> 이렇게 사용 ( get메소드 이용해서 )
		
		
//		Box box = new Box();
//		String str1 = new String("Hello");
//		
//		box.set(str1);
//		String result = (String) box.get(); 
//		// 부모 클래스인 Object에 자식객체인 String 를 담으니까 자식으로 강제형변환
//		// set으로 넣은 값이 String > 리턴 타입의 값도 String 
//		
//		Person p1 = new Person(); // 패키지 다르면 import 해주면 사용 가능 (접근제한자)
//		box.set(p1);
//		Person p2 = (Person) box.get();
//		
//		result = (String) box.get(); // 실행오류가 남 현재 box에는 Person 이 들어가있음
//		
//		
		
	}

}

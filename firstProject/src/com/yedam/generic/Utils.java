package com.yedam.generic;

public class Utils {
	
	// 뒤에 쓰는 <T> 제네릭 타입입니다 알려주는 용으로 앞에도 <T>
	public static <T> Box<T> boxing(T t) {
		Box<T> box = new Box<>();
		box.set(t); // 매개값을 box에 넣은 후 리턴
		
		return box; // 리턴타입은 box
	}
	
	// Product<T,M>2개인 이유는 Product 클래스에 2개여서?
	public static <T,M> boolean compare(Product<T,M> p1, Product<T,M> p2 ) {
		
		boolean b1 = p1.getType().equals(p2.getType()); // Product 클래스에 있는 메소드 type, model
		boolean b2 = p1.getModel().equals(p2.getModel());
		return b1 && b2;
	}

}

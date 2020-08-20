package com.yedam.generic;

public class Box<T> { // 클래스의 타입이 지정될 때 멤버들의 타입을 지정하겠다.
					  // (매개값으로 받은 타입으로 멤버들의 타입이 지정됨)
	
	private T obj; // Object 최상위 클래스 (모든 클래스를 자식으로 사용할 수 있음)
	
	public void set(T obj) {
		this.obj = obj; 
	}
	
	public T get() {
		return this.obj;
	}
}

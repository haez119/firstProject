package com.yedam.generic;

public class Product<T, M> {
	
	private T type; // 클래스의 타입이 지정되면 필드 타입도 같이 지정되게
	private M model;
	
	public T getType() {
		return type;
	}
	public void setType(T type) {
		this.type = type;
	}
	public M getModel() {
		return model;
	}
	public void setModel(M model) {
		this.model = model;
	}
	
	
}

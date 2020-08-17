package com.yedam.classes;

public class Cal {

	// 필드는 private 사용하기

	private int r; // 반지름
	private double pi = 3.14;

	public double getArea() {
		double result = pi * r * r;
		return result;
	}

	// 필드에 0을 넣지 못하게 메소드 사용하여 제한
	public void setRadius(int r) {
		if (r < 0) {
			r = 0;
		} else {
			this.r = r;
		}
	}

	public int getRadius() {
		return r;
	}

}

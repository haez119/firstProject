package com.yedam.inherit;

public class Vehicle {
	void run() {
		System.out.println("차량이 달립니다.");
	}

}

class Bus extends Vehicle {
	// 부모클래스의 run 이라는 메소드를 재정의 => 차량이~ >> 버스가~
	@Override
	void run() {
		System.out.println("버스가 달립니다.");
	}
}

class Taxi extends Vehicle {
	
	@Override
	void run() {
		System.out.println("택시가 달립니다.");
	}
}

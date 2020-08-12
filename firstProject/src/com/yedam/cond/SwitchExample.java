package com.yedam.cond;

public class SwitchExample {

	public static void main(String[] args) {
		// Math.random() 0 ~ 1 사이의 임의의 실수 * 6 하면 6 미만의 값만 나옴 int 타입변환하면 0~6 까지의 정수값, +1 하면 1~6 까지
		int m = (int) (Math.random() * 6) + 1; // 0 < m < 6
		
		System.out.println(m);
		
		switch(m) {
		case 1:
			System.out.println("1번이 나왔습니다.");
			break;
		case 2:
			System.out.println("2번이 나왔습니다.");
			break;
		case 3:
			System.out.println("3번이 나왔습니다.");
			break;
		case 4:
			System.out.println("4번이 나왔습니다.");
			break;
		case 5:
			System.out.println("5번이 나왔습니다.");
			break;
		case 6:
			System.out.println("6번이 나왔습니다.");
		}
		
		
		
	}

}

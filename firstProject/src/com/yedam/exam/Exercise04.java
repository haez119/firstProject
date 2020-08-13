package com.yedam.exam;

public class Exercise04 {

	public static void main(String[] args) {
	
		while (true) {
			int a = (int) (Math.random() * 6) +1; // 임의의 숫자 하나 뽑음 > 반복문 안에 넣으면 반복
			int b = (int) (Math.random() * 6) +1;
			
			System.out.println("(" + a + "," + b + ")");
			if(a+b == 5) {
				break;
			}
		}
		
		
		
	}

}

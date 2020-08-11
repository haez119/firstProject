package com.yedam.dev;

public class VariableTest {
	public static void main(String[] args) {
		int sum = 0;
	
		
		for(int i=1; i<=10 ; i++) { 
			// i 1 ~ 10까지 10번 반복
			
			sum += i; // = sum = sum + i;
			// System.out.println(sum + " , " + i);
			
		}
		
		System.out.println("합계 : " + sum);
		sum = 10;
		System.out.println(sum);
	}

}

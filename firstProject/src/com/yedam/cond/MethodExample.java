package com.yedam.cond;

public class MethodExample {

	public static void main(String[] args) {
		multiTable(3, 5); // 원하는 범위의 단만 출력하기
		multiTable(4); // 원하는 단만 출력
		multiTable(); // 구구단 전부 출력
		
		/*int num = 2;
		for (; num <= 9;num++) {
			multiTable(num); 
			System.out.println();
			}*/
		}
		
	

	public static void multiTable(int a, int b) {
		for (int i = a; i <= b; i ++) {
			System.out.println(i + "단");
			for(int j = 1 ; j <10 ; j++) {
				System.out.println(i + "*" + j + "=" + (i*j));
			}
		System.out.println();
		}
		
	}
	
	public static void multiTable(int a) {
		int num1 = a;
		System.out.println(num1 + "단");
		for (int i = 1 ; i < 10; i++) {
			System.out.println(num1 + "*" + i + "=" + (num1 * i));
		}
				
		
	}
	
	public static void multiTable() {
		for (int i = 2; i <= 9; i ++) {
			System.out.println(i + "단");
			for(int j = 1 ; j <10 ; j++) {
				System.out.println(i + "*" + j + "=" + (i*j));
			}
		System.out.println();
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}

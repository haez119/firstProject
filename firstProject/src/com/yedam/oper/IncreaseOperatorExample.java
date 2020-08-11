package com.yedam.oper;

public class IncreaseOperatorExample {

	public static void main(String[] args) {
		
		int var1 = 0;
		var1++; //1
		
		for (int i = 0; i < 3 ; i ++) {
			
				var1++; //2,3,4	
		}
		System.out.println(var1);
		
		
		boolean run = false;
		int var2 = 0;
		var2--; // 1 / -1
		
		for (int i = 0; i < 3 ; i ++) {
			run = !run;  // 논리부정 연산자: false -> true / true -> false 반복
			if (run) {
				var2--; // 1=> 실행ㅇ = 2 -2 , 2=> 실행ㄴ = 2 -2 유지됨 , 3=> 실행ㅇ = 3 -3 => 최종값 3 -3이 저장
			}
		}
		System.out.println(var2);
		
		
		
		

	}

}

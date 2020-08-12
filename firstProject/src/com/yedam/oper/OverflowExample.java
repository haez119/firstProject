package com.yedam.oper;

public class OverflowExample {

	public static void main(String[] args) {
		System.out.println(Integer.MAX_VALUE); //2147483647
		System.out.println(Integer.MIN_VALUE); //-2147483648
		
		int result = safeAdd(2147483647,10); // int의 최대값을 벗어남
		System.out.println(result);
		
		result = safeAdd(-2147483648,-10);
		System.out.println(result);
		
		result = safeAdd(10000,10);
		System.out.println(result); // 예외처리 되어버림
		

	}
	// (오버플로우) 최대값 보다 큰 값 , 최소값 보다 작은 값이 들어오면 0 과 "유효값이 아닙니다." 를 출력
	// max < a+b 하게 되면 a+b에서 이미 오버플로우 발생 (-2147483639) => (max -b) < a
	// min > a+b  (2147483638)
	
	public static int safeAdd(int a, int b) {
		int sum = 0;
		if ( b > 0 ) { // b가 0보다 크면 max만 비교
			if(Integer.MAX_VALUE - b < a) {
				System.out.println("유효값이 아닙니다.");
				sum = 0;
			} else {
				sum = a+b;
			}
		
		} else { // b가 0보다 작으면 min만 비교
			if (Integer.MIN_VALUE + b > a) {
				System.out.println("유효값이 아닙니다.");
				sum = 0;
			} else {
				
				sum = a+b;
			}
		}
			
		return sum;
	}
	

}

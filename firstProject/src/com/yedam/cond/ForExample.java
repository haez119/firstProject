package com.yedam.cond;

public class ForExample {

	public static void main(String[] args) {
		int sum = 0;
		sum = sum + 1;
		sum = sum + 1;
		sum = sum + 1;//  == sum += 1 == sum++
		sum += 1;
		
		System.out.println("결과는 " +sum);
		
		sum = 0;
		for(int a = 0; a < 3 ; a++) {
			sum = sum + 1;
		}
		
		sum += 1;
		System.out.println("최종 결과는 " +sum);
		
		
		sum = 0;
		for(int a = 3; a > 0 ; a--) {
			sum = sum + 1;
		}
		sum += 1;
		System.out.println("최종 결과는 " +sum);
		
		
		sum = 0;
		for (int i = 1; i <= 9; i++) {
			sum = sum + i;
		}
		System.out.println("1 ~ 10 합 : " + sum);
		
		for ( int i = 2 ; i <=9 ; i++) {
			System.out.println(i + "단");
			// System.out.println();
			
			for (int a = 1 ; a <=9 ; a++) {
				if ( a == 9) { // 엔터 넣기 1 *9 되면 곱하기 출력 후 엔터
					System.out.println(i + " x " + a + " = " + i*a );
					System.out.println();
				} else {
					System.out.println(i + " x " + a + " = " + i*a );
				}
				
			} 
			System.out.println(); // 엔터 넣기 2 / 첫번째 for문 끝나면 엔터
		}
		
		
		int num = 2;
		// num을 초기값으로 사용, (생략);조건식;(생략)
		for (;num <=9 ;) {
			// num++; 증감식을 for문 안에 넣기 / for문 앞에 넣으면 증감식 -> 실행문 >> 3단부터 10단까지 실행됨
			System.out.println(num +"단");
			for (int i = 1 ; i <= 9 ; i++) {
				System.out.println(num +" x "+ i +" = " + num * i);
			}
			num++; // for문 뒤에 넣으면 실행문 -> 증감식 >> 2단부터 9단까지 실행
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		

	}

}

package com.yedam.dev;

public class MorningCode2 {

	public static void main(String[] args) {
		
		
		
		int num = 0;
		for (int i =0; i<10;i++) {
			if(i%2 !=0)  
				continue;
			System.out.println("짝수만 출력됨");
		}
		
		int n = 0;
		while(true) {
			if (n == 5)
				break; // 반복문 바로 종료
			else if ( n == 3) 
				continue; // 밑에 있는 실행문 무시하고 다시 반복. 반복문 종료 x
		}
		
		int j = 0;
		while (j < 10) {
			int i = 0;
			while (i < 10) {
				i++;
			}
			j++;
		}

		int sum = 0;
		for (int k = 0; k < 5; k++) {
			for (int i = 0; i < 10; i++) {
				sum += i;
				System.out.println(i);
			}
		}

		int score = 90;

		if (score >= 90) {
			if (score >= 95) {
				System.out.println("95이상입니다.");
			} else {
				System.out.println("90 이상입니다.");
			}
		} else if (score >= 80) {
			System.out.println("80 이상입니다.");
		} else {
			System.out.println("80 미만입니다.");
		}

	}

}

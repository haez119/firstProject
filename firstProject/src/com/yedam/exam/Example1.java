package com.yedam.exam;

import java.util.Arrays;
import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {

		// 23,44,28 순서대로 입력하고 23,28,44 순서대로 출력되게 하기

		Scanner scanner = new Scanner(System.in);
		int[] arry = new int[3];

		for (int i = 0; i < 3; i++) {
			System.out.print("숫자를 입력하세요: ");
			arry[i] = scanner.nextInt();
		}

//		Arrays.sort(arry); // 배열 정렬하기 저장되는 인덱스 자체가 바뀐다
//		// System.out.println(arry[1]); // 2번째에 44입력 => 정렬 때문에 28이 출력됨
//		
//		for (int i =0; i<3; i++) {
//			System.out.println(arry[i]);
//		}
		int temp = 0;
		
		// [0]과 [1] 비교해서 작은 값을 [0]에 대입 큰 값을 [1]에 대입
		for (int i = 0; i < 2; i++) { 
			if (arry[i] <= arry[i + 1]) {
				arry[i] = arry[i];
			} else {
				temp =arry[i];
				arry[i] = arry[i + 1];
				 arry[i + 1] = temp;
			}
		}
		
		for (int i = 0; i < 2; i++) {
			if (arry[i] <= arry[i + 1]) {
				arry[i] = arry[i];
			} else {
				temp =arry[i];
				arry[i] = arry[i + 1];
				 arry[i + 1] = temp;
			}
		}

		for (int i = 0; i < 3; i++) {
			System.out.println(arry[i]);
		}

	}
}

package com.yedam.ref;

import java.util.Scanner;

public class AdvancedForExample {

	public static void main(String[] args) {
		
		int[] scores = { 95, 71, 84, 93, 87};
		
		int sum =0;
		for(int score : scores) {
			sum += score;
		}
		
		double avg = (double) sum / scores.length;
		System.out.println("점수 총합 = " + sum + ", 점수 평균 = " + avg);
		
		Scanner scanner = new Scanner(System.in);
		int[] arry = new int[5];
		
		sum = 0;
		avg = 0;
		int maxVal = 0;
		
		for (int i = 0; i < 5; i++) {
			System.out.print("숫자를 입력하세요: ");
			arry[i] = scanner.nextInt();
			sum += arry[i];
		}
		
		for(int i =0; i<arry.length ; i++) {
			if(maxVal <= arry[i]) {
				maxVal = arry[i];
			} else {
				maxVal = maxVal;
			}
		}
		
		avg = (double) sum / arry.length;
		System.out.println("점수 총합 = " + sum + ", 점수 평균 = " + avg + ", 최고점수: " + maxVal);
		

	}

}

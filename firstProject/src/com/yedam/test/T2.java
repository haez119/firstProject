package com.yedam.test;

import java.util.Scanner;

public class T2 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int sum = 0, count = 0, num = 0, max = 0, min = 0;
		double avg = 0;
		
		System.out.print("점수 입력> ");
		min = scanner.nextInt();

		
		for (int i = 0; i <= 1; i++) {
			for (int j = 0; j >= 0; j++) {
				System.out.print("점수 입력> ");
				num = scanner.nextInt();
				if (num == -1) {
					break;
				}
				sum += num;
				count++;

				if (max <= num) {
					max = num;
				}

				if (min >= num) {
					min = num;
				}
			}
		}

		System.out.println("최대값: " + max + ", 최소값: " + min + ", 평균: " + ((double) sum / count));

	}
}

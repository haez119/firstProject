package com.yedam.test;

import java.util.Scanner;

public class T2 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int sum = 1, count = 0, num = 0, max = 0, min = 0;
		double avg = 0;

		boolean run = true;

		while(run) {
			if (num == -1) {
				run = false;
			} else {
				System.out.print("점수 입력> ");
				num = scanner.nextInt();
				if ( count == 0) {min = num; }
				sum += num;
				count++;
				if (max <= num) {
					max = num;
				}
				if (num >= 0 && num <= min) {
					min = num;
				}
			}
		}

		System.out.println("최대값: " + max + ", 최소값: " + min + ", 평균: " + ((double)sum/(count-1)) );
		
	}
}

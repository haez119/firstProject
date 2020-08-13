package com.yedam.exam;

import java.util.Scanner;

public class Exercise07 {

	public static void main(String[] args) {
		boolean run = true;
		int balance = 0, input = 0;
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("----------------------------------");
			System.out.println("1.예금  2.출금  3.잔고  4.종료");
			System.out.println("----------------------------------");
			System.out.println("선택 > ");
			
			int menu = scanner.nextInt();
			if (menu == 1) {
				System.out.println("예금 금액 입력하세요>  ");
				input = scanner.nextInt(); 
				balance = balance + input;
			} else if (menu == 2) {
				System.out.println("출금 금액 입력하세요>  ");
				input = scanner.nextInt(); 
				balance = balance - input;
			} else if (menu == 3) {
				System.out.println("잔액: " + balance);
			} else if ( menu == 4) { 
				run = false;
			} else {
				System.out.println("잘못 입력했습니다.");
			}
		} // while
		System.out.println("프로그램 종료");
	} // main

} // class
















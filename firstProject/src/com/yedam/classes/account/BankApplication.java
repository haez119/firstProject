package com.yedam.classes.account;

import java.util.Scanner;

import com.yedam.classes.Friend;

public class BankApplication {
	private static Account[] accountAry = new Account[100];
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		
		AccountService as = new AccountService();
		boolean run = true;
		
		while(run) {
			System.out.println("-------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("-------------------------------------------");
			System.out.print("선택> ");
			
			int selectNo = scanner.nextInt(); scanner.nextLine();
			
			if(selectNo == 1) {
				as.createAccount(accountAry);
			}else if (selectNo == 2) {
				as.accountList(accountAry);
			}else if( selectNo == 3) {
				as.deposit(accountAry);
			}else if (selectNo == 4) {
				as.withdraw(accountAry);
			}else if (selectNo == 5) {
				run = false;
			}
		}
		
		System.out.println("프로그램 종료");
		
	} // main
	
	
}

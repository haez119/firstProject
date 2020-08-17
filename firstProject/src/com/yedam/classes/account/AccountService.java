package com.yedam.classes.account;

import java.util.Scanner;

public class AccountService {

	static Scanner scanner = new Scanner(System.in);

	// 메소드 마다 매개변수로 배열 주기
	static void createAccount(Account accountAry[]) {
		System.out.println("----------");
		System.out.println("계좌 생성");
		System.out.println("----------");

		System.out.print("계좌번호: ");
		String ano = scanner.nextLine();
		System.out.print("계좌주: ");
		String owner = scanner.nextLine();
		System.out.print("초기입금액: ");
		int balance = scanner.nextInt();
		scanner.nextLine();

		
		for (int i = 0; i < accountAry.length; i++) {
			if (accountAry[i] == null) {
				accountAry[i] = new Account(ano, owner, balance);
				break;
			}
		}

	} // create

	static void accountList(Account accountAry[]) {

		System.out.println("----------------------");
		System.out.println("계좌 목록");
		System.out.println("----------------------");

		for (Account a : accountAry) {
			if (a != null) { // 널이 아닐 경우만 출력
				System.out.println(a.getAno() + '\t' + a.getOwner() + '\t' + a.getBalance());
			}
		}

	} // accountList

	static void deposit(Account accountAry[]) {

		System.out.println("----------");
		System.out.println("예금");
		System.out.println("----------");

		System.out.print("계좌 번호: ");

		Account acc = findAccount(scanner.nextLine(), accountAry);
		if (acc != null) {
			System.out.print("예금액: ");
			int num = scanner.nextInt();
			scanner.nextLine();
			acc.setBalance(acc.getBalance() + num);

			System.out.println("예금이 성공되었습니다.");

		} else {
			System.out.println("계좌가 존재하지 않습니다.");
		}

	}// deposit

	static void withdraw(Account accountAry[]) {

		System.out.println("----------");
		System.out.println("출금");
		System.out.println("----------");

		System.out.print("계좌 번호: ");
		Account acc = findAccount(scanner.nextLine(), accountAry); // 위에서 배열로 선언 >> 밑에선 변수만 선언
		if (acc != null) {
			System.out.print("출금액: ");
			int num = scanner.nextInt();
			scanner.nextLine();
			if (acc.getBalance() - num >= 0) {
				acc.setBalance(acc.getBalance() - num);
				System.out.println("출금이 성공되었습니다.");
			} else {
				System.out.println("잔액이 부족합니다.");
			}
		} else {
			System.out.println("계좌가 존재하지 않습니다.");
		}

	}// withdraw

	static Account findAccount(String ano, Account accountAry[]) {

		for (int i = 0; i < accountAry.length; i++) {
			if (accountAry[i] != null && ano.equals(accountAry[i].getAno())) { // !=null 조건 주기
				Account acc = accountAry[i];
				return acc;
			}
		}
		return null; // false 일 땐 null 반환

	}// Account

}

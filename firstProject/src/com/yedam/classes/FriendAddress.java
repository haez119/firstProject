package com.yedam.classes;

import java.util.Scanner;

public class FriendAddress {

	static Scanner scanner = new Scanner(System.in); // 메인 밖에서 선언 >> static 붙여줘야해
	// friends에는 Friend 클래스의 자식객체도 다 담을 수 있음
	static Friend[] friends = new Friend[100]; // 메소드에서 쓰기 위해

	public static void main(String[] args) {

		while (true) {
			System.out.println("--------------------------------------------");
			System.out.println("1.학교친구 | 2.회사친구 | 3.친구 | 4.리스트 | 9.종료");
			System.out.println("--------------------------------------------");
			System.out.print("선택> ");
			int selectNo = scanner.nextInt();
			scanner.nextLine();

			if (selectNo == 1) {
				addUnivFriend();
			} else if (selectNo == 2) {
				addComFriend();
			} else if (selectNo == 3) {
				addFriend();
			} else if (selectNo == 4) {
				friendList();
			} else if (selectNo == 9) {
				break;
			}

		}

		System.out.println("프로그램 종료.");
	}// main

	public static void friendList() {
		for (Friend friend : friends) {
			if (friend != null) {
				System.out.println(friend.toString());
			}
		}
	}

	public static void addFriend() {

		System.out.println("친구등록");

		System.out.print("이름 입력> ");
		String name = scanner.nextLine();
		System.out.print("전화 입력> ");
		String phone = scanner.nextLine();

		Friend friend = new Friend();
		friend.setName(name);
		friend.setNumber(phone);

		for (int i = 0; i < friends.length; i++) {
			if (friends[i] == null) {
				friends[i] = friend;
				break;
			}
		}
		System.out.println("입력 완료");

	}

	// 회사친구 등록 메소드
	public static void addComFriend() {

		System.out.println("회사동료등록");

		System.out.print("이름 입력> ");
		String name = scanner.nextLine();
		System.out.print("전화 입력> ");
		String phone = scanner.nextLine();
		System.out.print("회사명 입력> ");
		String cName = scanner.nextLine();

		ComFriend friend = new ComFriend();
		friend.setName(name);
		friend.setNumber(phone);
		friend.setComName(cName);

		for (int i = 0; i < friends.length; i++) {
			if (friends[i] == null) {
				friends[i] = friend;
				break;
			}
		}
		System.out.println("입력 완료");

	}

	// 학교친구 등록 메소드
	public static void addUnivFriend() {

		System.out.println("학교친구등록");

		System.out.print("이름 입력> ");
		String name = scanner.nextLine();
		System.out.print("전화 입력> ");
		String phone = scanner.nextLine();
		System.out.print("전공 입력> ");
		String major = scanner.nextLine();

		UnivFriend friend = new UnivFriend();
		friend.setName(name);
		friend.setNumber(phone);
		friend.setMajor(major);

		for (int i = 0; i < friends.length; i++) {
			if (friends[i] == null) {
				friends[i] = friend;
				break;
			}
		}
		System.out.println("입력 완료");
	}

}// class

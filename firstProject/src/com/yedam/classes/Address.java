package com.yedam.classes;

import java.util.Scanner;

public class Address {

	public static void main(String[] args) {

		boolean run = true;
		Friend[] fAry = new Friend[100]; // 클래스 타입의 배열 선언
		Scanner scanner = new Scanner(System.in);

//		Friend[] friends = new Friend[100];
//		Scanner scanner = new Scanner(System.in);
//		boolean run = true;

		// for(Friend fri3 : fAry)

		while (run) {

			System.out.println("-------------------------------------------------------");
			System.out.println("1.정보입력 | 2.리스트 | 3.이름 조회 | 4.이름조회 후 수정 | 9.종료");
			System.out.println("-------------------------------------------------------");
			System.out.print("선택> ");
			int selectNo = scanner.nextInt();
			scanner.nextLine();
			// nextInt() 다음에는 nextLine 넣어주기

			if (selectNo == 1) {

				System.out.println("이름 입력: ");
				String name = scanner.nextLine();

				System.out.println("나이 입력: ");
				int age = scanner.nextInt();
				scanner.nextLine();

				System.out.println("전화번호 입력: ");
				String number = scanner.nextLine();
				// 한 건 만 입력하기
				for (int i = 0; i < fAry.length; i++) {
					if (fAry[i] == null) { // 배열에 값이 있으면 넣지 말기
						fAry[i] = new Friend(name, age, number);
						break;
					}
				}
			} else if (selectNo == 2) {
				for (Friend f : fAry) {
					if (f != null) { // 널이 아닐 경우만 출력
						System.out.println("이름: " + f.getName() + ", 나이: " + f.getAge() + ", 번호: " + f.getNumber());
					}
				}
			} else if (selectNo == 3) {
				System.out.println("조회할 이름: ");
				String sName = scanner.nextLine();
				for (Friend f : fAry) {
					if (f != null) {
						if (f.getName().equals(sName)) {
							System.out.println("이름: " + f.getName() + ", 나이: " + f.getAge() + ", 번호: " + f.getNumber());
						}
					}
				}

			} else if (selectNo == 4) {

				System.out.println("수정할 이름 입력: ");
				String sName = scanner.nextLine();
				System.out.println("새로운 이름 입력: ");
				String nName = scanner.nextLine();

				for (Friend f : fAry) {
					if (f != null) {
						if (f.getName().equals(sName)) {
							f.setName(nName);
						}
						if (f.getName().equals(nName)) {
							System.out.println(f.getName() + ", " + f.getAge() + ", " + f.getNumber());
						}
					}
				}
			} else if (selectNo == 9) {
				break;
			}

		}
		System.out.println("프로그램 종료");
		
		for(int i =0; i<fAry.length; i++) {
			if (fAry[i] != null) {
				System.out.println(fAry[i].getName());
				
			}
		}
		
		
		
		

	}// 메인

}// 클레스

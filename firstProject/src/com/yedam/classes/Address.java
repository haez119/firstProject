package com.yedam.classes;

import java.util.Scanner;

public class Address {

	public static void main(String[] args) {
		int age = 0;
		String name = null, number = null;
		boolean run = true;
		Friend[] fAry = new Friend[2];
		Scanner scanner = new Scanner(System.in);

		// for(Friend fri3 : fAry)

		while (run) {

			System.out.println("-----------------------------------------------");
			System.out.println("1.정보입력 | 2.리스트 | 3.이름 조회 | 4.이름조회 후 수정 | 9.종료");
			System.out.println("-----------------------------------------------");
			System.out.println("선택> ");
			int selectNo = scanner.nextInt();
			scanner.nextLine();

			if (selectNo == 1) {
				for (int i = 0; i < 2; i++) {
					System.out.println("이름을 입력하시오");
					name = scanner.nextLine();

					System.out.println("나이를 입력");
					age = scanner.nextInt();
					scanner.nextLine();

					System.out.println("전화번호 입력");
					number = scanner.nextLine();

					fAry[i] = new Friend(name, age, number);
				}
			} else if (selectNo == 2) {
				for (int i = 0; i < fAry.length; i++) {
					System.out.println(fAry[i].getName() + ", " + fAry[i].getAge() + ", " + fAry[i].getNumber());
				}
			} else if (selectNo == 3) {
				System.out.println("조회할 이름: ");
				String sName = scanner.nextLine();
				for (Friend f : fAry) {
					if (f.getName().equals(sName)) {
						System.out.println(f.name + ", " + f.age + ", " + f.number);
					}
				}

			} else if (selectNo == 4) {
				System.out.println("수정할 이름 입력: ");
				String sName = scanner.nextLine();
				System.out.println("수정 될 이름 입력: ");
				String nName = scanner.nextLine();

				for (Friend f : fAry) {
					if (f.getName().equals(sName)) {
						f.setName(nName);
					}
					if (f.getName().equals(nName)) {
						System.out.println(f.name + ", " + f.age + ", " + f.number);
					}
				}

			} else if (selectNo == 9) {
				break;
			}

		}

	}

}

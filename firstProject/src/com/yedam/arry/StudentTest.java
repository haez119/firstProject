package com.yedam.arry;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentTest {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		List<Student> list = new ArrayList<>();
		int count =0;
		
		
		
		while (true) {
			System.out.println("----------------------------------");
			System.out.println("1.입력 | 2.평균 | 3.최고점수 | 9.종료");
			System.out.println("----------------------------------");
			
			System.out.print("선택> ");
			int selectNo = scanner.nextInt(); scanner.nextLine();
			
			if(selectNo == 1) {
				System.out.print("이름 입력> ");
				String name = scanner.nextLine();
				System.out.print("수학점수 입력> ");
				int math = scanner.nextInt(); scanner.nextLine();
				System.out.print("영어점수 입력> ");
				int eng = scanner.nextInt(); scanner.nextLine();
				
				list.add(new Student(name, math, eng));
				
	
			}else if(selectNo == 2) {
				
				double engavg = 0, mathavg =0;;
				for(Student stu : list) {
					engavg += stu.getEngScore();
				}
				for(Student stu : list) {
					mathavg +=stu.getMathScore();
				}
				System.out.println("수학 평균 : " + mathavg/(double) list.size());
				System.out.println("영어 평균 : " + engavg/(double) list.size());
				
			}else if(selectNo == 3) {
				
				String name = null;
				int max = 0;
				for(Student stu : list) {
					if(max <= stu.getMathScore()) {
					max = stu.getMathScore();
					name = stu.getName();
					}
				}
				
				System.out.println("학생이름: " + name + " 수학 최고 점수: " + max);

			}else if(selectNo == 9) {
				break;
			}else {
				for(Student stu : list) {
					System.out.printf("이름 %s : 수학%d, 영어%d \n", stu.getName(), stu.getMathScore(), stu.getEngScore());
				}
			}
		}
		System.out.println("프로그램 종료");
	}

}

package com.yedam.exam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CourseMain2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		List<Course> cList = new ArrayList<>();

		while (true) {
			System.out.println("--------------------------------------------------");
			System.out.println("1.과정등록 | 2.학생등록 | 3.학생리스트 | 4.전체리스트 | 5.종료");
			System.out.println("--------------------------------------------------");
			System.out.print("선택> ");
			
			int selectNo = scanner.nextInt(); scanner.nextLine();
			
			if(selectNo == 1) {
				System.out.print("과정명> "); 
				String course = scanner.nextLine();
				System.out.print("수강인원> "); 
				int sNum = scanner.nextInt(); scanner.nextLine();
				cList.add(new Course(course, sNum));
				
			}else if(selectNo == 2) {
				System.out.print("과정명> "); 
				String course = scanner.nextLine();
				System.out.print("이름> "); 
				String name = scanner.nextLine();
				System.out.print("나이> "); 
				int age = scanner.nextInt(); scanner.nextLine();
				System.out.print("점수> "); 
				int score = scanner.nextInt(); scanner.nextLine();
				
				for(Course cc : cList) {
					if(cc.getCourse().equals(course)) {
						cc.course(new Student(name,age,score),course);
					} 
				}
			}else if(selectNo == 3) {
				System.out.print("과정명> "); 
				String course = scanner.nextLine();
				
				for(Course cc : cList) {
					if(cc.getCourse().equals(course)) {
						cc.studentList();
					}
				}
			}else if(selectNo == 4) {
				System.out.print("과정명> "); 
				String course = scanner.nextLine();
				
				for(Course cc : cList) {
					if(cc.getCourse().equals(course)) {
						showCourseInfo(cc);
					}
				}
			}else if(selectNo == 5) {
				break;
			}
			
		}
		System.out.println("프로그램 종료");
		
		
	}
	
	public static void showCourseInfo(Course c) {
		Course list = c;
		System.out.println("[과정 정보 출력]");
		int sum =0, max=0;
		System.out.println("과정명: " + list.getCourse());
		for(Student ss : list.list) {
			System.out.println( ss );
			sum += ss.getScore();
			if(ss.getScore() >= max) {
				max = ss.getScore();
			}
		}
		System.out.println("평균점수: " + (double) (sum / list.list.size()) + ", 최고점수: " + max);
	}

}

package com.yedam.database;

import java.util.Scanner;

public class EmpMain {

	public static void main(String[] args) {
		
		boolean run = true;
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("--------------------------------------");
			System.out.println("1.리스트 | 2.입력 | 3.수정 | 4.삭제 | 9.종료 ");
			System.out.println("--------------------------------------");
			System.out.print("선택> ");
			
			int selectNo = scanner.nextInt(); scanner.nextLine();
			
			if(selectNo == 1) {
				EmpDAO dao = new EmpDAO();
				Employee[] emps = dao.getEmpList();
				for(Employee emp : emps ) {
					if ( emp != null) {
						System.out.println(emp.toString());						
					}
				}
			} else if ( selectNo == 2) {
				EmpDAO dao = new EmpDAO(); // (Employee 클래스 생성자 확인)
				
				System.out.print("사원번호 입력 > ");
				int empid = scanner.nextInt(); scanner.nextLine();
				System.out.print("이름 입력 > ");
				String name = scanner.nextLine();
				System.out.print("이메일 입력 > ");
				String email = scanner.nextLine();
				System.out.print("입사일 입력 예)2020-05-05 > ");
				String date = scanner.nextLine();
				System.out.print("부서번호 입력 > ");
				String jobid = scanner.nextLine();
				
				dao.addEmployee(new Employee(empid,name,email,date,jobid));
				
			} else if ( selectNo == 3) {
				
				EmpDAO dao = new EmpDAO();
				
				System.out.print("수정할 사원의 사원번호 입력 > ");
				int empid = scanner.nextInt(); scanner.nextLine();
				System.out.print("변경 될 월급 입력 > ");
				int salary = scanner.nextInt(); scanner.nextLine();
				
				dao.updateEmployee(salary, empid);
			
			} else if ( selectNo == 4) {
				
				EmpDAO dao = new EmpDAO();
				
				System.out.print("삭제할 행의 사원번호를 입력> ");
				int empid = scanner.nextInt(); scanner.nextLine();
				dao.removeEmployee(new Employee(empid));
				
			} else if ( selectNo == 9) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");

	}// main

}// class

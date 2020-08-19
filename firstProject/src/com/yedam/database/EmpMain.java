package com.yedam.database;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EmpMain {

	public static void main(String[] args) {
		
		boolean run = true, nun = true;
		Scanner scanner = new Scanner(System.in);
		EmpService service = new EmpServiceImpl(); // 인터페이스 = new 구현객체
		
		while(run) {
			System.out.println("--------------------------------------");
			System.out.println("1.리스트 | 2.입력 | 3.수정 | 4.삭제 | 9.종료 ");
			System.out.println("--------------------------------------");
			System.out.print("선택> ");
			
			int selectNo =0;
				try {
					selectNo  = scanner.nextInt();
				} catch(InputMismatchException e) {
					System.out.println("정수를 입력하세요");
					scanner.nextLine();
					continue;
				}
			

			if(selectNo == 1) {
				// EmpDAO dao = new EmpDAO();
				Employee[] emps = service.showList(); // 인터페이스 구현객체로 메소드 호출
				for(Employee emp : emps ) {
					if ( emp != null) {
						System.out.println(emp.toString());						
					}
				}
			} else if ( selectNo == 2) {
				// EmpDAO dao = new EmpDAO(); // (Employee 클래스 생성자 확인)
				
				System.out.print("사원번호 입력 > ");
				int empid = scanner.nextInt(); scanner.nextLine();
				System.out.print("이름 입력 > ");
				String name = scanner.nextLine();
				System.out.print("이메일 입력 > ");
				String email = scanner.nextLine();
				System.out.print("입사일 입력 예)2020-05-05 > ");
				String date = scanner.nextLine();
				System.out.print("부서 입력 > ");
				String jobid = scanner.nextLine();
				
				service.addEmp(new Employee(empid,name,email,date,jobid));
				
			} else if ( selectNo == 3) {
				
				// EmpDAO dao = new EmpDAO();
				
				System.out.print("수정할 사원의 사원번호 입력 > ");
				int empid = scanner.nextInt(); scanner.nextLine();
				System.out.print("변경 될 월급 입력 > ");
				int salary = scanner.nextInt(); scanner.nextLine();
				
				Employee emp = new Employee();
				emp.setSalary(salary);
				emp.setEmployeeId(empid);
				
				service.modEmp(emp);
			
			} else if ( selectNo == 4) {
				
				// EmpDAO dao = new EmpDAO();
				
				System.out.print("삭제할 행의 사원번호를 입력> ");
				int empid = scanner.nextInt(); scanner.nextLine();
				
				service.delEmp(empid);
				
			} else if ( selectNo == 9) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");

	}// main

}// class

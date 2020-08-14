package com.yedam.classes;

public class StudentExample {
	public static void main(String[] args) {

		// 생성자로 데이터 넣기
		Student stu1 = new Student(1111);
		stu1.setName("이름1");
		stu1.setStuName("말타기");

		System.out.println(stu1.getStuNum() + ", " + stu1.getName() + ", " + stu1.getStuName());

		Student stu2 = new Student(2222, "이름2");
		stu2.setStuName("역사");
		System.out.println(stu2.getStuNum() + ", " + stu2.getName() + ", " + stu2.getStuName());

		Student stu3 = new Student(3333, "이름3", "말타기");
		System.out.println(stu3.getStuNum() + ", " + stu3.getName() + ", " + stu3.getStuName());

		
		Student stu4 = new Student(4444, "이름4", "말타기");
		
		int val1 = 555;
		String val2 = "이름5";
		String val3 = "역사";
		Student s5 = new Student(val1, val2, val3);
		
		
		
		// 넣은 데이터 배열에 넣기
		Student[] stuAry = { stu1, stu2, stu3, stu4, s5 };

		// for 반복문으로 배열 출력
		System.out.println();
		for (int i = 0; i < stuAry.length; i++) {
			System.out.println(stuAry[i].getStuNum() + ", " + stuAry[i].getName() + ", " + stuAry[i].getStuName());
		}

		// 확장된 for
		System.out.println("-------------------------");
		for (Student s : stuAry) {
			System.out.println(s.toString()); // toString() 메소드 사용
		}
		
		
		// 특정 데이터만 출력하기 - 학번 1111
		System.out.println();
		for (Student s : stuAry) {
			if (s.getStuNum() == 1111) {
				System.out.println(s.toString());
			}
		}

		// 특정 데이터만 출력하기 - 이름2
		System.out.println();
		for (Student s : stuAry) {
			if (s.getName().equals("이름2")) {
				System.out.println(s.toString());
			}
		}
		// 특정 데이터만 출력하기 - 말타기
		String searchMajor = "말타기";
		
		System.out.println();
		for (Student s : stuAry) {
			if (s.getStuName().equals(searchMajor)) {
				System.out.println(s.toString());
			}
		}

	}

}

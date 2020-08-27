package com.yedam.exam;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;


public class Course  {
	
	List<Student> list = new ArrayList<>(); // 학생정보
	TreeMap<String, Integer> scores = new TreeMap<>();

	private String course;
	private int sNum;
	
	public Course() {}

	// 과정등록 (생성자로)
	public String getCourse() {
		return course;
	}

	// 과정등록 (생성자로)
	public Course(String course, int sNum) {
		this.course = course;
		scores.put(course, sNum);

	}

	// 수강할 인원의 정보를 등록하는 메소드 이름, 나이, 성적
	public void course(Student s, String str) {
		
		int no =scores.get(str);
		
		if(list.size() < no) {
			list.add(s);
		} else {
			System.out.println("정원초과! " + no + "명만 등록됩니다.");
		}
	}
	
	 // 학생 리스트 출력 메소드
	public void studentList() {
		System.out.println("[학생 리스트 출력]");
		if(list.size() <1) {
			System.out.println("==학생이 없습니다.==");
		} else {
			for(Student ss : list) {
				System.out.println(ss);
			}
		}
		
	}

	@Override
	public String toString() {
		return "과정명: " + course + ", 인원: " + sNum;
	}
	
	

}

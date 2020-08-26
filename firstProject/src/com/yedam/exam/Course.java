package com.yedam.exam;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class Course  {
	
	List<Student> list = new ArrayList<>(); // 학생정보
	List<String> cou = new ArrayList<>(); // 과정
	TreeMap<String, Integer> size = new TreeMap<>();
	Map.Entry<String, Integer> en = size.firstEntry();
	private String course;
	private int sNum;
	
	public Course() {}

	// 과정등록 (생성자로)
	public String getCourse() {
		return course;
	}

	// 과정등록 (생성자로)
	public Course(String course, int sNum) {
		int i=0;
		this.course = course;
		cou.add(course);
		size.put(course, sNum);
		
		
	}

	// 수강할 인원의 정보를 등록하는 메소드 이름, 나이, 성적
	public void course(Student s, String str) {
		if(en.getKey().equals(str)){
			if(list.size() < en.getValue()) {
				list.add(s);
			} else {
				System.out.println("정원초과! " + sNum + "명만 등록됩니다.");
			}
		}
	}
	
	 // 학생 리스트 출력 메소드
	public void studentList() {
		System.out.println("[리스트 출력]");
		System.out.println("수강인원: " + sNum +" 명");
		for(Student ss : list) {
			System.out.println(ss);
		}
	}

	@Override
	public String toString() {
		return "과정명: " + course + ", 인원: " + sNum;
	}
	
	

}

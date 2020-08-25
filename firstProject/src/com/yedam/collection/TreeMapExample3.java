package com.yedam.collection;

import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;

public class TreeMapExample3 {

	public static void main(String[] args) {
		
		TreeMap<Student, String> tMap = new TreeMap<>();
		
		tMap.put(new Student("Hong", 69, 79), "체육특기생");
		tMap.put(new Student("Park", 78, 88), "일반학생");
		tMap.put(new Student("Choi", 85, 79), "체육특기생");
		tMap.put(new Student("Kim", 90, 86), "일반학생");
		
		System.out.println("------headMap------");
		// 수학은 80이상 영어는 88이상 기준을 수학만 해줬기 때문에 영어점수는 상관ㄴ
		// "Base" 는 의미없는 문자열, 
		SortedMap<Student, String> sMap = tMap.headMap(new Student("Base", 80, 88)); 
		
		//sMap.entrySet();  키, 값 모두
		Set<Student> set = sMap.keySet(); // 키 값만 (Student 자체가 키, 값은 "체육특기생~")
		
		for(Student s : set) {
			System.out.println(s.getName() + ", " + s.getMathScore());
		}
		System.out.println("--------subMap--------");
		
		// 앞에 new Student() 는 시작값, 뒤에 new Student() 는 종료값
		sMap = tMap.subMap(new Student("Base1", 70, 0), new Student("Base2", 80, 0) ); 
		set = sMap.keySet();
		
		for(Student s : set) {
			System.out.println(s.getName() + ", " + s.getMathScore());
		}
		
		System.out.println("--------tailMap--------");

		sMap = tMap.tailMap(new Student("Base", 80, 0)); // 80 이상
		set = sMap.keySet();
		
		for(Student s : set) {
			System.out.println(s.getName() + ", " + s.getMathScore());
		}	
	
		
		
		
	}

}

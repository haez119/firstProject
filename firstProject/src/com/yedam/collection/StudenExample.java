package com.yedam.collection;

import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public class StudenExample {

	public static void main(String[] args) {
		
		TreeMap<Studen, String> tMap = new TreeMap<>();
		
		tMap.put(new Studen("Hong", 69, 79), "체육특기생");
		tMap.put(new Studen("Park", 78, 88), "일반학생");
		tMap.put(new Studen("Choi", 85, 79), "체육특기생");
		tMap.put(new Studen("Kim", 90, 86), "일반학생");
		
		System.out.println("------headMap------");
		
		// 160 이하
		SortedMap<Studen, String> sMap = tMap.headMap(new Studen("+", 80, 80)); 
		Set<Studen> set = sMap.keySet(); 
		for(Studen s : set) {
			System.out.println("이름: "+ s.getName() + ", 수학: " + s.getMathScore() + ", 영어: " + s.getEngScore() + ", 총점: " + (s.getEngScore()+s.getMathScore()));
		}
		
		System.out.println("------subMap------");
		
		// 100이상 170 이하
		sMap = tMap.subMap(new Studen("+", 50, 50), new Studen("+", 100, 70) ); 
		set = sMap.keySet(); 
		for(Studen s : set) {
			System.out.println("이름: "+ s.getName() + ", 수학: " + s.getMathScore() + ", 영어: " + s.getEngScore() + ", 총점: " + (s.getEngScore()+s.getMathScore()));
		}
		
		System.out.println("--------tailMap--------");
		
		// 150 이상
		sMap = tMap.tailMap(new Studen("+", 100, 50)); 
		set = sMap.keySet(); 
		for(Studen s : set) {
			System.out.println("이름: "+ s.getName() + ", 수학: " + s.getMathScore() + ", 영어: " + s.getEngScore() + ", 총점: " + (s.getEngScore()+s.getMathScore()));
		}
		
		

	}

}

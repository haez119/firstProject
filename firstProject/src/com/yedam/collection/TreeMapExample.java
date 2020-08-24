package com.yedam.collection;

import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class TreeMapExample {
	public static void main(String[] args) {
		
		TreeMap<Integer, String> scores = new TreeMap<>();
		scores.put(new Integer(87), "이름1");
		scores.put(new Integer(98), "이름2");
		scores.put(new Integer(75), "이름3");
		scores.put(new Integer(95), "이름4");
		scores.put(new Integer(80), "이름5");
		
		Map.Entry<Integer, String> entry = scores.firstEntry(); // 작은값
		entry = scores.lastEntry(); // 큰값
		System.out.println("점수: " + entry.getKey() + ", 이름: " + entry.getValue());
		
		Integer icnt = scores.firstKey();
		scores.get(icnt); // icnt 키 값에 맞는 value 가져옴
		System.out.println("점수: " + icnt + ", 이름: " + scores.get(icnt));
		
		System.out.println("---------------------------------------");
		Map.Entry<Integer, String> pEntry = scores.pollFirstEntry(); // 값 가져온 후 삭제함
		System.out.println("점수: " + pEntry.getKey() + ", 이름: " + pEntry.getValue());
		pEntry = scores.pollFirstEntry(); 
		System.out.println("점수: " + pEntry.getKey() + ", 이름: " + pEntry.getValue());
		// 다른 값 출력됨
		
		
		
	}

}

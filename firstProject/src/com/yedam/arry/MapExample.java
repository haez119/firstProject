package com.yedam.arry;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExample {

	public static void main(String[] args) {
		
		Map<String, Integer> map = new HashMap<>();
		
		map.put("blue", 96);
		map.put("hong", 86);
		map.put("while",92);
		
		String name = null;
		int max =0, total =0, sum=0;
		
		Set <String> set = map.keySet();
		for(String i : set) {
			sum += map.get(i);
			if(max <= map.get(i)) {
				max = map.get(i);
				name = i;
			}
		}
		
		System.out.println("평균점수: " + sum / set.size());
		System.out.println("최고점수: " + max + ", 최고점수 아이디: " + name );

	}

}

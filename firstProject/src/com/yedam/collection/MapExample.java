package com.yedam.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapExample {

	public static void getAge(Map<String, Integer> m) {

		Set<Map.Entry<String, Integer>> ent = m.entrySet();

		for (Map.Entry<String, Integer> mm : ent) {
			System.out.println("이름은 " + mm.getKey() + " 나이는 " + mm.getValue() + " 입니다.");
		}
		System.out.println();
		Set <String> set = m.keySet();
		for(String i : set) {
			System.out.println("이름은 " + i + " 나이는 " + m.get(i));
		}
	}

	public static void getInfo(Map<String, String> m) {
		System.out.println("이름: " + m.get("이름")); // get(key) >> 키가 "이름" 인 애의 값을 불러옴
		System.out.println("전공: " + m.get("전공"));
	}

	public static void main(String[] args) {

		Map<String, Integer> m2 = new HashMap<>();
		m2.put("1이름1", 20);
		m2.put("2이름2", 23);
		m2.put("3이름3", 26);
		getAge(m2);
		
		System.out.println();
		
		

		// <Key,Value>
		Map<String, String> ms = new HashMap<>();

		ms.put("이름", "민해주"); // (key,value)
		ms.put("전공", "자바");
		getInfo(ms);

		// "이름", "전공" 이 키가 됨
		// 키가 "이름" 인 애 한테 값으로 민해주를 줌

//		
//		
//		map.put(11, new Member("이름11", 20)); // (Key, Value1, Value2 ... );
//		map.put(12, new Member("이름12", 21));
//		map.put(13, new Member("이름13", 22));
//		
//		System.out.println(map.get(11).getName() + ", " + map.get(11).getAge());
//		System.out.println();
//		
//		Set<Integer> set = map.keySet();
//		
//		for(Integer i : set) {
//			Member m = map.get(i);
//			System.out.println(m.getName() +", " + m.getAge());
//		} //
//		
//		System.out.println();
//		
		Map<Integer, Member> map = new HashMap<>();
		Set<Map.Entry<Integer, Member>> entSet = map.entrySet();
		for (Map.Entry<Integer, Member> m : entSet) {
			System.out.println(m.getKey() + ", " + m.getValue().getName());
			System.out.println(m.getKey() + ", " + m.getValue().getName() + ", " + m.getValue().getAge());

		}
//		System.out.println();

	}

}

package com.yedam.test;

import java.util.Arrays;
import java.util.Iterator;
import java.util.TreeSet;

public class Example07 {
	public static void main(String[] args) {
		
		String[] names = {"Hong", "Park", "Choi"};
		
		TreeSet<String> ts = new TreeSet<>();
		System.out.println("---- 정렬 전 -----");
		
		for(String s : names) {
			System.out.println(s);
		}
		
		System.out.println("---- 정렬 후 -----");
		Arrays.sort(names); // 정렬하는 메소드
		for(String s : names) {
			System.out.println(s);
		}
		
//		for(String s : names) {
//			ts.add(s);			
//		}
//		Iterator<String> is = ts.iterator();
//		while(is.hasNext()) {
//			System.out.println(is.next());
//		}
		
		User[] users = {new User("user1", 1), new User("user2", 2), new User("user3", 3)};
		Arrays.sort(users);
		
		for(User s : users) {
			System.out.println(s.grade +", " + s.name);
		}
	}
}

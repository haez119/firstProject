package com.yedam.generic;

import java.util.HashMap;
import java.util.HashSet;

import com.yedam.classes.Person;

public class GenericExample {

	public static void main(String[] args) {
		
		HashSet<String> set = new HashSet<>();
		set.add("이름1");
		set.add("이름2");
		
		HashSet<Person> set2 = new HashSet<>();
		set2.add(new Person());
		set2.add(new Person());
		
		HashMap<String, Integer> map = new HashMap<>();
		map.put("이름3", 50);
		map.put("이름4", 15);
		

	}

}

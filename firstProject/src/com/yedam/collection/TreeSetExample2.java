package com.yedam.collection;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetExample2 {

	public static void main(String[] args) {
		
		TreeSet<Person> set = new TreeSet<>();
		set.add(new Person("Hong1", 10)); // 크다 작다 기준? 
		set.add(new Person("Hong2", 14));
		set.add(new Person("Hong3", 12));
		set.add(new Person("Hong4", 11));
		
		Iterator<Person> iter = set.iterator();
	
		SortedSet<Person> sSet = set.headSet(new Person("Sorted", 12)); // 13을 기준으로 작은값을 sSet에 담음 (기준값 제외)
		sSet = set.tailSet(new Person("So", 12)); // .tailSet >> 큰 값 가져오기 (기준값 포함?)
		sSet = set.subSet(new Person("Temp", 10), new Person("Temp2", 12)); // 범위 지정 (시작은 기준 포함, 끝은 기준 제외) 
		for(Person person : sSet) {
			System.out.println(person.name + ", " + person.age);
		}
		System.out.println("매개값 하나 더 주기 -------------");
		
		NavigableSet<Person> nSet = set.headSet(new Person("Sorted", 12), true); // true >> 포함 / false >> 제외
		nSet = set.tailSet(new Person("Sorted", 12), false); // true >> 포함 / false >> 제외
		nSet = set.subSet(new Person("SSS", 10),true, new Person("TTT", 12), true); // 시작, 끝 포함
		for(Person person : nSet) {
			System.out.println(person.name + ", " + person.age);
		}
		
		
		
//		while(iter.hasNext()) {
//			System.out.println(iter.next().name);
//			// next().name + next().age >> next 때문에 2번 읽어와서 짝이 맞지 않게 출력됨
//		}		
		

	}

}

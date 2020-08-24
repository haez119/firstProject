package com.yedam.collection;

import java.util.Iterator;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {

		TreeSet<Integer> tSet = new TreeSet<>();

		tSet.add(new Integer(87)); // 크다 작다 비교해서 순서대로 저장?
		tSet.add(new Integer(98));
		tSet.add(new Integer(75));
		tSet.add(new Integer(95));
		tSet.add(new Integer(80));

		Integer t = tSet.first(); // 첫번째 값 출력 (제일 작은 값)
		t = tSet.last(); // 마지막값 (제일 큰 값)
		t = tSet.floor(new Integer(87)); // <= 87를 기준으로 (기준값 포함) 87보다 작은값을 출력
		t = tSet.lower(new Integer(87)); // < floor과 동일 , lower은 기준값을 제외 >> 87을 제외한 작은값
		t = tSet.ceiling(new Integer(85)); // >= 기준값 보다 큰 값 출력
		t = tSet.higher(new Integer(85)); // >
		
		Iterator<Integer> dIter = tSet.descendingIterator(); // 내림차순으로 바꿈
		while (dIter.hasNext()) {
			System.out.println(dIter.next());
		}
		
		System.out.println("------------------------------");
		
		// NavigableSet 내림차순으로 정렬 (리턴타입이 다름)
		NavigableSet<Integer> nSet = tSet.descendingSet();
		for(Integer icnt : nSet) {
			System.out.println(icnt);
		}
		

		// .pollFirst() >> 값을 가져온 후 삭제 > null
		int size = tSet.size();
		for (int i = 0; i < size; i++) {
			t = tSet.pollFirst(); // 작은값부터 가져오고 지우고?
			System.out.println(t + ", " + tSet.size()); // size 점점 작아짐
		}
		System.out.println(tSet.pollFirst()); // null 출력
		
		for (int i = 0; i < size; i++) {
			t = tSet.pollLast();
			System.out.println(t + ", " + tSet.size()); 
		} 
		
		
		
		
		
		

//		Iterator<Integer> iter = tSet.iterator(); // 반복자? 반복해서 가져옴 반복자 안에 tSet 값 반복해서 넣음?
//		while ( iter.hasNext()) { // hasNext >> 가져올 값이 있는지 확인
//			Integer icnt = iter.next(); // next >> 값이 있으면 가져오기
//			System.out.println(icnt); // 크기가 작은 순서대로 출력됨
//		}
		

	}

}

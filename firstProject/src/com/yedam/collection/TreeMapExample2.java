package com.yedam.collection;

import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeMap;

class Fruit {
	String name;
	int price;
	
	public Fruit(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
}

// 크다 작다 기준
class FruitComp implements Comparator<Fruit> {

	@Override
	public int compare(Fruit o1, Fruit o2) {
		// TODO Auto-generated method stub
		return o1.price - o2.price; // 오름차순(음수)
	}
	
}


public class TreeMapExample2 {
	public static void main(String[] args) {
		
		// TreeMap의 크다 작다 비교는 key 값으로 결정 / key에 클래스가 있으면 클래스의 필드? 메소드? 재정의 해주기
		// fruit에 재정의 없어서 재정의 하는 클래스를 만들어서 map생성자의 매개값으로 주면 기준이 됨 ????
		TreeMap<Fruit, Integer> map = new TreeMap<>(new FruitComp());
		map.put(new Fruit("Orange", 1000), 1);
		map.put(new Fruit("Grape", 3000), 2);
		map.put(new Fruit("Banana", 2000), 3);
		
		Set<Fruit> set = map.keySet(); // 정렬여부 확인x
		
		NavigableSet<Fruit> dSet = map.descendingKeySet(); // 내림차순으로 가져옴
		dSet = map.navigableKeySet(); // 오름차순
		
		Iterator<Fruit> iter = dSet.iterator();
		
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		

	}

}

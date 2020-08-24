package com.yedam.test;

import java.util.HashSet;
import java.util.Set;

public class Example02 {

	public static void main(String[] args) {

		int[] intAry = new int[3];
		int num = 0;

		Set<Integer> set = new HashSet<>();

		while (true) {
			int temp = (int) (Math.random() * 6) + 1;
			set.add(temp);
			if (set.size() == 3) {
				break;
			}
		}
//		for (Integer it : set) {
//			System.out.println(it);
//	}
//
//			for (int i = 0; i < intAry.length; i++) {
//				num = (int) (Math.random() * 6) + 1;
//				for (int j = 0; j < intAry.length; j++) {
//					if (intAry[j] != num) {
//						intAry[j] = num;
//					} else {
//						continue;
//					}
//					intAry[i] = num;
//				}
//				System.out.println(intAry[i]);
//
//			}
//
//		}
		
		Set<Person> pSet = new HashSet<>();
		pSet.add(new Person("Hong1", 20)); // new 연산자 >> 다 다른 값으로 인식
		pSet.add(new Person("Hong1", 21)); // hashCode, equals 재정의 해주면 중복값 저장x
		pSet.add(new Person("Hong3", 20));
		
		for(Person p : pSet) {
			System.out.println(p.name + ", " + p.age);
		}

	}
}

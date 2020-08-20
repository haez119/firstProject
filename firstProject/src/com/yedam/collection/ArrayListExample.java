package com.yedam.collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
	
	public static void main(String[] args) {
		
		// List 부모 / ArrayList 자식
		List<String> list = new ArrayList<>();
		list.add("이름1");
		list.add("이름2");
		list.add(1,"이름3"); 
		// add 메소드는 인덱스 지정하여 값 삽입 > 기존에 있던 값 밀려남
		// 인덱스 지정 안하면 맨 마지막에 차례대로 삽입
		
		for(int i=0; i<list.size(); i++ ) {
			System.out.println(list.get(i));
		}
		
		for(String str : list) {
			System.out.println(str);
		}
		
	}
}

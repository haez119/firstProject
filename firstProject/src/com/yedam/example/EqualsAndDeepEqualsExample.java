package com.yedam.example;

import java.util.Arrays;
import java.util.Objects;

public class EqualsAndDeepEqualsExample {
	public static void main(String[] args) {
		
		Integer o1 = 1000;
		Integer o2 = 1000;
		
		// equals
		System.out.println(Objects.equals(o1, o2));
		
		// null 있으면 false;
		System.out.println(Objects.equals(o1, null)); 
		System.out.println(Objects.equals(null, o2));
		
		// 둘 다 null이면 true;
		System.out.println(Objects.equals(null, null));
		
		// DeepEquals
		System.out.println(Objects.deepEquals(o1, o2) + "\n");
		
		Integer[] ary1 = {1, 2};
		Integer[] ary2 = {1, 2};
		
		//equals 다른 배열 >> false
		System.out.println("e : " + Objects.equals(ary1, ary2));
		
		//deepEquals 다른 배열 >> 값만 같으면 true 
		System.out.println("d : " + Objects.deepEquals(ary1, ary2));
		
		System.out.println(Arrays.deepEquals(ary1, ary2));
		
		// null 있으면 false;
		System.out.println(Objects.deepEquals(o1, null)); 
		System.out.println(Objects.deepEquals(null, o2));
		
		// 둘 다 null이면 true;
		System.out.println(Objects.deepEquals(null, null));
		
	}

}

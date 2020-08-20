package com.yedam.arry;

import java.util.HashSet;
import java.util.Set;

import com.yedam.classes.exam.Member;

public class HashSetExample {

	public static void main(String[] args) {
		
		Set <Stud> set = new HashSet<>(); 
		
		set.add(new Stud(1, "홍길동"));
		set.add(new Stud(2, "신용권")); 
		set.add(new Stud(1 , "조민우")); 
		set.add(new Stud(4 , "조민우")); 
		set.add(new Stud(4 , "조민우"));
		
		for (Stud stud: set) {
			System.out.println(stud.studentNum + " : " + stud.name);
		}
	}

	}



package com.yedam.example;

import java.util.Comparator;
import java.util.Objects;

public class CompareExample {
	public static void main(String[] args) {
		
		Student s1 = new Student(1);
		Student s2 = new Student(1);
		Student s3 = new Student(2);
		
		// comparator => 비교자
		//Objects.compare(T a, T b, Comparator<T>c) 메소드는 두 객체를 비교자로 비교해서 int 값을 리턴
		// 두 객체를 비교하는 compare(T a, T b) 메소드가 정의되어 있음
		// 리턴타입은 int / a가 b보다 작으면 음수, 크면 양수 리턴
		
		// s1의 1과 s2의 1 동일 > 0을 리턴 // 뒤에 new는 타입? comparator메소드를 재정의 한 클래스가 있음
		int result = Objects.compare(s1, s2, new StudentComparator());
		System.out.println(result);
		
		// s1의 1과 s3의 2 s3이 큼 >> 음수 리턴
		result = Objects.compare(s1, s3, new StudentComparator());
		System.out.println(result);
		
		
		
		
		
	}
	
	static class Student{
		int sno;
		Student(int sno) {
			this.sno = sno;
		}
	}
	
	static class StudentComparator implements Comparator<Student> {

		@Override
		public int compare(Student o1, Student o2) {
			
			if(o1.sno < o2.sno) return -1;
			else if ( o1.sno == o2.sno) return 0;
			else return 1;
			// 3줄의 코드를 compare() 메소드로 1줄로 줄일 수 있음
			
			//return Integer.compare(o1.sno, o2.sno);
		}
		
	}
	

}

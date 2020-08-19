package com.yedam.classes;

import java.util.Calendar;

public class CalendarExample {
	public static void main(String[] args) {
		
//		Calendar cal = Calendar.getInstance(); // Calendar은 static / new 사용 안하고 getInstance() 메소드 사용
//		System.out.println(cal.get(Calendar.YEAR));
//		System.out.println(cal.get(Calendar.MONTH)); // 0부터 시작. 0~11 7 출력 >> 8월을 의미
//		System.out.println(cal.get(Calendar.DATE)); // =DAY_OF_MONTH
//		
//		cal.set(2020, 7, 1); // 연월일 내가 지정해주기
//		System.out.println(cal.get(Calendar.YEAR));
//		System.out.println(cal.get(Calendar.MONTH)); 
//		System.out.println(cal.get(Calendar.DATE)); 
//		System.out.println(cal.get(Calendar.DAY_OF_WEEK)); // 해당되는 날의 요일값 출력 
//		
//		cal.set(2020, 7,1);
//		System.out.println(cal.get(Calendar.DAY_OF_WEEK));
		
		
		
		createCalendar();
		System.out.println();
		createCalendar(2019, 1);
		
	} // main
	
	public static void createCalendar() {
		System.out.println("일"+'\t'  + "월"+'\t' + "화" +'\t' + "수" +'\t'  + "목" +'\t'+ "금"  +'\t'+ "토");
		for(int i=1 ; i <=30 ; i++) {
			System.out.print(i);
			System.out.print('\t');
			if(i % 7 ==0) {
				System.out.println();
			}
		}
		System.out.println();
	}
	
	public static void createCalendar(int year, int month) {
		
		Calendar cal = Calendar.getInstance();
		cal.set(year,month,1);
		cal.set(year,month+1,0);
		
		System.out.println(year + "년 " + (month+1) +"월");
		System.out.println("일"+'\t'  + "월"+'\t' + "화" +'\t' + "수" +'\t'  + "목" +'\t'+ "금"  +'\t'+ "토");
		
		for(int i=1 ; i <= 7 ; i++) { // i가 요일과 같을 때 날짜를 출력
			
			if( i == cal.get(Calendar.DAY_OF_WEEK)) {
				for(int j=1; j<=cal.get(Calendar.DATE) ; j++) {
					System.out.print(j);
					System.out.print('\t');
					if((j+(cal.get(Calendar.DAY_OF_WEEK)-1)) %7 ==0) { // i+(요일-1) % 7 == 0 일 때 엔터
						System.out.println();
					}
				}
			}else {
				System.out.print('\t');
			}
		}
		System.out.println();
	}
	
	
	
	
	
	
}// class

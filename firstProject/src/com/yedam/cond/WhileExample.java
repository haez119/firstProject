package com.yedam.cond;

public class WhileExample {

	public static void main(String[] args) {
		int i = 0;
		
		/*while (i < 10) {
			System.out.println(i);
			i++;
		} 
		
		int sum = 0;
		i = 0;
		
		while ( i < 10) {
			i++;
			sum += i;
			System.out.println(i);
		}
		
		System.out.println("1 ~ " + i + " 까지 합: " + sum); */
		
		int x = 2, y = 1;
		
		while (x <= 9) {
			System.out.println(x + "단");
			y = 1; // 초기화 안하면 y는 10. 안에 있는 while 실행 안됨
			while (y <= 9) {
				System.out.println(x + " x " + y + " = " + x*y);
				y++;
			}
		x++;
		System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}

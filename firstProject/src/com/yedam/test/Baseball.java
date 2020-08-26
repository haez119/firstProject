package com.yedam.test;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Baseball {

	public static void main(String[] args) {
		
		int[] com = new int[3];
		
		Scanner scanner = new Scanner(System.in);
	
		
		for (int i = 0; i < com.length; i++) {
	         com[i] = (int) (Math.random() * 9) + 1;
	         for (int j = 0; j < i; j++) {
	            if (com[i] == com[j]) { // 중복숫자 방지
	               i--;
	               break;
	            }
	         }
	         System.out.print(com[i] + " ");
	      }

		
		while(true) {
			int fs = 0, md =0, ls =0;
			
			System.out.println("게임시작");
			System.out.print("1번 숫자> ");
			fs = scanner.nextInt(); scanner.nextLine();
			System.out.print("2번 숫자> ");
			md = scanner.nextInt(); scanner.nextLine();
			System.out.print("3번 숫자> ");
			ls = scanner.nextInt(); scanner.nextLine();
			
			int s=0, b=0;
			
			if(fs == com[0] ) {
				s++;
			} else {
				for(int a : com) {
					if(a == fs) {
						b++;
					}
				}
			}
	
			
			if(md == com[1] ) {
				s++;
			} else {
				for(int a : com) {
					if(a == md) {
						b++;
					}
				}
			}
			
			if(ls == com[2] ) {
				s++;
			} else {
				for(int a : com) {
					if(a == ls) {
						b++;
					}
				}
			}
			if(fs == com[0] && md == com[1] && ls == com[2] ) {
				System.out.println("스트라이크");
				break;
			}
			
			System.out.println(s + " 스트라이크, " + b + " 볼");	
			
			}
		System.out.println("게임종료");
	}

}

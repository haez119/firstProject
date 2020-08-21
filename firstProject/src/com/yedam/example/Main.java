package com.yedam.example;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("-----------------------------------------------");
			System.out.println("1.게시글 작성 | 2.게시글 수정 | 3.게시글 삭제 | 4.전체글 보기 | 9.종료");
			System.out.println("-----------------------------------------------");
			System.out.println("선택> ");
			
			int selectNo = scanner.nextInt();
			
			if(selectNo == 1) {
				
			} else if(selectNo == 2) {
				
			} else if(selectNo == 3) {
				
			} else if(selectNo == 4) {
				
			} else if(selectNo == 9) {
				run = false;
			}
				
			
		}
		

	}

}

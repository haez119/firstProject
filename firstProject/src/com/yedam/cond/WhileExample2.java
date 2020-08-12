package com.yedam.cond;

import java.io.IOException;

public class WhileExample2 {

	public static void main(String[] args) throws IOException {

		boolean run = true;
		int num = 10;
		int keyCode = 0;

		System.out.println("키를 누르세요.");
		while (run) {

			keyCode = System.in.read(); // 키보드로 입력 받은 값을 keyCode에 저장8
			
			if (keyCode == 57) {
				break;
			}
			
			if (keyCode != 13 && keyCode != 10) {
				System.out.println(keyCode);
				System.out.println("키를 누르세요.");

			} 
			

		}
		System.out.println("프로그램 종료");

	}

}

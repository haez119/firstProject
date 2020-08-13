package com.yedam.dev;

import java.io.IOException;

public class WhileExample {

	public static void main(String[] args) throws IOException {
		boolean run = true;
		int num = 10;
		int keyCode = 0;
		
		while (run) {
			System.out.println("키를 누르세요.");
			keyCode = System.in.read();
			if (keyCode != 13 && keyCode != 10) {
				System.out.println(keyCode);
			}
			System.in.read();
			System.in.read();
			
			if (keyCode == 57) // 57이 9
				run = false;
		}

	}

}

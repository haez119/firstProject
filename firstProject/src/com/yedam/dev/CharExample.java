package com.yedam.dev;

// com.yedam.dev.CharExample 패키지 + 클래스
// java -> src / class -> bin
public class CharExample {
	public static void main(String[] args) {
		char c1 = 44032; 
		
		/* for (int i =0; i <26; i++) {
			System.out.print(c1++ + "\t");
		} */
		
		char c2 = 'A';
		System.out.println(c2); // A 출력
		System.out.println((byte) c2); // 65가 출력 
		
		char c3 = '가';
		System.out.println((byte) c3); // byte, short는 범위 밖 -> 44032 말고 다른 값 출력
		System.out.println((int) c3);
		
	}
}
// Ct + Sh + F

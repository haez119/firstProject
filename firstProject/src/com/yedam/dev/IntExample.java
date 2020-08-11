package com.yedam.dev;

public class IntExample {
	public static void main(String[] args) {
		int var1 = 10; // 10진수
		int var2 = 012; // 8진수 앞 0 이 8진수를 의미 12 => 10
		int var3 = 0xA; // 16진수 앞 0x이 16진수 의미 => 10
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);
		
		byte b1 = 10;
		int result = (byte) (b1 + 10); 
		// byte 결과가 int에 / int > byte 작은걸 큰거 한테 넣을 땐 에러x 큰거를 작은거에 넣을 때 에러 
	}

}

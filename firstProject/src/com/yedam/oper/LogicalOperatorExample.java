package com.yedam.oper;

public class LogicalOperatorExample {

	public static void main(String[] args) {
		int charCode = 'A'; //65
		if (charCode >= 65 & charCode <= 90) {
			System.out.println("대문자입니다.");
		}
		
		int num1 = 10;
		int num2 = 20;
		if (num1++ < 10 && num2++ > 20 ) {
			System.out.println("참입니다.");
		}
		
		System.out.println(num1 +", " + num2);
		// && 2개 => 11,20 출력 => 앞 문장이 거짓이면 뒤에 문장 실행 안함 => num2는 증감적용x =>사용
		// & 1개 => 11,21 출력 => 앞 문장이 거짓이어도 뒤에 문장 실행 함 => num2도 증감적용o
		
		int a = 10, b = 11;
		int result = a & b; // 논리 곱 비트열로 곱하기 / 두 숫자의 비트열을 각각 비교하여 둘다 1이면 1 둘 중 하나가 0 이면 0 
		System.out.println("논리곱 결과: " + result); 
		
		result = a | b;
		System.out.println("논리합 결과: " + result); 
		
		result = a ^ b;
		System.out.println("배타적 논리합 결과: " + result); 
		
		result = (~a);
		System.out.println("a의 배타적 논리합 결과: " + result); 
		
		result = a << 2; // a의 비트열을 2만큼 왼쪽으로 이동, 빈자리는 0
		System.out.println("<< 비트이동결과: " + result); 
		
		result = a >> 2; // 8의 비트열을 2만큼 오른쪽으로 이동, 빈자리는 a의 부호(음수면1 양수면0)
		System.out.println(">> 비트이동결과: " + result); 
		
		result = a >>> 2; // 8의 비트열을 2만큼 오른쪽으로 이동, 빈자리는 0
		System.out.println(">>> 비트이동결과: " + result); 
		
		result = 30 << 3;
		System.out.println(result);
		
		result += 30;
		System.out.println(result); // result = result + 30 
		
		result = 80;
		boolean pass = false;
		if ( result >= 80) {
			pass = true;
		} else  {
			pass = false;
		}
		System.out.println(pass);
		
		//삼항연산자 if문 한줄로 줄여줌 => 조건식 ? 참일 때 : 거짓일 때
		pass = (result >=80) ? true : false;
		System.out.println(pass);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

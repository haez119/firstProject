package com.yedam.classes.exam;

public class MemberServiceExample {
	public static void main(String[] args) {
		
	
		
		// 로그인 정보
		Member mem1 = new Member("홍길동","hong"); 
		mem1.setPassword("hong123");
		
		// login 메소드에서 반복 진행 ( 매개값으로 배열의 값을 줌 > 해당 배열 내에서 반복)
		// 다른 클래스에서 같은 배열을 공유할 방법이 없음 >> 배열을 매개값으로 줘서 비교
		// 아니면 위에 배열 내용을 MemberService.login 메소드 에서 선언 해줘도 된다. > 매개값으로 배열x
		
		// 만약 공유가 된다면 Example 클래스에서 for 반복 하기
			MemberService mService = new MemberService(); 
			boolean result = mService.login(mem1.getId(), mem1.getPassword());
			
			if(result) {
				System.out.println(mem1.getName()+ "님 로그인 되었습니다.");
			} else {
				System.out.println("id 또는 password를 확인하세요");
			
			
		}
		
		
		
		// 첫번째 클래스에는 id, name, pw 생성자, set메소드 사용하여 값 넣어줌
		// 두번째 클래스에는 첫번째 클래스의 값을 매개값으로 login, logout 메소드 호출
		
//		Member mem1 = new Member("홍길동","hong"); // 멤버 생성자는 이름과 id 
//		mem1.setPassword("12345");
		
		// 위에 생성자, 메소드로 넣은 값을 memberService 메소드에 대입
//		MemberService mService = new MemberService(); // 멤버서비스는 생성자x
//		boolean result = mService.login(mem1.getId(), mem1.getPassword());
//		
//		if(result) {
//			System.out.println(mem1.getName()+ "님 로그인 되었습니다.");
//			// mService.logout(mem1.getName());
//		} else {
//			System.out.println("id 또는 password를 확인하세요");
//		}
	
	
	
	}
}

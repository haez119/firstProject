package com.yedam.classes.exam;

public class MemberService {

	// Member[] ms >> db 역할? 해당 배열안에 값과 매개값을 비교
	
	public boolean login(String id, String password) {
		Member[] members = new Member[3];
		
		members[0] = new Member("홍길동", "hong");
		members[0].setPassword("hong123");
		
		members[1] = new Member("김유신", "kim");
		members[1].setPassword("kim123");
		
		members[2] = new Member("최재영", "choi");
		members[2].setPassword("choi123"); //데이터베이스 역할
		
		boolean result = false;
		
		for (int i = 0; i < members.length; i++) {
			if (id.equals(members[i].getId()) && password.equals(members[i].getPassword())) {
				result = true;
				break; // true가 되면 빠져 나와야 함 아니면 배열 끝까지 반복 > false 리턴
			} else {
				result = false;
			}
		}
		return result;
	}

	public void logout(String id) {
		System.out.println(id + "님 로그아웃 되었습니다.");
	}

}

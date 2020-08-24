package com.yedam.api;

public class Member {
	
	public String id;
	
	public Member(String id) {
		this.id = id;
	}

	// 재정의 추가
	@Override
	public int hashCode() {
		return id.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) { // obj가 Memver 타입인지 확인 (맞으면t 아니면f)
			Member memver = (Member) obj;
			if(id.equals(memver.id)) {
				return true;
			}
		}
		return false;
	}
	
	
	
	

}

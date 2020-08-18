package com.yedam.classes;

public class ComFriend extends Friend {

	private String comName;
	
	//	public ComFriend() {
	//	super();
	//} 생성자가 없으면 컴파일에서 자동 생성

	public String getComName() {
		return comName;
	}

	public void setComName(String comName) {
		this.comName = comName;
	}

	@Override
	public String toString() {
		return "회사친구 이름: " + super.getName() + ", 연락처: " + super.getNumber() + ", 회사명: " + this.comName;
	} 
	
	
	

	
	
}

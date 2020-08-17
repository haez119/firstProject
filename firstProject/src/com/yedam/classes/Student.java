package com.yedam.classes;

public class Student {
	
	// 필드
	// 접근 디폴트> 같은 패키지, 퍼블릭> , 프라이빗
	private int stuNum;
	private String name;
	private String stuName;
	// private Person person; 클래스도 올 수 있음
	
	// 생성자(클래스 이름이랑 같, 반환 타입이 없음)
	// 동일한 생성자 명 여러번 사용 >> 생성자 오버로딩
	// 생성자 오버로딩 사용하려면 매개값의 타입이 다르거나 매개값의 개수가 달라야 함
	public Student() {}
	
	public Student(int stuNum) {
		this.stuNum = stuNum;
	}
	
	public Student(int stuNum, String name) {
		this.stuNum = stuNum;
		this.name = name;
	}
	public Student(int stuNum, String name, String stuName) {
		this.stuNum = stuNum;
		this.name = name;
		this.stuName = stuName;
	}
	
	// 메소드
	public int getStuNum() {
		return stuNum;
	}
	
	public String getName() {
		return name;
	}
	
	public String getStuName() {
		return stuName;
	}



	public void setStuNum(int stuNum) {
		this.stuNum = stuNum;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setStuName(String stuName) {
		this.stuName = stuName;
	}

	@Override
	public String toString() {
		return "[학번은 " + stuNum + ", 이름은 " + name + ", 전공은 " + stuName + "]";
	}

	
	

}

package com.yedam.classes;

public class Student {
	
	// 필드
	// 접근 디폴트> 같은 패키지, 퍼블릭> , 프라이빗
	private int stuNum;
	private String name;
	private String stuName;
	
	// 생성자
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

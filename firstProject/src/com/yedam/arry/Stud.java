package com.yedam.arry;

public class Stud {
	
	public int studentNum;
	public String name;
	
	public Stud(int studentNum, String name) {
		this.studentNum = studentNum;
		this.name = name;
	}

	@Override
	public int hashCode() {
		return this.studentNum;
	
	}

	@Override
	public boolean equals(Object obj) {
		
		Stud stu = (Stud) obj;
		return this.name.equals(stu.name);
		
	}
}

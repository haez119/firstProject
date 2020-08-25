package com.yedam.collection;

public class Student implements Comparable <Student>{
	private String name;
	private int mathScore;
	private int engScore;
	
	
	public Student(String name, int mathScore, int engScore) {
		super();
		this.name = name;
		this.mathScore = mathScore;
		this.engScore = engScore;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getMathScore() {
		return mathScore;
	}


	public void setMathScore(int mathScore) {
		this.mathScore = mathScore;
	}


	public int getEngScore() {
		return engScore;
	}


	public void setEngScore(int engScore) {
		this.engScore = engScore;
	}


	@Override
	public int compareTo(Student o) {
		
		return this.mathScore - o.mathScore;
	}


	
	
	
	

}

package com.yedam.collection;

public class Studen implements Comparable<Studen> {
	
	private String name;
	private int mathScore;
	private int engScore;
	
	public Studen(String name, int mathScore, int engScore) {
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
	public int compareTo(Studen o) {
		
		// return this.mathScore - o.mathScore; 오름차순
		// return  (this.mathScore + this.engScore) - (o.mathScore + o.engScore) ; 영어+수학을 오름차순
		if ( (this.mathScore + this.engScore) < (o.mathScore + o.engScore) ) {
			return -1;
		} else {
			return 1;
		}
		
	}
	
	
	
	

}

package com.yedam.interfaces;

//인터페이스 상속 키워드 : implements
public class OracleDb implements DataAccessObject {

	@Override
	public void select() {
		System.out.println("오라클 DB 조회.");
	}

	@Override
	public void insert() {
		System.out.println("오라클 DB 입력.");
		
	}

	@Override
	public void update() {
		System.out.println("오라클 DB 수정.");
		
	}
	
	
	

}

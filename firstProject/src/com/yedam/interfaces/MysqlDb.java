package com.yedam.interfaces;

public class MysqlDb implements DataAccessObject {

	@Override
	public void select() {
		System.out.println("Mysql DB 조회.");
		
	}

	@Override
	public void insert() {
		System.out.println("Mysql DB 입력.");
		
	}

	@Override
	public void update() {
		System.out.println("Mysql DB 수정.");
		
	}
	
	

}

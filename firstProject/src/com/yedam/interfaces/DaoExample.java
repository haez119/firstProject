package com.yedam.interfaces;

public class DaoExample  {

	public static void main(String[] args) {
		
		// 인터페이스 : 구현 객체 구현 클래스 / implements
		// 추상클래스 : 부모객체,자식객체   부모클래스,자식클래스  / extends
		// oracle > mysql 변경시 타입 객체 전부 변환 해 주어야 함
		OracleDb dao = new OracleDb();
		// MysqlDb dao = new MysqlDb(); 
		
		
		// 인터페이스 직접 객체 생성x 상속하는 클래스 객체로 생성
		// DataAccessObject dao = new OracleDb();  클래스 사용시 객체만 변경해주면 됨 
		// DataAccessObject dao = new MysqlDb();
		
		dao.select();
		dao.insert();
		dao.update();
	
		
		
		
	}

}

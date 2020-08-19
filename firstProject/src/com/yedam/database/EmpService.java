package com.yedam.database;

public interface EmpService {
	
	public Employee[] showList(); // 리스트 반환 > 반환값 배열
	public void  addEmp(Employee emp); // 입력 > 매개값으로 클래스 받기
	public void  modEmp(Employee emp); // 수정
	public void  delEmp(int empId); // 삭제 > id만 있으면 삭제 되니까 id만 받기
	
	
	

}

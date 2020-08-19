package com.yedam.database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmpDAO {
	
	public void updateEmployee(Employee emp) {
		
		
		Connection conn = DBConnection.getConnection(); 
		String sql = "UPDATE emp_temp  SET salary = " + emp.getSalary() + " WHERE employee_id =" + emp.getEmployeeId();
		System.out.println(sql);
		
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			int r = pstmt.executeUpdate(); 
			System.out.println(r + "건 업데이트 되었습니다..");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void removeEmployee(int empid) {
		
		Connection conn = DBConnection.getConnection(); 
		String sql = "DELETE FROM emp_temp WHERE employee_id = " + empid;
		System.out.println(sql);
		
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			int r = pstmt.executeUpdate(); // 있어야 되는거
			System.out.println(r + "건 삭제 되었습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	public void addEmployee(Employee emp) { // Employee 클래스를 매개값으로 (칼럼이 필드로 정의되어 있음)
		
		Connection conn = DBConnection.getConnection(); //DB연결
		// 문자열은 '' 이스케이프 사용해서..
		String sql = "insert into emp_temp(employee_id, last_name, email, hire_date, job_id)" // nn만
		+ " values(" + emp.getEmployeeId() 
					 + ",\'" + emp.getLastName() 
					 + "\',\'" + emp.getEmail() 
					 + "\',\'" + emp.getHireDate() 
					 + "\',\'" + emp.getJobId() 
		+ "\')"; 
		System.out.println(sql);
		
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			int r = pstmt.executeUpdate(); //업데이트 된 건수 반환?
			System.out.println(r + "건 입력 되었습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
	} // add
	
	public Employee[] getEmpList() { // 반환 타입이 배열
		
		Connection conn = DBConnection.getConnection();
		Employee[] employees = new Employee[100]; // 배열 선언 트라이 밖에 선언
		
		try {
			String sql = "select * from emp_temp";
			PreparedStatement pstmt = conn.prepareStatement(sql); // 여기서 예외 발생 시
			ResultSet rs = pstmt.executeQuery();
			int idx = 0; // 인덱스
			while(rs.next()) {
				Employee emp = new Employee();
				
				emp.setEmployeeId(rs.getInt("employee_id"));
				emp.setFirstName(rs.getString("first_name"));
				emp.setLastName(rs.getString("last_name"));
				emp.setEmail(rs.getString("email"));
				emp.setPhoneNumber(rs.getString("phone_number"));
				emp.setHireDate(rs.getString("hire_date"));
				emp.setJobId(rs.getString("job_id"));
				emp.setSalary(rs.getInt("salary"));
				
				employees[idx++] = emp; // 데이터 가져와서 배열에 채우기  (for 없이 )
				
			} //while
			System.out.println("-- end of data --");
		} catch (SQLException e) {
			e.printStackTrace(); // 이걸 실행해라
		} // catch
		
		return employees; // 데이터 넣은 배열을 반환
	} // empList
	
} // empDAO
	

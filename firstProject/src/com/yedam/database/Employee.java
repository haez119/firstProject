package com.yedam.database;

public class Employee {
	
	// 필요한 필드, 메소드 정의
	
	// 칼럼 => 필드로
	private int employeeId; // nn
	private String firstName; // nn
	private String lastName;
	private String email; // nn
	private String phoneNumber;
	private String hireDate; // nn
	private String jobId; //nn
	private int salary;
	
	public Employee() {} // 기본생성자
	
	// not null 항목만 생성자 매개값으로
	public Employee(int employeeId, String lastName, String email, String hireDate, String jobId) {
		super(); 
		this.employeeId = employeeId;
		this.lastName = lastName;
		this.email = email;
		this.hireDate = hireDate;
		this.jobId = jobId;
	}
	
	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getHireDate() {
		return hireDate;
	}

	public void setHireDate(String hireDate) {
		this.hireDate = hireDate;
	}

	public String getJobId() {
		return jobId;
	}

	public void setJobId(String jobId) {
		this.jobId = jobId;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", firstName=" + firstName + ", lastName=" + lastName + ", email="
				+ email + ", phoneNumber=" + phoneNumber + ", hireDate=" + hireDate + ", jobId=" + jobId + ", salary="
				+ salary + "]";
	}
	
	
	
	

}

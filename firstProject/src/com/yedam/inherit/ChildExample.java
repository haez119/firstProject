package com.yedam.inherit;

public class ChildExample {

	public static void main(String[] args) {
		Child child = new Child("홍길동", 15, 10);
		child.getName();  // 부모 Parent getName()
		child.getAge(); // 부모 Parent getAge()
		child.getGrade();  // 자신 getGrade();
		
		Parent parent = new Child("김유신", 20, 20); // 자식 생성자로 부모 객체 생성
				
		// 부모 객체 변수에 자식 객체 대입 >> 자식 객체에만 있는 메소드 사용 불가
		parent.getName();
		parent.getAge();
		// parent.getGrade(); //사용 불가
		
		
		Vehicle v1 = new Taxi(); // 부모클래스에 자식클래스 대입
		v1.run();
		v1 = new Bus(); 
		v1.run();
		
		Driver driver = new Driver();
		
		// 원래 매개값 타입은 taxi와 bus 클래스의 부모 클래스인 vehicle 클래스 타입
		// driver 클래스 생성자 매개값으로 자식객체 대입
		driver.drive(new Taxi());
		driver.drive(new Bus());
		
		Parent parent1 = new Parent();
		System.out.println(parent1.toString());
		

	}

}

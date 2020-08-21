package com.yedam.generic;

public class WildCardExample {
	
	// 제네릭 와일드 카드 : 앞에 <T> 와 같은 안붙여줘도 됨
	public static void registerCourse(Course<?> course) {
		// 모든 클래스
		System.out.println(course.getCourseName());
	}
	
	public static void registerCourseStudent(Course<? extends Student> course) {
		// student 이거나 student를 상속받는 하위 클래스만
	}
	public static void registerCoursWorker(Course<? super Worker> course) {
		// Worker 이거나 상위 클래스만 
	}

	public static void main(String[] args) {
		
		// Course<?>
		Course<Person> crsPerson = new Course<>("일반인 과정", 5);
		crsPerson.add(new Person("일반인1"));
		crsPerson.add(new Worker("직장인"));
		
		// Course<? extends Student>
		Course<Worker> crsWorker = new Course<>("직장인 과정", 5);
		
		// Course<? super Worker>
		Course<Student> crsStudent = new Course<>("학생 과정", 5);
		Course<HighStudent> crsHighStudent = new Course<>("고등학생 과정", 5);
		
		
		
		// 일반
		registerCourse(crsPerson);
		registerCourse(crsWorker);
		registerCourse(crsStudent);
		registerCourse(crsHighStudent);
		
		//직장인 상위
		registerCoursWorker(crsPerson);
		registerCoursWorker(crsWorker);
		//registerCoursWorker(crsStudent);
		//registerCoursWorker(crsHighStudent);
		
		//학생 하위
		//registerCourseStudent(crsPerson);
		//registerCourseStudent(crsWorker);
		registerCourseStudent(crsStudent);
		registerCourseStudent(crsHighStudent);
		
		
		
		
		
		
		
		
	}

}

package com.yedam.classes;

public class PersonExample {
	public static void main(String[] args) {
		
		Person p1 = new Person();
		p1.setName("민해주");
		p1.setAge(25);
		
		System.out.println(p1.getName());
		System.out.println(p1.getAge());
		
		Person cjy = new Person();
		cjy.setName("최재영");
		cjy.setAge(25);
		System.out.println(cjy);
		
		Person ksm = new Person();
		ksm.setName("김상민");
		ksm.setAge(25);
		System.out.println(ksm); // 실제 주소값이 입력 com.yedam.classes.Person@6d06d69c
		
		Person ksm2 = new Person();
		ksm2.setName("김상민");
		ksm2.setAge(25);
		System.out.println(ksm == ksm2); // 내용 같지만 false 주소비교
		System.out.println(ksm.getName().equals(ksm2.getName())); // equals() 메소드 사용하는 것이 좋음
		System.out.println(ksm.name == ksm2.name); // 호출되는 문자열 비교 >> true
		
		// 배열에 new 객체 대입도 가능?
		Person[] pAry = { cjy, ksm, ksm2};
		
		System.out.println(cjy.introduce());
		System.out.println(ksm.introduce());
		System.out.println();
		
		for(int i=0; i<pAry.length; i++) {
			System.out.println(pAry[i].introduce());
		}
		
		Person anoy = new Person(); 
		System.out.println(anoy.introduce()); // 생성자안 기본값을 출력
		
		Person p2 = new Person("이름");
		p2.name = "이름3"; // 필드에 직접 대입하여 변경도 가능
		System.out.println(p2.introduce());
		
		Person p3 = new Person("이름1", 10);
		p3.setName("이름2");
		System.out.println(p3.introduce());
		
		
	}
}





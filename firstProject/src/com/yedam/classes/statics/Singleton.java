package com.yedam.classes.statics;

public class Singleton {
	
	
	private static Singleton singleton = new Singleton(); //Singleton 클래스에서만 제한 시킨다?
	
	private Singleton() {
		
	}
	
	public static Singleton getInstance() {
		return singleton; // 싱글톤을 리턴 (private 사용 했기 때문에)
	}

}

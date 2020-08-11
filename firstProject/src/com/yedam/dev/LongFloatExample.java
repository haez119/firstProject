package com.yedam.dev;

import java.math.BigDecimal; // 클래스?

public class LongFloatExample {

	public static void main(String[] args) {
		System.out.println(Integer.MAX_VALUE);
		
		long l1 = 2147483648L; //int 범위 벗어나기 때문에 에러 => L없으면 int / L 붙이면 long
		
		float f1 = 0.1234567890123456789F; // float F 붙이기
		double d1 = 0.1234567890123456789; // double 그냥
		double d2 = 0.1234567890123456789;
		double d3 = d1 + d2;
		System.out.println("d3 = " + d3); // 근사치로 계산 ( 정밀도 떨어짐 )
		// 정확하게 계산하기
		BigDecimal db1 = new BigDecimal("0.1234567890123456789"); 
		BigDecimal db2 = new BigDecimal("0.1234567890123456789"); 
		BigDecimal db3 = db1.add(db2);
		System.out.println("db3 = " + db3); 
		
	}

}

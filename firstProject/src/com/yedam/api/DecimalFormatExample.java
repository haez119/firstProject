package com.yedam.api;

import java.text.DecimalFormat;

public class DecimalFormatExample {
	
	public static void main(String[] args) {
		
		double num = 1234567.89;
		
		
		DecimalFormat df = new DecimalFormat("0"); 
		System.out.println(df.format(num));
		
		df = new DecimalFormat("0.0"); 
		System.out.println(df.format(num));
		
		df = new DecimalFormat("0000000000.0000"); // 0으로 채워짐
		System.out.println(df.format(num));
		
		df = new DecimalFormat("#");
		System.out.println(df.format(num));
		
		df = new DecimalFormat("#.#");
		System.out.println(df.format(num));
		
		df = new DecimalFormat("################.########"); // 데이터에 맞게 출력
		System.out.println(df.format(num));
		
		df = new DecimalFormat("#.0");
		System.out.println(df.format(num));
		
		df = new DecimalFormat("+#.0");
		System.out.println(df.format(num));
		
		df = new DecimalFormat("-#.0");
		System.out.println(df.format(num));
		
		df = new DecimalFormat("#,###.0");
		System.out.println(df.format(num));
		
		df = new DecimalFormat("0.0E0");
		System.out.println(df.format(num));
		
		df = new DecimalFormat("+#,### ; -#,###");
		System.out.println(df.format(num));
		
		df = new DecimalFormat("#.# %");
		System.out.println(df.format(num));
		
		df = new DecimalFormat("\u00A4 #,###");
		System.out.println(df.format(num));
		
		
	}

}

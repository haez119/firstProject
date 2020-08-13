package com.yedam.exam;

public class Exercise5_07 {

	public static void main(String[] args) {
		
		int max = 0;
		int[] array = {1, 5, 3, 8, 2};
		
		for (int i =0; i<array.length; i++) {
			if(array[i] >= max) {
				max = array[i];
			}else {
				max = max;
			}
		}
		
		int min = array[0];
		for(int i=0; i<array.length; i++) {
			if(min >= array[i]) {
				min = array[i];
			} else {
				min = min;
			}
			
		}
		
		System.out.println("max : " + max);
		System.out.println("min : " + min);
	}

}

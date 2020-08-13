package com.yedam.ref;

public class ArrayExample3 {

	public static void main(String[] args) {
		
		
		int[][] iAry = {
						{10,20},
						{30,40,50},
						{60,30},
						{40}
						};
		
		
		for(int i=0; i<iAry.length; i++) {
			System.out.print("{ ");
			for(int j=0; j < iAry[i].length; j++) {
				System.out.print(iAry[i][j] + " ");
			}
			System.out.print("}");
			System.out.println();
		}
		
	}

}

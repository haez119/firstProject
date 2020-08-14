package com.yedam.ref;

public class MorningCode {
	public static void main(String[] args) {

		int[][] iAry = new int[5][5];
		int sum = 1;

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				iAry[i][j] = sum++;
				System.out.printf("%3d", iAry[i][j]);
			}
			System.out.println();
		}

		System.out.println();
		int num = 1;
		for (int j = 0; j < 5; j++) {
			for (int i = 0; i < 5; i++) {
				iAry[j][i] = num++; // 입력할 때 
				System.out.printf("%3d", iAry[i][j]); // 출력은 가로로 나오게 
			}
			
			System.out.println();
		}

	}

}

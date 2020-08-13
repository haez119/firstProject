package com.yedam.ref;

public class ArrayExample {

	public static void main(String[] args) {

		int score1 = 10, score2 = 20, score3 = 30, score4 = 40;
		score2 = 50;
		int sum = score1 + score2 + score3 + score4;

		int[] intAry = { 10, 20, 30, 40, 60, 70 }; // int만 다른타입x
		intAry[1] = 50;
		// sum = intAry[0] + intAry[1] + intAry[2] + intAry[3]; 반복문으로 간단하게 실행 가능
		sum = 0;

		for (int i = 0; i < intAry.length; i++) { // 배열 개수만큼 반복하기 .length (배열의 길이 반환)
			System.out.println(intAry[i]);
			sum += intAry[i];
		}
		System.out.println("sum: " + sum);
		System.out.println("avg: " + (double) sum/intAry.length);

//		double[] dAry = { 2.3, 4.3 };
//		String[] sAry = { "hello ", "world " };
//
//		for (int i = 0; i < sAry.length; i++) {
//			System.out.print(sAry[i]);
//		}
//
//		String[] scoreAry = new String[5]; // 배열의 크기만 지정. 초기값x
//
//		for (int i = 0; i < scoreAry.length; i++) {
//			System.out.println(scoreAry[i]);
//		}
//		scoreAry[0] = "one";
//		scoreAry[1] = "two";
//		scoreAry[2] = "three";
//
//		for (int i = 0; i < scoreAry.length; i++) {
//			System.out.println(scoreAry[i]);
//		}
//
//		int[] mathAry; // 선언 먼저 하고 나중에 초기값 줄 때는
//		mathAry = new int[] { 1, 2, 3, 4 }; // 이렇게
	}

}

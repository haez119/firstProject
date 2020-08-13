package com.yedam.ref;

public class ArrayExample2 {

	public static void main(String[] args) {
		
		int[] numAry = {2,4,5,3,5};
		int result = addAry(numAry); // 배열을 매개값으로
		int result1 = addAry(new int[] {1,2,3});
		
		System.out.println("배열의 합: " + result);
		System.out.println("배열의 합: " + addAry(new int[] {2,3,4,})); // 바로 넣기
		
		// 배열 복사 for문
		int[] oldA = {1,2,3};
		int[] newA = new int[5];
		
		for (int i=0; i<oldA.length; i++) {
			newA[i] = oldA[i]; // new에 old 값 대입
		}
		for (int i=0; i<newA.length; i++) {
			System.out.print(newA[i] + ", ");
		}
		
		// 배열 복사 System.arraycopy() 메소드
		
		System.out.println();
		System.arraycopy(oldA, 0, newA, 0, oldA.length); // 원본배열, 원본배열 인덱스, 새 배열, 새 배열의 인덱스, 복사할 배열의 개수
		for (int i=0; i<newA.length; i++) {
			System.out.print(newA[i] + ", ");
		}
		
		System.out.println();
		int[] sco = {95,71,84,93,87};
		int sum = 0;
		
		for(int sce : sco ) {
			sum += sce;
		}
		System.out.println(sum);
		System.out.println((double) sum / sco.length);
		
		
		
		
		
	}
	
	public static int addAry(int[] ary) {
		int sum = 0;
		for (int i =0; i<ary.length; i++) {
			sum += ary[i];
		}
		return sum;
	}
}

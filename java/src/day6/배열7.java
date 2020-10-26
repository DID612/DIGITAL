package day6;

import java.util.Scanner;

public class 배열7 {

	public static void main(String[] args) {
		/*5개짜리 배열에 랜덤으로 값을 생성하여 저장한후 
		 * 10에서 20 사이 랜덤으로 값을 생성하여 저장한 후 출력하는 예제 5-0 200p */
		int[] arr = new int[5];
		int min = 10, max = 20;
		int random;
		int store1=0, store2=0;
		
		for(int i=0;i<arr.length;i++) {
			random = (int)((max-min+1)*Math.random()+min);
			arr[i] = random;
			System.out.println("10에서 20 사이의 랜덤한 값이 저장된 배열 arr["+i+"] 의 값: " + arr[i]);	
		}		
		
		//강사님
		int size = 5;
		int arrG[] = new int[size];
		for(int i=0; i<arrG.length;i++) {
			arr[i] = i+1;
		}
	}

}

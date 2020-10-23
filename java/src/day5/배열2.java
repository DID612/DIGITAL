package day5;

import java.util.Scanner;

public class 배열2 {

	public static void main(String[] args) {
		/*
		 * 배열복사
		 */
		int num1 = 10, num2;
		num2 = num1;
		int arr1[] = new int[] {1, 2, 3, 4, 5};
		int arr2[] = arr1;
		
		/*
		 * arr2[0] = 100; 
		 * System.out.println("arr1[0] : " + arr1[0]);
		 * System.out.println("arr2[0] : " + arr2[0]);
		 */
		
		//arr2 복사하는 코드
		arr2 = new int[arr1.length];
		for(int i=0; i<arr1.length; i++) {
			arr2[i] = arr1[i];
		}
		arr2[0] = 100; 
		System.out.println("arr1[0] : " + arr1[0]);
		System.out.println("arr2[0] : " + arr2[0]);
		
		int arr3[] = new int[arr1.length*2];
		
		//arr1 출력하는 코드
		for(int i=0;i<arr1.length;i++) {
			System.out.print(arr1[i]+ " ");
		}
		System.out.println();
				
		//arr3 출력하는 코드
		System.arraycopy(arr1, 0, arr3, 0, arr1.length);
		for(int i=0;i<arr3.length;i++) {
			System.out.print(arr3[i]+ " ");
		}
		
		System.out.println();
		
		
		//Scanner를 통해 배열의 값을 저장하는 코드
		Scanner sc = new Scanner(System.in);
		for(int i=0; i< arr1.length;i++) {
			System.out.print(i+1+"번째 정수ㅡㄹ 입력: ");
			arr1[i] = sc.nextInt();
		}
		sc.close();
		for(int i=0; i< arr1.length;i++
				) {
		System.out.println("arr1["+i+"]의 값: " + arr1[i]);
		}
	}

}

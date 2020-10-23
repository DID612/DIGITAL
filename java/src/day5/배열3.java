package day5;

import java.util.Arrays;

public class 배열3 {

	public static void main(String[] args) {
		//배열을 복사하는 다양한 방법
		
		int newLen = 10;
		int[] arr1, arr2, arr3, arr4, arr5;
		arr1 = new int[newLen];
		arr2 = new int[newLen];
		arr3 = new int[newLen];
		arr4 = new int[newLen];
		arr5 = new int[3];
		
		for(int i=0; i<arr1.length; i++) {
			arr1[i] = (2*i);
		}
		//arr2의 arr1 복사
		System.arraycopy(arr1, 2, arr2, 0, arr1.length-2);
		
		//arr1 출력
		for(int i=0;i<arr1.length;i++) {			
			System.out.print(arr1[i]+ " ");			
		}
		//arr2 출력
		System.out.println();
		for(int i=0;i<arr2.length;i++) {			
			System.out.print(arr2[i]+ " ");			
		}
		
		//arr3의 arr2복사 및 출력
		System.out.println();
		arr3= Arrays.copyOf(arr2, 5);
		for(int i=0;i<arr3.length;i++) {			
			System.out.print(arr3[i]+ " ");			
		}
		
		//arr4의 arr3 복사 및 출력
		System.out.println();
		arr4= arr3.clone();
		for(int i=0;i<arr4.length;i++) {			
			System.out.print(arr4[i]+ " ");			
		}
		
		/*arr5의 arr2 복사 및 arr5출력
		  arr2[10] 4 6 8 10 12 14 16 18 0 0 
		  arr5[3]
		  */
		System.out.println();
		for(int i=0;i<arr5.length;i++) {
			arr5[i] = arr2[i];
		}
		for(int i=0;i<arr5.length;i++) {			
			System.out.print(arr5[i]+ " ");			
		}
		
	}

}

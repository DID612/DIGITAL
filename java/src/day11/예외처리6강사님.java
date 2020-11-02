package day11;

import com.sun.org.apache.bcel.internal.classfile.ExceptionTable;

public class 예외처리6강사님 {

	public static void main(String[] args) {
		int[] arr;
		int size = -1;
		int min =1, max=10;
		int[] arr2 = null;//new int[5];
		try {
			arr=createRandomArray(size,min,max);
			for(int i = 0;i<arr.length;i++) {
				System.out.print(arr[i]+" ");
			}
			createRandomRarray(arr2,min,max);
			for(int i = 0;i<arr2.length;i++) {
				System.out.print(arr2[i]+" ");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			//e.printStackTrace(); java.lang.Exception: 0으로 나눌 수 없습니다.
		  }
	}

	/*
	 * 기능 : 배열의 길이가 주어지면 주어진 배열의 길이만큼 배열을 생성하여 값을 랜덤으로 초기화 하여 배열을 변환시키는 메소드 단, 배열의
	 * 길이는 0보다 크거나 같다. 0보다 작으면 예외 발생. 
	 * 매개변수 : 주어지는 길이(int) 
	 * 리턴타입 : int[] 
	 * 메소드명 : createRandomArray
	 */
	public static int[] createRandomArray(int size, int min, int max) throws Exception {
		if(size<0) {
			throw new Exception("예외 발생: 배열의 길이는 0보다 크거나 같아야 합니다.");
		}
		int []tmp = new int[size];
		for(int i=0;i<size;i++) {
			tmp[i] = (int)(Math.random()*(max-min+1)) +min;
		}
		return tmp;
	}
	
	/*기능 - 배열이 주어지면 주어진 배열에 모든 값을 랜덤으로 초기화하는 메소드
	 * 매개변수 : 배열, 랜덤범위 => int [] arr, int min, int max
	 * 리턴타입 : 없음 => void
	 * 메소드명 : createRandomArray2*/
	
	public static void createRandomRarray(int[] arr, int min, int max) throws Exception{
		if(arr == null) {
			throw new Exception("NULL을 이용하여 저장할 수 없습니다.");
		}
		if(arr.length == 0){
			throw new Exception("배열의 길이가 0이어서 초기화할 수 없습니다.");
		}		
		for(int i = 0; i<arr.length;i++) {
			arr[i] = (int)(Math.random()*(max-min+1)) +min;
		}
	}
}
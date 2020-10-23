package day5;

public class 배열1 {

	public static void main(String[] args) {
		/*
		 * 배열: 같은 타입, 같은 의미의 변수들의 집합
		 * 배열 선언 방법
		 * 타입[] 배열이름; // 배열 선언
		 * 타입 배열이름[];
		 * -배열 선언 및 초기화
		 * 타입 [] 배열이름 = new 타입[길이]; //가장 많이 사용. 타입의 초기값으로 초기화. 초기값 어떻게 바꿔 넣을까
		 * 타입 [] 배열이름 = new 타입[]{초기값1, 2, ..., n}
		 * 타입 [] 배열이름 = {초기값1, 초기값2,..., n}//new를 사용하지 않는 선언은 반드시 선언과 동시에 초기화 할때만 가능.
		 * 배열의 길이는 0이상이어야 한다. 0포함
		 */
		int score1, score2, score3, /*... ,*/ score30;
		int[] arr1, arr2; // arr1 : 배열, arr2 : 배열
		int arr3[], arr4; // arr3 : 배열, arr4 : 변수
		
		arr1 = new int[5];
		arr2 = new int[] {1, 2, 3, 4, 5, 6};

		/*
		 * 배열은 반복문을 이용할 수 있기 때문에 편리하다.
		 * 배열의 값을 사용하기 위해서는 다음과 같아야 한다.
		 * 배열이름[번지]
		 * 번지는 0부터 시작 길이 -1 번지까지
		 * 
		 * - 배열의 길이는 배열이름.length로 알 수 있다.
		 */
		
		for(int i = 0; i < arr1.length ; i++) {
			System.out.println("배열[]의 "+(i+1)+"번째 값 : " + arr1[i]);
		}
		arr2[0] = 10;
		for(int i = 0; i < arr2.length ; i++) {
			System.out.println("배열[]의 "+(i+1)+"번째 값 : " + arr2[i]);
		}
		//java.lang.ArrayIndexOutOfBoundsException => 배열의 번지가 범위를 넘어가는 경우
		arr3 = new int[5];
		for(int i = 0; i < arr3.length ; i++) {
			System.out.println("배열[]의 "+(i+1)+"번째 값 : " + arr3[i]);
		}
		
		/*
		 * int []arr5 = null; System.out.println(arr5.length); //
		 * 초기화를 했기 때문에 소스 코드에서는 넘어가지만 
		 * null은 빈값이기 때문에 연속된 것을 구할 수 없다.
		 */
		
		/* 10개짜리 정수 배열 arr6를 생성하여 arr6에 1부터 10까지 정하고 출력하는 코드를 작성하세요
		 * 
		 */
		int []arr6;
		arr6 = new int[9];

		for(int i = 0; i<arr6.length;i++) {
			arr6[i]= i+1;
		}
		
		for(int i=0;i <= arr6.length; i++) {
			System.out.println("arr6[" + i + "]의 값은 : " + (i+1));
		}
	}

}

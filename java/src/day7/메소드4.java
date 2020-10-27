package day7;

public class 메소드4 {

	public static void main(String[] args) {
		int arr[] = new int[] {1,3,5,7,9,11,2,4,6,8,10,11,};
		printArray(arr);
		System.out.println(randomInteger(3,99));
		int arr1[] = new int[] {4, 3, 2, 9, 8, 7, 6, 10, 1, 5};

		int arr2[] = new int[4];
		printArray(arr1);
		sortArray(arr1);
		arr=createArray(5);
		printArray(arr1);
		
		
		int[] arr3 = createArray(6);
//		for(int i=0; i<arr.length; i++) {
//			System.out.println(sortArray(arr1));
//		}

		for(int i=0; i<arr1.length; i++) {
			System.out.print(arr1[i]+ " ");
		}
	}
	/* 기능 : 주어진 정수 배열의 값들을 콘솔에 출력하는 메소드
	 *  매개변수 : 정수 배열을 입력받음
	 *  리턴타입 : void sysout
	 *  메소드명 : printArray
	 *  만약 생성자를 두개 만든다면
	 *  new가 두개라면
	 *  두개의 주소를 가진 같은 이름의 배열이 만들어진다.
	 *  
	 */
	
	static void printArray(int arr[]) {
		for(int i=0; i<arr.length;i++) {
			//10개씩 한줄에 출력하기 위한 코드
			if(i % 10 == 0) {
				System.out.println();
			}
			System.out.print((arr[i] + " "));
		}
		System.out.println();
	}

	
	/* 랜덤
	 * 기능 : 원하는 정수 범위의 랜덤 정수값을 알려주는 메소드
	 * 매개변수 : 두가지 정수값 => 원하는 정수 범위=> min부터 max 까지 -> int min, int max
	 * 리턴타입 : 랜덤한 값 => 정수 =>int
	 * 메소드명 : randomInteger()
	 */
	
	static int randomInteger(int num1,int num2) {
		return	(int)((num2-num1+1)*Math.random()-num1);
	}
	
	/* 기능 : 주어진 정수 배열을 정렬하는 메소드
	 * 매개변수 : 정수 배열 => int[] arr
	 * 리턴타입 : 정수 배열 => 바뀐게 그대로 => 리턴이 필요 없는 것 같음. 배열 바꾸면 원래거가 바뀌기 때문에;
	 * 리턴타입1 : 없음 void
	 * 리턴타입2 : 정렬된 배열 = > int[]
	 * 메소드명 : sortArray
	 */
	
	static void sortArray(int arr[]) {
		// 배열 오름차순 정렬하기(예제5-10,p.201,버블정렬)
		//2번째 자리까지 정렬하면 1도 자동으로 정리되기 때문에 -1
		for(int i=1;i<arr.length-1;i++) {
			//-1하지 않으면 [9], [10] 비교가 되기 때문에 해줘야함
			for(int j=0; j<arr.length-1;j++) {
				//배열 j번지에 있는 값이 다음 배열값(j+1)보다 크면
				if(arr[j]>arr[j+1]) {
					int tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1]= tmp;
				}
			}
			//
//			for(int j=0; j<arr.length;j++) {
//				System.out.print(arr[j] + " ");
//			}
//			System.out.println();
		}
		
	}
	
	
	//강사님 배열 오름차순 정렬
	static void sorArray1(int [] arr) {
		for(int i=1;i<arr.length-1;i++) {
			for(int j=0; j<arr.length-1;j++) {
				if(arr[j]>arr[j+1]) {
					int tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1]= tmp;
				}
			}
		}
	}
	/* 기능 : 새로운 정수 배열을 만들어서 돌려주는 메소드
	 * 매개변수 : 만들어야할 배열, 배열의 길이 -> int[] arr
	 * 리턴타입: 새로 만든 배열 => int[]
	 * 메소드명: createArray
	 */
	
	//참조변수를 사용할때 유의사항. 주소를 바꾸면 원본의 값을 바꿀 수없다.
	static int[] createArray(int size) {
		return new int[size];
	}
}

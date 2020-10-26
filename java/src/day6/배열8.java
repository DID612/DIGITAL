package day6;

public class 배열8 {

	public static void main(String[] args) {
		/* 1부터 10까지 들어있는
		 * 배열의 값을 섞는 예제(예제5-7, p.197)
		 */
		int size = 10;
		int arr[]= new int [size];
		
		//1부터 10까지 배열을 저장하는 코드
		for(int i=0; i<arr.length;i++) {
			arr[i]= i+1;
		}
		
		//배열을 섞는 코드
//		1 2 3 4 5 6 7 8 9 10
//		3
//		4 2 3 1 5 6 7 8 9 10
//		1
//		4 2 3 1 5 6 7 8 9 10
//		9
//		4 2 10 1 5 6 7 8 9 3
		
		int cnt = 10; //섞는 횟수, 사실 필요없다
		int min = 0;
		int max = arr.length-1;
		for(int i = 0; i<arr.length; i++) {
			int index = (int)((max-min+1)*Math.random()+min);
			int tmp = arr[i];
			arr [i] = arr[index];
			arr[index] = tmp;
		}
		
		for(int i = 0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

}

package day7;

public class 로또 {

	public static void main(String[] args) {		
		int[] arr = new int[6];
		int[] arr1 = new int[6];
		randomArray(arr);
		winLottery(arr1);
		showArray(arr);
		System.out.println();
		showArray(arr1);
		System.out.println();
		
		if(matchArray(arr,arr1)>=6) {
			System.out.println("차라리 복권을 살걸... 당첨");
		}else if(matchArray(arr,arr1)==5) {
			System.out.println("와 2등");
		}else {
			System.out.println("3등 아래로는 따봤자임");
		}
	}
	/* 
	 * */

	static int random(int min,int max) {
		if(min > max) {
			int tmp = min;
			min = max;
			max = tmp;
		}
		return	(int)((max-min+1)*Math.random()+min);
	}
	
	/*
	 * 기능 : 주어진 배열에 모든 번지 있는 값을 랜덤으로 설정하는 메소드
	 * 매개변수 : 배열의 길이
	 * 리턴 타입: void
	 * randomArray
	 */

	static void winLottery(int[] arr) {
		for(int i=0; i<arr.length;i++){
			arr[i] = random(1,45);
		}
	}
	
	static void randomArray(int[] arr) {
		for(int i=0; i<arr.length;i++){
			arr[i] = random(1,45);
		}
	}
	
	static int[] showArray(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
		return arr;
	}
	
	static int matchArray(int[] arr, int[] arr1) {
		int cnt = 0;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				if(arr[i] == arr1[j]) {
					cnt++;
				}
			}
		}
		return cnt;
	}
}

package day7;

public class 강사님로또 {

	public static void main(String[] args) {
		
		int[] lotto = new int[7];//당첨번호, 6번지가 보너스번호
		int min = 1, max = 8;
		randomArray(lotto,min,max);
		printArray(lotto);
	
	}

	/*
	 * 기능 : 주어진 배열에 모든 번지 있는 값을 랜덤으로 설정하는 메소드
	 * 매개변수 : 배열의 길이
	 * 리턴 타입: void
	 * randomArray
	 */

	static int random(int min,int max) {
		if(min > max) {
			int tmp = min;
			min = max;
			max = tmp;
		}
		return	(int)((max-min+1)*Math.random()+min);
	}
	
	/*
	 * 기능: 배열에 특정 값이 있는지 없는지 알려주는 메소드
	 * 매개변수 : 배열, 특정값 => int []arr, int num
	 * 리턴타입 : 있는지 없는지 => 참 또는 거짓 =>boolean
	 * 메소드명 : isContain
	 */
	
	static boolean isContain(int[] arr, int num) {
	
		for(int tmp : arr) {
			if(tmp == num) {
				return true;
			}
		}
		return false;
	}
	
	static void randomArray(int[] arr, int min, int max) {
		// 1 2 3 4 5 6
		// 12 111 1 1 243 4112 3 이럴 경우 계속 해야하는데
		//for 문은 보통 횟수가 정해져있을때 쓴다 따라서 while 서보자
		
		/*
		 * 1 0 0 0 0 0 0
		 * 1
		 * 1 1 1 1 1 1 1 
		 * 만든 수가 있으면 아무것도 안하고 없다면 배열 다음값에 직접 넣어준다. 
		 */
		if(max-min+1 <= arr.length) {
			System.out.println("정수의 범위가 배열의 크기보다 작습니다.");
			return;
		}
		int cnt = 0;
		while(cnt < arr.length) {
			int r = random(min, max);
			System.out.println(r);
			if(!isContain(arr,r)) {
				arr[cnt] = r;
				cnt++;
			}
		}
	}
	
	static void printArray(int arr[]) {
		for(int i=0; i<arr.length;i++) {
			System.out.print((arr[i] + " "));
		}
		System.out.println();
	}
}

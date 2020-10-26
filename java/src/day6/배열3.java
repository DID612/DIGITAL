package day6;

public class 배열3 {

	public static void main(String[] args) {
		/* 10개짜리 배열을 생성하여 0번지에 1, 1번지에2,...9번지에 10을
		 * 저장하고 출력하는 예제
		 */

		int size = 10; //여차하면 길이를 늘리거나 입력받을 수 잇게?
		int[] arr = new int[size];
		
		for(int i = 0; i<size;i++) {
			arr[i] = i+1;
			System.out.println("arr[" +i+"]는 "+arr[i]);
		}
		System.out.println("-------------------------");
	}

}

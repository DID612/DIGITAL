package day6;

public class 배열10 {

	public static void main(String[] args) {
		//빈도수 예제(예제 5-11, p.204)
		/*배열의 값은 1에서 10사이
		 *배열 arr에 있는 값들의 빈도수를 count에 저장한후 출력하는 예제 
		 *이 예제 방법을 이용하려면 배열 arr에 음수 값이 없어야 한다.
		 */
		int arr[] = new int[] {1,1,3,3,4,5,6,7,9,9,10};
		int count[] = new int[11]; //빈도수를 저장할 배열
		
		//arr.length 가지고 count 배열을 늘리기 때문에 arr.length가 일단 위다
		for(int i=0; i<arr.length; i++) {
			count[arr[i]]++;
			/* 풀어쓰면
			 * int index = arr[i]
			 * count[index] = count[index]+1;
			 */
			
			// count[1] = 0+1, count
		}//숫자출력
		for(int i=0; i<count.length; i++) {
			System.out.print(count[i]+ " ");
		}
		//숫자개수출력
		System.out.println();
		for(int i=0; i<count.length; i++) {
			System.out.print(count[i]+ " ");
		}
		System.out.println();

		/*향상된 For문
		 * for(변수명 a : 배열명){
		 * 
		 * }
		 * 배열에서 하나 꺼내서 변수명 a에 저장하여 사용
		 * -배열 전체를 탐색하는 경우 사용
		 * -배열값을 확인할 때 사용 **
		 * -배열값을 수정할 때 사용하지 않음. 수정할 때는 굳이 쓰느니 원래 for문을 쓰겠다
		 */
		for(int tmp : count) {
			System.out.print(tmp+ " ");
		}
		System.out.println();
	}

}

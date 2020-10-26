package day6;

public class 배열5개선 {
	public static void main(String[] args) {
		/* 
		 * 다음과 같은 배열이 있을 떄 최소값과 최대값을 찾아 출력하세요.
		 * i랑 j 비교 i가 더 작으면 min에 저장
		 * 범위가 주어지지 않으면 0번지의 값으로 초기화를 많이 한다.
		 */
		int arr[] = new int[]{1, 3, 5, 10, 20, 4, 8};
		int min = arr[0];
		int max = arr[0];
		for(int i=0; i<arr.length ;i++) {
			if(min > arr[i]) {
				min = arr[i];
			}
			
			if(max < arr[i]) {
				max = arr[i];
			}
		}
		System.out.println("배열안의 최소값은 : " + min);
		System.out.println("배열안의 최대값은 : " + max);
	}
//	for 두개로 최소값 구하는 경우에 대해 고민해보자.
//	1, 3, 5, 10, 20, 4, 8
}

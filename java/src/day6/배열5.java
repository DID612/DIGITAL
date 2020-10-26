package day6;

public class 배열5 {
	public static void main(String[] args) {
		/* 
		 * 다음과 같은 배열이 있을 떄 최소값을 찾아 출력하세요.
		 */
		int arr[] = new int[]{1, 3, 5, 10, 20, 4, 8};
		int min = arr[0];
		for(int i=0; i<arr.length ;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					min=arr[j];
				}else if(arr[i]<arr[j]){
					min=arr[i];
				}
			}
		}
		System.out.println("배열안의 최소값은 : " + min);
	}
//	1, 3, 5, 10, 20, 4, 8
//	1, 3, 5, 10, 20, 4, 8
}

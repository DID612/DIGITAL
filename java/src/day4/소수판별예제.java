package day4;

public class 소수판별예제 {

	public static void main(String[] args) {
		/* num가 소수인지 아닌지 판별하는 예제
		 * 2에서 100 사이에 모든 소수
		 */
		
//		소수의 조건 1과 자기 자신만으로 나눠진다
//		범위 입력받는 2에서 100사이
//		모든 소수 출력
		
		
		int i, num, cnt;
		for(num=2;num<=100;num++) {
			for(i=1,cnt=0;i<=num;i++) {
					if(num % i ==0) {
						cnt++;
					}
			}
				if(cnt == 2) {
					System.out.println(num+" ");
				}
		}
	}
}


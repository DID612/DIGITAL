package day3;

public class For문3 {

	public static void main(String[] args) {
		/* 1부터 10까지 합
		 * 반복횟수 : i는 1부터 10까지 1씩 증가
		 *  -초기화 : i는 1부터
		 *  -조건식 : i는 10까지 => i는 10보다 작거나 같다
		 *  -증감연산식 : i는 1씩 증가
		 * 규칙성 :
		 * i=1, sum = 0 + 1
		 * i=2, sum = 0 + 1 + 2
		 * i=3, sum = 0 + 1 + 2 + 3
		 * ...
		 * i=10, sum = 0 + 1 + 2 + 3 + 4 + ... + 10
		 */
		
		int i, sum;
				
		for(i = 1, sum = 0; i <= 10; i++) {
			sum = sum + i;
		}
		System.out.println("1부터 10까지의 합 : " + sum);

		int j, sum1, sum2;
		
		for(j = 2, sum1 = 0; j <= 10; j += 2) {
			sum1 = sum1 + j;
		}
		System.out.println("1부터 10까지 짝수의 합 : " + sum1);
		
		for(j = 1, sum2 = 0; j <= 10; j ++) {
			if(j % 2 != 0) {
				sum2 = sum2 + j;
			}
		}
		System.out.println("1부터 10까지 홀수의 합 : " + sum2);
	}	
}

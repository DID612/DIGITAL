package day4;

import java.util.Scanner;

public class 최대공약수Break {

	public static void main(String[] args) {
		/*
		 * 두 정수 num1과 num2를 입력받고 두 정수의 최대 공약수를 출력하는 예제 
		 * 공약수 : 두 정수의 공통으로 있는 약수 
		 * 최대공약수 : 두 정수의 고약수중 가장 큰 수 
		 * 8과 12의 공약수 : 1 2 4 
		 * 8과 12의 최대 공약수 : 4
		 *  - 반복횟수 : i는 num1부터 1까지 1씩 감소
		 *  - 규칙성 : i가 num1과 num2의 공약수이면 i를 출력 후 반복문 종료
		 *  => num1을 i로 나누었을 때 나머지가 0과 같고
		 *  	num2를 i로 나누었을 때 나머지가 0과 같다면
		 *  	gcd에 i를 저장
		 *  - 반복문 종료 후 : gcd를 출력
		 */
		
		// num1과 num2의 약수를 구한다
		// num1과 num2의 약수가 같은것을 공약수라고 출력한다
		// num1과 num2의 약수가 같은 것중에 가장 큰것을 공약수라고 출력한다.
		
		/* - 반복횟수 
		 * 
		 */
		
		Scanner sc = new Scanner(System.in);
		int num1, num2, i, gcd = 1;
		System.out.println("공약수와 최대공약수를 구할 두 값을 입력!! : ");
		
		num1 = sc.nextInt();
		num2 = sc.nextInt();

		for(i = num1; i >= 1; i--) {
			if(num1 % i == 0 && num2 % i == 0) {
					System.out.print(num1 + " 과 " + num2 + "의 최대공약수 : " + i);
					break;
			}
		}
		System.out.println();	
		System.out.println("최대 공약수: " + i);
		sc.close();
	}
}

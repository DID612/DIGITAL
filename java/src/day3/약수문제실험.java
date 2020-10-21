package day3;

import java.util.Scanner;

public class 약수문제실험 {

		public static void main(String[] args) {
			/* 입력받은 num의 약수들을 출력하는 예제
			 * 약수 : 나누어 떨어지는 수
			 * 12의 약수 : 1 2 3 4 6 12
			 */
			Scanner sc = new Scanner(System.in);
			int i, j, k;
				System.out.print("약수를 구하고 싶은 수를 입력하세요 : ");	
			for(i = 1, j = sc.nextInt(), k = 0; i <= j; i++) {
				if(j % i == 0) {
					k = k + 1; 
					if(k % 5 == 0) {
						System.out.println(i);		
					}else {
						System.out.print(i + " ");
					}
				}
			}
			sc.close();
		}
}


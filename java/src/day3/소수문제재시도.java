package day3;

import java.util.Scanner;

public class 소수문제재시도 {

	public static void main(String[] args) {
		/* 입력받은 num의 약수들을 출력하는 예제
		 * 약수 : 나누어 떨어지는 수
		 * 12의 약수 : 1 2 3 4 6 12
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("소수인지 알고 싶은 수를 입력하세요 : ");
		int i, j, k;
		for(i = 1, j = sc.nextInt(), k = 0; i <= j; i++) {
			if(j % i == 0) {
				k = k+1;
			}
		}
		if(k == 2) {
			System.out.println(j+ "는 소수입니다.");
		}else {
			System.out.println(j+ "는 소수가 아닙니다.");
		}
		sc.close();
	}

}


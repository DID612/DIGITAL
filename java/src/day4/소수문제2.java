package day4;

import java.util.Scanner;

public class 소수문제2 {
	public static void main(String args[]) {
		/*
		 * 반복문 : 규칙성을 가진 반복적인 작업을 할때 사용 for(1. 초기화; 2.5.조건식; 4.8.반복문){ 3.6. 실행문; } 초기화 :
		 * 조건식이나 실행문에서 사용하는 변수를 초기화 조건식 : 반복문 실행을 결정하는 부분 참이면 반복문 진행, 거짓이면 종료 증감연산식 : 주로
		 * 조건식에서 사용하는 변수를 증가 또는 감소
		 * 
		 * 반복문 문제 해결 과정 - 반복횟수 -초기화 -조건식 -증감연산식 -규칙성(실행문)
		 * 
		 * 1부터 10까지 콘솔에 출력하는 예제 =>i는 1부터 10까지 1씩 증가 -초기화 : i는 1부터 -조건식 : i는 10까지 -증감연산식
		 * : i는 1씩 증가 규칙성 : i를 출력
		 * 
		 * i = i + 1; i += 1;
		 * 
		 * A = B / A; A /= b; => A = A / B; + *는 상관없지만 - / 는 순서 바뀌면 결과값 달라짐
		 */

		
//		  int num; for(num=1;num <= 10;num++) { System.out.println(num); }
	 

		/*
		 * j를 입력받아 입력받은 j가 소수인지 아닌지 판별하는 예제 소수 : 약수가 1과 자기자신인 수로 약수가 2개이다.
		 * 
		 * 입력받은 숫자를 1씩 증가하는 i로 % 나머지가 0이면 약수 카운트 + 1 k라는 변수가 있고 이 k는 반복문이 실행될때마다 + 1,
		 * j라는 입력값까지 올라감.
		 * 
		 * 그래서 j % k == 0 이 되어야지만 출력
		 */

		Scanner sc = new Scanner(System.in);
		int i, j, k;
		
		System.out.println("소수를 구하고자 하는 정수를 입력! : ");
		for (i = 1, j = sc.nextInt(), k = 1; i < j; i++) {
			if (j % i == 0) {
				k = k - 1;
			}
		}
		
		if (k < 0) {
			System.out.println(j + " 이건 소수입니다 ㅠㅠ");
		}else if(k == 0){ 
			System.out.println(j + " 이건 소수가 아닙니다 ㅠㅠ");
		}else {
		}
	}
}

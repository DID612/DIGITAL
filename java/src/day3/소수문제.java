package day3;

import java.util.Scanner;

public class 소수문제 {

	public static void main(String[] args) {
		// 입력받은 숫자를 1과 자기 자신만으로 나누는 소수 문제 만들어보기
		Scanner sc = new Scanner(System.in);
		int i, j, k;
		
		System.out.println("소수를 구할 정수를 입력해주세요: ");
		for(i = 2, j = sc.nextInt(); i < j; i++) {
			if(j % i != 0) {
				k = i+1;
				if(k == j) {
					System.out.println(j + "는 소수입니다.");
				}else if(j % i == 0 && k == j){			
					System.out.println(j+ "는 소수가 아닙니다.");
				}
			}
		}

	}
			
}



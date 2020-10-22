package day4;

import java.util.Scanner;

public class 입력값Ab사이에소수구하기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		System.out.print("소수를 구할 두 정수범위를 입력하세요 : ");
		int a, ac, b, bc, i, cnt;
		a = sc.nextInt();
		b = sc.nextInt();
		
		if(a > b) {
			for(bc=b ; bc<=a ; bc++) {
				for(i=1, cnt=0 ; i<=bc; i++) {
					if(bc % i ==0) {
						cnt++;
					}
				}
				if(cnt == 2) {
					System.out.println(a +" 와 "+ b + " 사이의 소수는 " + bc);
				}
			}
		}else if(a == b) {
			System.out.println("잘못된 범위");
		}else {
			for(ac=a ; ac<=b ; ac++) {
				for(i=1, cnt=0 ; i<=ac; i++) {
					if(ac % i ==0) {
						cnt++;
					}
				}
				if(cnt == 2) {
					System.out.println(a +" 와 "+ b + " 사이의 소수는 " + ac);
				}
			}
		}
	}

}

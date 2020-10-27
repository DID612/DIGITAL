package day7;

import java.util.Scanner;

public class 메소드2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		isPrime100(100);
//		System.out.println(gcd(45, 90));
//		System.out.println(greatestCommon(45,90));
//		System.out.print("최소공배수를 구할 두 정수를 입력하세요! :");
//		Scanner sc = new Scanner(System.in);
//		int num1, num2;		
//		num1 = sc.nextInt();
//		num2 = sc.nextInt();
//		System.out.println(num1+"와 "+num2+"의 최대공약수는"+greatestCommon(num1,num2));
//		System.out.println(lcm(num1,num2));
//		System.out.println(lcm2(num1,num2));
		isPrime100(100);
	}
	/* 기능 : 최대 공약수 구하는 메소드
	 * 매개변수 : 두개의 정수 
	 * 리턴타입 : 최대 공약수인 정수값
	 * 메소드명 : greatestCommonDivisor()
	 */
	
	static int gcd(int num1, int num2) {
		//res result 약자
		int res = 0;
		for(int i = 1; i <= num1; i++) {
			if(num1 % i == 0 && num2 % i == 0) {
				res = i;
			}
		}
		return res;
	}
	
	//왜 안댐? 입력한 숫자 47 49 둘다 소수임 ㅋ;ㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋ
	static int greatestCommon(int num1, int num2) {
		int gc = 0;
		for(int i = 1; i <= num1; i++) {
			if(num1 % i == 0 && num2 % i == 0) {
				gc = i;
			}
		}
		return gc;
	}
	
	//이자식 왜 출력 안댈까? 
	static void isPrime100(int num) {

		for(int i = 1;i<=num;i++) {
			int cnt = 0;
			for(int j =1; j<=i;j++) {
				 if((i % j) == 0) {
					 cnt++;
				 }
				 if(cnt == 2) {
					 System.out.print(i+ " ");
			}
			}
		}
	}
	
	/*기능: 최소 공배수를 구하는 메소드
	 * 매개변수 : 두 정수 => int num1, int num2
	 * 리턴타입 : 최소공배수 => 정수 => int
	 * 메소드명 : lcm
	 * 
	 * 최소공배수 = (a*b)/g
	 */
	
	static int lcm(int num1, int num2) {
		int i = 0;
		for(i = num1; ; i += num1) {
			if(i % num1 == 0 && i % num2 == 0) {
				System.out.println(num1 + " 와 " + num2 + ".\n" + "두 정수의 최소공배수는 " + i);
//				break; //반복문 바깥으로 빠져나가버림, continue는 계속실행
				return i;
			}
		}
//		return i;
	}
	
	static int lcm2(int num1, int num2) {
		return num1 * num2 / gcd(num1, num2);
	}	
}

package day2;

import java.util.Scanner;

public class 콘솔입력문제 {

	public static void main(String[] args) {
		/* 정수와 문자와 정수를 입력받으세요.
		 * 예시
		 * 정수 문자 정수를 입력하세요(예: 1 + 2) : 1 + 2
		 * 입력받은 값 : 1 + 2
		 * */
		Scanner scan = new Scanner(System.in);

		int num1, num2;
		String op;
		
		System.out.print("정수 문자 정수를 입력하세요(예: 1 + 2) :");
		
		num1 = scan.nextInt();
		op = scan.next();
		num2 = scan.nextInt();
		
		System.out.println("입력 받은 값 : "+num1+" "+op+" "+num2);
		System.out.printf("입력 받은 값 : %d %s %d는 %d입니다.", num1, op, num2, num1+num2);
		//+ 전에 띄어쓰기 안써도 입력이 되게 해보고 싶다...
		
		scan.close();
	}

}

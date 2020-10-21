package day3;

import java.util.Scanner;

public class Switch문1 {
	public static void main(String args[]) {
		/*
		 * 모든 조건문은 if 문으로 처리할 수 있다 
		 * 그 중에서 일부는 switch문을 이용하면 깔금하게 처리할 수 있다.
		 * switch(식/변수){
		 * 	case 값1:
		 * 		실행문1;
		 * 		break;
		 * 	case 값2:
		 * 		실행문2;
		 * 		break;
		 * 	default:
		 * 	case 값3;
		 * 		실행문3;
		 * 		break; default는 break가 빠져도 된다. break 없으면 식맞으면 밑에것도 한다. 
		 * 그런데 default는 마지막이라 괜춘 ㅎ
		 * }
		 * 
		 * == if식(식/변수 == 값1){
		 * 	실행문1;
		 * }else if(식/변수 == 값2){
		 * }else{
		 * 	실행문3;
		 * }
		 * 
		 */
		
		Scanner scan = new Scanner(System.in);
			System.out.print("정수를 입력하세요:");
		int num = scan.nextInt();
		if(num % 2 == 0) {
			System.out.println(num + "는 짝수.");
		}else {
			System.out.println(num + "는 홀수.");
		}
		
		switch(num % 2) {
		case 1:
			System.out.println(num + "는 홀수.");
			break;
		default:
			System.out.println(num + "는 짝수.");
		}
		
		scan.close();
	}
}

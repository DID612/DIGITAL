package day5;

import java.util.Scanner;

public class While문1 {

	public static void main(String[] args) {
		/*
		 * while(조건식){
		 * 	실행문;
		 * }
		 * 
		 * 초기화;
		 * while(조건식){
		 * 	실행문;
		 * 	증감식;
		 * }
		 * 
		 *  - while문 조건식 생략 불가능
		 */
		
		for(int i = 1; i<=5; i++) {
			System.out.println(i);
		}
		int j = 1;
		while(j <= 5) {
			System.out.println(j);
			j++;
		}
		
		while(j<=5) {
			System.out.println((2*j));
			j++;
			
		}
		
		while(j<=5) {
			if(j%2 == 1) {
				j++; // 이걸 넣지 않으면 에러뜸. for문과 while문이 비슷하지만 다른걸 잘 보여줌
				//이거 홀수만 구하게 하면 1은 어떻게하지??
				continue;
			}
			System.out.println(j);
			j++;
		}
		
		/*
		 * for문은 차례대로 증가하는 경우 = > 증감연산식이 꼭 필요한 경우 
		 * while문은 입력받은 값을 이용하며 반복문을 유지하는 경우
		 */
		
		int menu = -1;
		Scanner sc = new Scanner(System.in);
		while(menu != 4) {
			System.out.println("---메뉴---");
			System.out.println("1.불러오기");
			System.out.println("2.저장하기");
			System.out.println("3.실행하기");
			System.out.println("4.종료하기");
			System.out.println("---------");
			System.out.print("메뉴를 선택하세요 : ");
			menu = sc.nextInt();
		}
		System.out.println("프로그램 종료!~");
		sc.close();
	}

}

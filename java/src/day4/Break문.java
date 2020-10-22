package day4;

import java.util.Scanner;

public class Break문 {

	public static void main(String[] args) {
		/* break : 반복문을 빠져 나오게하는 키워드
		 * - break는 반드시 조건문을 동반한다. 
		 * - break를 만나면 반복문을 빠져 나감
		 */
		
		int i;
		for(i = 1; ; i++) {
			System.out.println(i);
			if(i == 10) {
				break;
			}
		}
		for( ; ; ) {
			System.out.println("문자를 입력하세요(종료하려면 y나 Y를 입력) : ");
			Scanner sc = new Scanner(System.in);
			char ch;
			ch = sc.next().charAt(0);
			if(ch == 'y' || ch == 'Y') {
				break;
			}
		}
	}

}

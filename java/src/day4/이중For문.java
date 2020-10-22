package day4;

public class 이중For문 {

	public static void main(String[] args) {
		/*
		 * for(1.초기화;2.조건식;3.증감식){ 
		 * 	for(4.초기화;5.조건식;6.증감식){
		 * 		실행문1;
		 * 	}
		 * 		기타실행문;
		 * }
		 * 123에서 사용하는 변수와 456에서 사용하는 변수가 일반적으로 다르다
		 * *****
		 * *****
		 * *****
		 */
		int i, j, k;
		/*
		 * for(i = 1; i<=5; i++) { for(j = 1; j<=10;j++) { System.out.print ("*"); }
		 * System.out.println(); }
		 */
		/*
		 * 구구단 7단을 출력하는 예제
		 */

		for(j =2; j<=9; j++) {
			for(i = 1; i <=9 ;i++) {
				if(i == 1) {
					System.out.println(j + "단 구구단 시작!\n");
					System.out.println(j + " X " + i + " = " + i*j);
				}
				System.out.println(j + " X " + i + " = " + i*j);
			}
			System.out.println();
		}
	}

}

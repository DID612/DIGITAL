package day3;

public class For문2 {

	public static void main(String[] args) {
		/* 구구단 7단을 출력하는 예제
		 * 반복횟수 : 9번
		 * 규칙성 : X * X
		 *  두가지 변수를 곱해서 구구단을 만든다. 그 중에서 7단만 출력
		 */

		int num, num1, num2, num3;
		num1 = 1; num2 = 1;
		
		
		if(num2 < 10) {
			for(num1 = 1; num1 <= 9; num1++) {
				for(num2 = 1; num2 <=9; num2++) {
					if(num1 == 7) {
						num3 = num1 * num2;
						System.out.println(num1 + " x " + num2+ " = " + num3 );
					}
				}
			}
		}else {
			num2 =1;
		}
		
		for(num = 1; num <=9; num++) {
			System.out.println("7 X " + num+ " = "+ 7*num);
		}
  }
}		


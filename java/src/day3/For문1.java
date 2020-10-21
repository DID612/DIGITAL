package day3;

public class For문1 {

	public static void main(String[] args) {
		/* 반복문 : 규칙적인 작업을 반복적으로 할때 사용하는 문법
		 * 종류 : for문, while문, do while문
		 * 	- for문과 while문은 문법은 다르지만 동작 방식은 같다
		 *  - do while문은 다르다
		 *  for과 while문은 호환이 가능하지만 do while은 불편
		 *  for(초기화; 조건식; 4.증감연산식){
		 *  	실행문;
		 *  }
		 *  1. 초기화 : 조건식이나 실행문에서 사용하는 변수를 초기화, 반복문 실행시
		 *  		처음만 실행된다. 생략 가능
		 *  2. 조건식 : 반복문의 반복을 결정하는 식으로 참이면 반복하고 거짓이면
		 *  		그만한다. 생략가능(생략하면 무조건 참)
		 *  4. 증감연삭식 : 조건식에서 사용하는 변수를 증가/감소 시켜서 반복 횟수를 결정한다. 생략가능
		 * 
		 */
		for(int num1 = 1; num1 <= 10; num1++) {
			System.out.print(num1 + " ");
			
			/* 반복문 헷갈릴때
			 * 1부터 10까지 출력하는 예제
			 * 반복횟수 :
			 *  - 초기화 : 1
			 *  - 조건식 : 10까지 => 10보다 작거나 같다.
			 *  - 증감연삭식 : 1씩 증가
			 * 규칙성(실행문) : num1을 출력
			 * 반복문 종료후 : 없음
			 */		
		}
		System.out.println();
		/* 10부터 1까지 출력하는 예제
		 * 반복횟수 : num은 10부터 1까지 1씩 감소
		 *  - 초기화 : num은 10부터
		 *  - 조건식 : num가 1까지 => num가 1보다 크거나 같다.
		 *  - num가 1씩 감소
		 * 규칙성 : num을 출력
		 * 반복문 종료후: 없음
		 */
		
		for(int num = 10; num >= 1; num--) {
			System.out.print(num+" ");
		}
		/* 1부터 10 사이의 모든 짝수를 출력하는 예제
		 * 반복횟수:10
		 * 규칙성:짝수를 출력 
		 */

			System.out.println();
		int num2 = 1;
		
			for(;num2 <= 10; num2++) {
				if(num2 % 2 == 0) {
				System.out.print(num2 + " ");
			}		
		}
	}
}
//			for(numEven = 1.0 ;numEven <= 5; numEven++) {
//			System.out.println(numEven*2 + "는 짝수입니다.");
//		}
			
//
//		for(;num3 <= 10; num3 += 2) {
//			System.out.println(num3 + " 는 짝수입니다.");
//			//1부터 10까지 모두 나누기 2해서 0이면 값 그대로 출력
//			// numEven / 2 == 0 -> sysout numEven+는 짝수입니다.
////		double numEven;
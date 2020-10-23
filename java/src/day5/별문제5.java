package day5;

public class 별문제5 {

	public static void main(String[] args) {
		/*
		 * 일반변수 vs 참조변수
		 *  - 일반변수는 변수 타입(자료형)을 이용한 변수들로 값을 저장
		 *  - 참조변수는 주소를 저장하는 변수로, 객체, 배열 등이 있다.
		 * 
		 * 	- 지역변수 : 특정 지역에서 사용하는 변수
		 */
		
		int i ;
		for(int j=1; j<=5;j++) {
			System.out.println(j);
		}
		if(i % 2 ==0) {
			int k = 1;
			System.out.println(k);
		}
		for(int j=1;j<=5;j++) {
			System.out.println(j);
		}
		for(int j=6;j<=10;j++) {
			System.out.println(j);
		}
	}

}

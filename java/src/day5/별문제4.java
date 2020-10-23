package day5;

public class 별문제4 {

	public static void main(String[] args) {
		/* for(초기화;조건식;증감연산식){
		 * 		실행문;
		 * }
		 * 
		 */
		
		int i;
		for(i=1; i<=5; i++); {
			System.out.println(i);
		} // 6 세미클론 잘못 붙이는 경우

		for(i=1; ; i=i+1) {
			if(i % 2 == 0) {
				System.out.println(i);
			}
		} // i += 100 했더니 안된다??
	}

}

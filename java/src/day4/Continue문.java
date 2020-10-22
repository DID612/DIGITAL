package day4;

public class Continue문 {

	public static void main(String[] args) {
		/* Continue는 스킵이라고 생각하면 됨
		 * Continue는 for문과 while 문에 따라 건너뛰는 위치가 달라진다.
		 * for문의 실행문에 continue를 만나면 증감연산식으로 이동한다.
		 * continue는 무조건 if 랑 나옴
		 */
		int i;
		for(i = 1; i <= 10; i++) {
			if(i == 5) {
				continue;
			}
			System.out.print(i + " ");
		}
		System.out.println();
		/* continue를 이용한 10이하의 짝수 출력 예제 */
		for (i = 1; i <= 10; i++) {
			if(i % 2 != 0) {
				continue;
			}
			System.out.println("짝수 : " + i);	
		}
	}

}

package day4;

public class 별문제3 {

	public static void main(String[] args) {
		/*이중반복분믈 이용하여 아래와 같이 출력되도록 작성하세요
		 * 
		 * *****
		 * *****
		 * *****
		 * *****
		 * *****
		 */
		
		for(int i = 1; i<=5;i++) {
			for(int j = 1; j <= 5; j++) {
			System.out.print("*");
			}
		System.out.println();
		}
		
		/*
		 * *
		 * **
		 * ***
		 * ****
		 * *****
		 * i가 1이면 한번출력
		 * i가 2면 두번출력~
		 * ~5
		 */
		for(int i = 1; i<=5;i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*");				
			}
			System.out.println();
		}
		
		/*이중 반복문을 이용하여
		 *     * i=1 공4 *=1
		 *    ** i=2 공3 *=2
		 *   *** i=3 공2 *=3
		 *  **** i=4 공1 *=4
		 * ***** i=5 공0 *=5
		 *           공? *=i
		 *           
		 *     * i=1 공4 *=1
		 *    ** i=2 공3 *=2
		 *   *** i=3 공2 *=3
		 *  **** i=4 공1 *=4
		 * ***** i=5 공0 *=5
		 *           공5-i *=i
		 * 
		 */
	
		int i, j;
		
		for(i는 1로 시작;i가 5보다작거나 같으면; i+1=i) {
			//반복문을 이용하여 공백을 출력
			for(j는 1로 시작; 5-i보다 j가 작거나 같으면; j+1=j) {
				공백을 넣는다;
			}
			for(j는 1로 시작 ;j가 i보다 작거나 같으면; j+1=j) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

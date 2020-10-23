package day5;

public class 별문제6 {

	public static void main(String[] args) {
		/*
		 *     *   
		 *    ***
		 *   *****
		 *  *******
		 * *********
		 */
		
		/*
		 *     *
		 *    ** *
		 *   *** **
		 *  **** ***
		 * ***** ****
		 */
		
		/* *********
		 *  *******
		 *   *****
		 *    ***
		 *     *
		 *     
		 *     i=1 공=0 *=9 8 4(5-i)
		 *     i=2 공=1 *=7 6 3
		 *     i=3 공=2 *=5 4 2 
		 *     i=4 공=3 *=3 2 1
		 *     i=5 공=4 *=1 0 0
		 *     여기서 규칙을 구하자
		 *     i=i+1 공= i-1 *=11-(2*i)
		 *     *앞으로도 이런식으로* 
		 */
		int num1 = 5, num2 = 10;
		
		for(int i=1; i<=5;i++) {
			for(int k=1; k<= 5-i;k++) {
				System.out.print(" ");
			}
			for(int j=1; j<=i;j++) {
				System.out.print("*");
			}
			for(int k=i; k<=i;k++) {
				System.out.print(" ");
			}
			for(int j=1; j<i;j++){
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i =1;i<=5;i++) {
			for(int j=1;j<=5-i;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			for(int j=1; j<=i-1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i=1;i<=5;i++) {
			for(int k=1;k<i;k++) {
				System.out.print(" ");
			}
			for(int j=1;j<=10-2*i;j++) {
				System.out.print("*");
			}
			for(int k=5;k == i;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i=1; i<=5;i++) {
			for(int j=1; j<i;j++) {
				System.out.print(" ");
			}
			for(int k=0;k<=10-2*i;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i=1; i<=num1;i++) {
			for(int j=1; j<=i-1;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=2*(num1-i)+1;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}

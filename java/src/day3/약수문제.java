package day3;
	import java.util.Scanner;
	
public class 약수문제 {

	public static void main(String[] args) {
		/* 입력받은 num의 약수들을 출력하는 예제
		 * 약수 : 나누어 떨어지는 수
		 * 12의 약수 : 1 2 3 4 6 12
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("약수를 구하고 싶은 수를 입력하세요 : ");
		int i, j;
		for(i = 1, j = sc.nextInt(); i <= j; i++) {
			if(j % i == 0) {
				System.out.print(i + " ");
			}

		}
		sc.close();
	}

}


//			if(j % 10 == 0) {
//				System.out.println();
//			}
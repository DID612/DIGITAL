package day4;

import java.util.Scanner;
public class 소수판별실험 {

	public static void main(String[] args) {
		/* num가 소수인지 아닌지 판별하는 예제
		 * 2에서 100 사이에 모든 소수
		 */
		
/*
 * 두가지 수 a,b 를 입력받고 
 * a>b보다 크면 
 * 1부터 시작해서 1씩 늘어나는 i를 이용해 
 * a % i == 0 이 나올때마다 그 수를 세고 그 수가 2개인 i들을 출력한다. 
 * a=b일시 오류이고
 * a<b 이면 b% i ==0이 나올때마다 그 수를 세고 그 수가 2개인 i들을 출력한다.
 */
		
		System.out.print("소수를 구할 범위가 될 정수를 두개 입력해주세요. : ");
		int cnt1, cnt2, i, a, b;
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		
		for(cnt1 = 0;a - b > 0; ) {
			for(i = 1;i <= a; i++) {
				if(a % i == 0) {
					cnt1++;
				}
			}
			if(cnt1 % 2 == 0) {
				System.out.println(i);
			}
		}
	}

}

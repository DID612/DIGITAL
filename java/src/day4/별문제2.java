package day4;

public class 별문제2 {

	public static void main(String[] args) {
	// 공백을 4번 써내고 별하나와엔터
	// 공백을 3번 써내고 별 두개와 엔터
	// 공백을 2번 써내고 별 두개와 엔터

		int i=1, j=5;
		for(;i<j;) {
			for(;j>i;j-=i) {
				System.out.print(" ");
			}
			System.out.println("*");
		}
		System.out.println();
	}
}

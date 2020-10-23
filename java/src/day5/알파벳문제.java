package day5;

public class 알파벳문제 {

	public static void main(String[] args) {
		/*
		 * a부터 z까지 반복문을 이용하여 출력하는 예제
		 * 유니코드+1 하면 다른문자가 되는 경우 이용~~
		 */

		for(char ch = 'A'; ch<= 'Z'; ch++) {
			System.out.println(ch);
		}
		
		/*
		 * A
		 * AB
		 * ABC
		 * ABCD
		 * ...
		 * ABCDEF...XYZ
		 */
		
		System.out.println((int)'A');
		for(char ch = 'A';ch<='Z';ch++) {
			for(char ch1= 'A';ch1<=ch;ch1++) {
				System.out.print(ch1+ch);
			}
			System.out.println();
		}//이것만 이해하면 먼가 댈듯				
	}

}

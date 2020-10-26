package day6;

import java.util.Arrays;
import java.util.Scanner;

public class 배열4 {

	public static void main(String[] args) {
		/* 짝수 10개를 배열에 저장하고 저장된 배열의 값을 출력하는 예제*/
		int size= 10;
		int[] arrEven = new int [size];
		int[] arrEven1, arrEven2, arrEven3, arrEven4;
		arrEven1 = new int [size];
		arrEven2 = new int [size];
		arrEven3 = new int [size];
		arrEven4 = new int [size];
		
		for(int i = 0; i<size; i++) {
			arrEven[i] = 2 * (i+1);
			System.out.println("arrEven["+ i+ "] 에 저장된 값은" + arrEven[i]);
		}
		
		System.arraycopy(arrEven, 2, arrEven1, 0, 7);
		arrEven2 = Arrays.copyOf(arrEven1, 7);
		
		arrEven3 = arrEven2.clone();
		
		System.out.println(arrEven1);
		System.out.println(arrEven2);
		System.out.println(arrEven3);
		
		/* 3명의 국어 점수를 입력받아 배열에 저장하고, 
		 * 3명의 국어 점수의 총점과 평균을 구하는 예제
		 */
		
		Scanner sc = new Scanner(System.in);
		int size1 = 3;
		int[] arrKor = new int[size1];
		double sum = 0, avr;

		System.out.println("3명의 점수를 입력해주세요!! : ");
		for(int i=0;i<size1;i++) {
			arrKor[i] = sc.nextInt();
			sum += arrKor[i];
		}
		avr = sum/size1;
		System.out.println("3명의 총점은: " + sum);
		System.out.println("3명의 점수의 평균은 : " + avr);
		//강사님은 걍 (double)sum으로 해결하심. sum/kor.length
		sc.close();
	}

}

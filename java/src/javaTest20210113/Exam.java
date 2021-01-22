package javaTest20210113;

import java.util.Scanner;

public class Exam {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 

		System.out.println("두 정수와 산연산자를 입력하세요.(예: 1+2)");
		int i = sc.nextInt();
		String cal = sc.next();
		int j = sc.nextInt();

		System.out.println(i+" "+cal+" "+j+" = "+calc(i,cal,j));
	}
	
	public static int calc(int i,, int j) {
		return i+j;
	}
	public static int calc(int i, '/', int j) {
		return i/j;
	}
	
	
	public static double calc(int i, String cal, int j) {
		switch(cal){
		    case "+" : 
		    	return i+j;
		    case "-" : 
		    	return i-j;
		    case "*" : 
		    	return i*j;
		    case "/" :
		    	if(j==0) {
		    		System.out.println("0으로 나눌 수 없습니다.");
		    		return (Double) null;
		    	}
		    	return i/(double)j;
		    case "%" :
		    	if(j==0) {
		    		System.out.println("0으로 나눌 수 없습니다.");
		    		break;
		    	}
		    	return i%(double)j;
		    default :
		        System.out.println("잘못된 산술 연산자 입력");
		        break;
		}
		return (Double) null;
	}
}

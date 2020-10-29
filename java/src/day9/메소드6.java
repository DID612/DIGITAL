package day9;

public class 메소드6 {
	public static void main(String[] args) {
		Calc cal = new Calc();
		
		cal.sum(2, 3);
		cal.mul(43,55);
	}
}

/*
 * 기능 : 두 정수와 산술연산자(+,-,*,/,%)가 주어졌을 때 산술 연산 결과를
 * 알려주는 메소드
 * 
 * 매개변수:두 정수
 * 리턴타입:정수 하나 or 더블
 * 메소드명:calc.... static
 */

class Calc{
	private int num1;
	private int num2;
//	private char cal;
//	private double res;
	
	public int getNum1() {
		return num1;
	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public int getNum2() {
		return num2;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}
	
//	public static void print() {
//		System.out.println();
//	}
	
	public static int sum(int num1,int num2) {
		return num1 + num2;
	}
	
	public static int sup(int num1, int num2) {
		return num1 - num2;
	}
	
	public static int mul(int num1, int num2) {
		return num1 * num2;
	}
	public static double div(int num1, int num2) {
		return num1 / num2;
	}
	public static int mod(int num1, int num2) {
		return num1 & num2;
	}
	
	public Calc(){
////		this.num1 = num1;
////		this.num2 = num2;
//		return num1 + num2;
	}
}

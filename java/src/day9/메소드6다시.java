package day9;

public class 메소드6다시 {
	public static void main(String args[]) {
		System.out.println(calc(1,'+',3));
		System.out.println(calc(1,'-',3));
		System.out.println(calc(1,'*',3));
		System.out.println(calc(1,'/',3));
		System.out.println(calc(1,'%',3));
		System.out.println();
		
		System.out.println(actulNumCalc(3.453,'+',1.102));
		System.out.println(actulNumCalc(3.453,'-',1.102));
		System.out.println(actulNumCalc(3.453,'*',1.102));
		System.out.println(actulNumCalc(3.453,'/',1.102));
		System.out.println(actulNumCalc(3.453,'%',1.102));
	}
	
	/*
	 * 기능 : 두 정수와 산술연산자(+,-,*,/,%)가 주어졌을 때 산술 연산 결과를
	 * 알려주는 메소드 
	 * 매개변수:두 정수, 산술 연산자 => int num1, char op, int num2
	 * 리턴타입:정수 하나 or 더블
	 * 메소드명:calc.... static
	 */
	
	public static double calc(int num1,char op, int num2) {
		switch(op) {
		case '+': return num1 + num2;
		case '-': return num1 - num2;
		case '*': return num1 * num2;
		case '/': return (double)num1 / num2;
		case '%': return num1 %
				num2;
		}
		return 0;
	}
	
	public static double actulNumCalc(double num1,char op, double num2) {
		switch(op) {
		case '+': return num1 + num2;
		case '-': return num1 - num2;
		case '*': return num1 * num2;
		case '/': return num1 / num2;
		case '%': return num1 %
				num2;
		}
		return 0;
	}
	
	/* 기능 : 두 실수와 산술연산자가 주어졌을 때 산술 연산 결과를
	 * 알려주는 메소두
	 * 매개변수: 두 실수와 산술연산자
	 * 리턴타입: 실수 -> 더블
	 * 메소드명:actulNumCalc
	 * 
	 */
}

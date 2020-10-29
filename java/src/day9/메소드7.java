package day9;

public class 메소드7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(factorial(5));
	}
	/*
	 * 재귀메소드: 메소드 A안에 메소드 A를 호출하는 메소드(드물게 사용) 
	 * 5! = 5*4*3*2*! = 5*4!
	 * 4! = 4*3*2*1* = 4*3!
	 * 0! = 1
	 * 	 */
	
	/*
	 * 기능 : 양수가 주어지면 주어진 양수의 팩토리얼 값을 알려주는 메소드
	 * 매개변수 :int num
	 * 리턴타입 :int
	 * 메소드명 : factorial
	 */
	
	public static int factorial(int num) {
		if(num<0) {
			return 0;
		}
		if(num==0 || num == 1) {
			return 1;
		}
		return num * factorial(num-1);
	}

	public static int fac(int num) {
		if(num<0) {
			return 0;
		}
		if(num==0 || num == 1) {
			return 1;
		}
		int res = 1;
		for(int i =2; i<=num; i++) {
			res = res*i;
		}
		return res;
	}
} //프로그램을 할때는 재귀호출을 사용하는 경우가 거의 없다. 호출을 계속하다보면 스택에 에러가 날 수 있어서.


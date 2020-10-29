package day9;

public class 메소드5 {
	public static void main(String[] args) {
		sum(1,2);
		//sysout은 대표적인 메소드 오버로딩의 예.
		System.out.println(1);
		System.out.println('1');
		System.out.println("1");
		
		/*
		 * c2는 새로운 객체를 생성하여 연결하고, c3는 c2와 연결된 객체를 공유한다.
		 * 그냥 c3 = c2를 하면 둘이 똑같은 걸 참조하는 코딩이 되지만
		 * new Card3()를 이용해 생성자를 만들면 똑같은 내용을 가진 다른 객체가 된다.
		 */
		
	}
	
	/*
	 * 메소드 오버로딩 : 동일한 이름을 가지는 메소드가 여러개인 경우
	 * 1. 매개변수의 갯수가 다른 경우
	 * 2. 매개변수의 형태(자료형)가 다른 경우
	 */
	public static int sum(int num1, int num2) {
		return num1+ num2;
	}
	public static double sum(double num1, double num2) {
		return num1+ num2;
	}
//	public static double sum(int num1, int num2) {
//		return num1+ num2;
//	} 입력 두개가 같기 때문에 출력 double은 상관없이 에러뜬다
	
	public static int sum(int num1, int num2, int num3) {
		return num1+ num2 + num3;
	}
}

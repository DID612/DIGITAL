package day12;

public class Wrapperㅋ늘래스 {

	public static void main(String[] args) {
		/*Wrapper 클래스는 기본 자료형을 클래스로 변환한 것
		 * 차이점: 
		 * - 래퍼 클래스는 null을 허용, 기본 자료형은 null을 허용하지 않음
		 * - 래퍼 클래스는 기능(메서드)을 제공
		 * */
		//int num1 = null; 기본 자료형은 null을 사용할 수 없음. 참조변수에서만...
		Integer num2 = null;
		num2 = Integer.parseInt("1234");
		System.out.println(num2);
		num2 = Integer.valueOf("5678");
		System.out.println(num2);
		num2 = Integer.valueOf("FF",16);
		System.out.println(num2);
		num2 = null;
		//오토박싱 언박싱. 참조변수일 경우 안되는게 보통인데 자동 변환됨 null 넣을 경우 안됨.
		int num3 = num2;//언박싱
		System.out.println(num3);
		num2 =23;//오토박싱
	}

}

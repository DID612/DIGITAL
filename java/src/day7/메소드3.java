package day7;

public class 메소드3 {

	public static void main(String[] args) {
		/* 기능: 구구단 한단을 출력하는 메소드
		 * 매개변수 : 두 가지 곱이지만 하나만 해도 갠춘 int num1
		 * 리턴타입 : 1*1 =1 을 표현하기 위한 문자열... 리턴타입 없게하거나...
		 * 메소드명 : printMulti
		 * num을 10보다 작은 수만 넣도록 제한? if 문 쓰면 댈듯
		 */
		System.out.println(printMulti(3));
		printMulti(5);
		
	}

	//리턴타입을 문자열로 쓸거였으면 리턴 문자열로 되게 해야 하는데 이대로 하면 i가 9일때 한줄만 나온다
	//반복문 중간에 return을 하면 한번밖에 안나오고
	//변수를 하나 더 만든 다음에 ?? 복잡하고 의미없을듯
	static String printMulti(int num1) {
		int num = num1;
		for(int i =1; i<=9; i++) {
			System.out.println(num + " * " + i + " = " + (num*i));
		}
		return "";
	}
	
	//배열을 매개변수로 전달하면
	//주소를 가져가기 때문에 원본이 바뀐다!!
	//단순 인스턴스 변수는 안바뀐다!!
	//일반변수가 매개변수냐 참조변수가 매개변수냐에 차이가 크다. 잘 알아두자
	//강사님
	static void printMultu1(int num) {
		for(int i=1; i<=9; i++) {
			System.out.println(num + " * " + i + " = " +(num*i));
		}
	}
	
}

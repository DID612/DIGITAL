package day9;

public class 초기화 {

	public static void main(String[] args) {
		int num;
		num = 10;
System.out.println(num);
	Test t = new Test();
	System.out.println(t.num1);
	System.out.println(t.num2);
	System.out.println(t.num3);
	System.out.println(t.num4);
	}
//변수의 값을 처음 저장하는게 초기화
	//지역변수는 자동으로 초기화 되지않음
}

class Test{
	//1. 명시적 초기화 : 멤버 변수가 선언된 위치에서 초기화 하는 방법
	int num1 = 10;
	int num2 = 10;
	int num3 = 10;
	int num4;
	{
		//3. 초기화 블럭: 초기화 블럭에서 멤버 변수를 초기화
		num3 = 30;
		num2 = 20;
	}
	
	public Test() {
	//2. 생성자를 이용하여 멤버 변수를 초기화
		num2=30;
	}
	
	
	//초기화 순서 기본값->명시적 초기화-> 클래스 초기화블럭->생성자-초기화 블럭
}
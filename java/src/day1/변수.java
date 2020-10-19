package day1;

public class 변수 {

	public static void main(String[] args) {
		/*
		 * 여러줄 주석
		 *  */
		//변수 선언 방법
		//변수타입 변수명;
		int a; // 주석은 코드에 영향을 미치지 않는다. // 한줄 주석
		char ch; //문자형 변수 ch를 선언
		int num1;
		long num2;
		float num3;
		double num4;
		boolean bool;
		int appleCount; //변수의 이름은 의미있게
		int applecount;
		// int ch; 빨간줄이 뜬다. 중복선언 불가.
		// 변수 선언 및 초기화 방법
		// 변수타입 변수명 = 값;
		// 문자는 한글자를 의미, 문자는 앞뒤로 ''를 붙인다.
		char cha1 = 'A';
		char cha2 = '1';
		char cha3 = '한';
		char cha4 = '\''; //따음표는 한개만 쓸 수가없음. 구별을 할 수 없기 때문에. \' 처럼 같이 써주면 문자로 인식할 수 있게 해줌.
		char cha5 = '_';
		
		int numb1 = 10; //십진수 10을 저장
		int numb2 = 010; //8진수 10을 저장 => 10진수 8
		int numb3 = 0x10; // 16진수 10을 저장 => 10진수 16
		//int numb4 = 123456789012; //숫자가 int 범위를 벗어남.
		
		//long numb5 = 123456789012; int로 123456789012를 인식하고 long 으로 넘기기 때문에 오류가 생김. L을 붙여서 Long 으로 만들자.
		long numb6 = 123456789012L; //접미사 L, 큰수를 다룰때 꼭 쓰자. 소문자도 되지만 1과 구분하기 위해 대문자 L로 많이 쓰임.
		
		//기본정수값은 int형으로 인식
		//큰 수의 경우 int형으로 표현할 수 없는경우 에러가 발생한다.
		
		//기본 실수값은 double 형으로 인식된다. 이 경우 float을 쓰면 8바이트를 4바이트로 넣는 경우가 되기 때문에 오류가 생김.
		//float형의 실수값은 접미사 f를 꼭 붙인다.
		float numb7 = 1.234F;
		
		double numb8 = 1.234456;
		
		boolean bool1 = true;
		boolean bool2 = false;
		
		//변수 선언후 초기화2
		//변수타입 변수명 = 변수명;
		//***왜 변수에 값을 주는걸 초기화라고 하는지.
		int kor1 = 100;
		int kor2 = kor1;
		
		//여러 변수를 한번에 선언하는 방법
		//단, 같은 변수 타입만 가능
		//정수형 변수 a는 10을, b는 20을, c는 30을 저장하도록 선언
		
		int a1=10, b=20, c=30;
		int e, d = 20;
	}

}

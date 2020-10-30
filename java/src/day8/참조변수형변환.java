package day8;

public class 참조변수형변환 {
	//p.356 참조변수 형변환 
	//인스턴스를 바꾸는게 아니라 참조변수를 변환하는것

	public static void main(String[] args) {
		C c2 = new C();
		P p2 = c2; //2 자식을 부모로 형변환 형변환 하고자 하는게 오른쪽. 자식 객체에 부모가 연결되니까 일케 말하는듯 ㅇㅇ
		System.out.println(p2.num1);
//자손타입 -> 조상타입 up-casting 형변환 생략 가능 (무조건 가능). 자식은 부모꺼보다 항상 많거나 같기 때문에
		
		//부모를 자식으로 형변환하는 경우 형변환을 생략할 수 없으며
		//조건부로 에러가 발생하지 않음.
		//1. 에러가 발생하지 않는 경우.
		//부모의 참조변수(p3)가 자식 객체(new C())랑 연결되어 있는 경우.
		//이 부모 객체를 다시 자식 객체로 형변환 가능하다.
		P p3 = new C();
		C c3 = (C)p3;
		System.out.println(c3.num2);
		
		//2. 에러가 발생하는 경우
		P p1 = new P();
		
		C c1 = (C)p1; //1 얘는 조건부. c1 = 을 num1 연결되게 만들어도 num2가 남아있기 때문에 문법적으로는 맞아도 실행을 못함
		//되게 하려면 부모를 만들때 자식클래스 생성자를 만들어야 함...
		System.out.println(c1.num1);
		int num1 = (int)10.0; //
		double num2 = 10; // 정수를 실수로 볁환
	}

}

class P{
	int num1;
}

class C extends P{
	int num2;
}

//다시 요약 자식을 부모로 형 변환하는 경우 무조건 가능하고 
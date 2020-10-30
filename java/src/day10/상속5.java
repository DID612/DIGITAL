package day10;

public class 상속5 {
	//p.323 단일 상속,,
	//import 순서 같은 클래스내에서 한번 찾고 다음은 다른 패키지에서 찾고 없으면 에러 띄움
	public static void main(String[] args) {
		/*만약 Child 클래스가 Parent1, Parent2 모두 상속이 가능하다면
		 * 아래처럼 print()라는 메소드를 실행했을 때 Parent1과 Parent2 중
		 * 누구의 메소드를 실행해야 할지 모르기 때문에 부모가 2개 이상이 될 수 없다.*/
//		Child c = new Child();
//		c.print();
	}

}

class Parent1{
	void print() {
		System.out.println("부모 1입니다.");
	}
}

class Parent2 {
	void print() {
		System.out.println("부모 2입니다.");
	}
}

class child extends Parent1/*, Parent2*/{
	
}
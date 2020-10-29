package day9;

public class 클래스5 {

	public static void main(String[] args) {
		/* final : 수정할 수 없다.
		 * final은 클래스, 변수, 멤버 메소드에 붙일 수 있따.
		 * 어디에 붙이냐에 따라 의미가 달라지는데
		 * final 변수 : 상수;
		 * final 멤버 메소드 : 메소드 오버라이딩을 할 수 없다.
		 * final 클래스 : 상속할 수 없다. => 부모클래스가 될 수 없다.
		 */
		

		//STUDENT_COUNT는 객체 멤버 변수이므로 클래스 멤버 메소드인 main에서
		//사용할 수 없다.
		final int STUDENT_COUNT = 10;
		System.out.println(STUDENT_COUNT);
		//STUDENT_COUNT = 20;
		
//		Card c1 = new Card();
//		final Card c2 = c1;
//		c2=null ERROR
	}

}

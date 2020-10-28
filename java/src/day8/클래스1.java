package day8;

public class 클래스1 {

	public static void main(String[] args) {
		/* 설계도 - 클래스
		 * 제품 - 객체
		 * 기능 - 메소드
		 * 
		 * 클래스
		 *  - 속성(정보) - 멤버변수
		 *  - 기능 - 메소드
		 *  
		 *  클래스 안에 메소드가 있다면
		 *  객체를 만드는 것까진 이해가는데
		 *  메소드를 또 해야하나?
		 *  
		 *  프린터
		 *  -크기, 제조사, 흑백칼라 //멤버변수
		 *  -인쇄, 복사, 스캔 //메소드
		 *  
		 *  멤버 변수의 위치는 메소드 밖, 클래스 안
		 *  멤버 변수의 특징: 멤버 변수는 클래스 안에서 모든 메소드에서 사용할 수 있다.
		 *  
		 *  -객체 선언
		 *   클래스명 객체명;
		 *   객체명 = new클래스명();
		 *   
		 *   멤버 메소드 사용 법
		 *   객체.메소드명();
		 *   
		 *   같은 클래스 안에 있는 메소드를 호출할 때(실행할 때)는 그냥 사용가능
		 *   다른 클래스 안에 있는 메소드를 호출할 때는 객체를 이용하여 사용가능
		 *   
		 *   접근제한자
		 *   public : 모두 사용 가능
		 *   protected : 나+ 같은 패키지+자식클래스만 사용 가능
		 *   default: 접근제한자가 안써있는 애들 보통~~ 나 + 패키지
		 *   private: 나만!
		 *   
		 *   public
		 *   -멤버 메소드와 멤버 변수에 붙일 때는 크게 문제 없다.
		 *   -클래스는 함부로 붙이지 못한다.
		 *   -클래스는 클래스명과 클래스가 있는 파일명이 같은 경우에 public을 붙일 수 있다.
		 *   
		 *   private으로 된 멤버 메소드와 변수는 다른 클래스에서 사용할 수 없다.
		 *   
		 *   - 일반적으로 멤버 변수는 private로 하고, 멤버 메소드는 public으로 한다.
		 *   - private으로 된 멤버 변수는 public으로 된 멤버 메소드를 통해 접근한다.
		 *   즉 getter와 setter을 만들어서 해당 멤버 변수의 값을 변경 가능하도록 한다.
		 *   
		 *   private 하나씩 늘때마다 getter setter 너무 귀찮지 않을까?
		 *   eclipse에서 지원한다!!
		 * */
		
		Point point = new Point();
		/* print라는 메소드는 Point 클래스의 메소드이고, 현재 이 코드가
		 * 실행되는 클래스는 클래스1이라는 클래스이어서 서로 다른 클래스이다.
		 * 그래서 객체를 이용하여 호출해야 한다.
		 */
		point.print();\
		point.move(5,5);
		point.print();
//		point.x = 10;
//		point.y = 20;
		point.print();
//		point.setX1(10); //point.x1 = 10;
//		point.setY1(20); //point.x2 = 20;
		point.print();
//		System.out.println(point.getX1());
//		System.out.println(point.getY1());
		/*
		 * Point point = null; // new 로 객체를 안만들었기 때문에 안되는 것, Point를 안만들고 print하기
		 * point.print();
		 */
	}
}

/*
 * 일반적으로 클래스는 가장 밖에 만든다.
 * 접근제한자 class 클래스명{
 *	접근제한자 자료형 변수명; 
 * }
 * 
 * point 클래스 : 2차원 좌표평면의 점을 나타내기 위한 클래스
 * - 속성 : x축좌표, y축좌표
 * - 기능 : x,y좌표 출력 기능, x,y 좌표 이동 기능.
 * */

class Point{
//	public int x, y;
	private int x1, y1;

	/*
	 * 기능 : x, y좌표 출력 메소드 // 단순 출력만 있는데 알다싶이 출력 void
	 * 매개변수 : 없음 - x, y 좌표는 point 클래스가 스스로 알고 있기 때문에
	 * 			다른 곳에서 알려줄 필요가 없다.
	 * 리턴타입 : 
	 * 메소드명 : print
	 */
	public void print() {
//		System.out.println("("+x+","+y+")");
		System.out.println("("+x1+","+y1+")");
	}
	
	/* 기능 : x1, y1 좌표로 이동하는 메소드
	 * 매개변수 : 이동할 좌표 => int x1, int y1;
	 * 리턴타입 :
	 * 메소드명 : move
	 */
	
	//이거 
	public void move(int x2, int y2) {
//		x = x2;
//		y = y2;
		x1 = x2;
		y1 = y2;
	}

	public int getX1() {
		return x1;
	}

	public void setX1(int x1) {
		this.x1 = x1;
	}

	public int getY1() {
		return y1;
	}

	public void setY1(int y1) {
		this.y1 = y1;
	}
	
//	public int getX1() {
//		return x1;
//	}
//	public int getY1() {
//		return y1;
//	}
//	public void setX1(int x) {
//		x1 = x;
//	}
//	public void setY1(int y) {
//		y1 = y;
//  toggle 에서 generate getter setter 고를 수 잇다
//	}
	
	
}
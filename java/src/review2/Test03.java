package review2;

import com.sun.rowset.internal.WebRowSetXmlReader;

public class Test03 {
	int x, y;
	public static void main(String[] args) {
		/* 접근제한자
		 * private : 나
		 * default : 나 + 같은 패키지
		 * protected : 나 + 같은 패키지 + 자식
		 * public : 모두
		 * 
		 * private : 멤버 변수, 해당 클래스 내부에서만
		 * 			사용하는 메소드.
		 * protected : 외부에서는 호출할 수 없으나 자식들은 호출할 수 있게 하는 경우
		 * public : 주로 멤버 메소드
		 *  - 클래스에 public은 보통 붙일 수 없는데
		 *  public을 붙이려면 클래스명과 클래스가 있는 파일명이 같은 경우 붙일 수 있다.
		 * */
		int num; // 지역변수
//		System.out.println(num);
		Point pt1 = new Point();
		pt1.movePoint(1, 1);
		movePoint(pt1, 1, 2); // 기억
	}
	/* 현재 좌표에서 새로운 좌표를 x, y로 이동시키는 메소드 static을 왜 썼을까. */
	public void movePoint(Point pt, int x, int y) {
		if(pt==null) { //pt가 안만들어졌다면!
			return;
		}
		pt.setX(x);
		pt.setY(y);
		//위나 아래.
		pt.movePoint(x, y);
 	}

}
class Point{
	private int x, y; // 지역변수는 자동으로 초기화가 안됨 -> 초기값이 있느냐 없느냐.

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public Point() {}
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
//		setX(x);
//		setY(y);
	}
	public Point(Point pt) {
		x = pt.x;
		y = pt.y;
	}
	/* 현재 좌표에서 새로운 좌표를 x, y로 이동시키는 메소드 */
	public void move(int x, int y) {
		this.x = x;
		this.y = y;
	}
	/* 오버로딩
	 * - 동일한 이름을 가진 메소드가 2개 이상인 경우
	 * - 매개변수의 갯수가 다른 경우
	 * - 매개변수의 타입이 다른 경우
	 * */
	/* 현재 좌표에서 새로운 좌표(point클래스의 객체) pt로 이동시키는 메소드*/
	public void move(Point pt) {
		x = pt.x;
		y = pt.y;
		move(pt.x, pt.y);
	}
	
	public void print() {
		// 왜 한글자씩인데 문자열로 표현할까
		System.out.println("("+x+","+y+")");
	}
}
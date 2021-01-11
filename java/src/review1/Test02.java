package review1;

public class Test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
class Point{
	//멤버변수, 함부로 접근할 수 없도록 private. 기능을 통해서만 변경될 수 있도록 저장. : 정보
	private int x, y;

	//멤버메소드 :기능
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
	
	//생성자 : 멤버변수를 초기화. 초기화된 정보를 토대로 기능 수행
	public Point(){} // 기본  생성자
	public Point(int x, int y){ // 생성자 오버로딩
		this.x = x; //this 멤버변수 인식.
		this.y = y;
	}
	//복사 생성자 <- 매개 변수에 생성자
	public Point(Point pt) {
		x = pt.x;
		y = pt.y;
	}
	
}
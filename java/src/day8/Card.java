package day8;

//에러가 나는 이유, 저장을 안해서. Card2를 붙여넣기 하고 Card로 했는데도 안되면 저장을 해라
//그래도 안되면 public 이런거 덧붙였다 뺏다 하든지.
//앞에께 저장이 안되서? 복사해온 클래스를 말한건가

public class Card{
	private int num;
	private char shape;
	
	/* 클래스의 구성
	 * - 멤버 변수 : 클래스의 속성/정보
	 * - 멤버 메소드 : 클래스의 기능
	 * - 생성자 : 클래스의 멤버 변수를 초기화
	 * 생성자의 이름은 클래스 명으로 고정
	 * 생성자 선언 방법
	 * 클래스에 생성자가 아무것도 없으면 자동으로 생성자가 입력이 됨
	 * 
	 * 얘는 생성자
	 * public 클래스명(){
	 * 외부에서 아무것도 안알려줄때 card()를 뭘로 할건지 딱.
	 * }
	 * 
	 *얘는 그냥 메소드
	 * public void 클래스명(){
	 * }
	 * 지금까지 써온 메인메소드 지역변수들은 자동초기화가 안됐지만 이제 쓰게 될 클래스들은 자동초기화가 지원됨
	 * 
	 * */
	
	//이 메소드 메인에 넣고 작동하는 걸 꼭 봐야지 뭔가 알겠음
	public void print() {
		System.out.print(shape);
		switch(num) {
		case 11:
			System.out.print("J");
			break;
		case 12:
			System.out.print("Q");
			break;
		case 13:
			System.out.print("K");
			break;
		default:
			System.out.print(num);
		}
	}


	public int getNum() {
		return num;
	}


	public void setNum(int num) {
		if(num <1 || num > 13) {
			this.num = 1;
		}
		else {
		this.num = num;
		}
	}


	public char getShape() {
		return shape;
	}


	public void setShape(char shape) {
		switch(shape) {
		case '♠': case '♥': case'♣': case'◆':
			this.shape = shape;
			break;
		default :
			this.shape = '♥';
			break;
		}
	}
	
	public Card() {
		setShape('♥');
		setNum(1);
	}
	
	
}



package day8;

public class 클래스2강사님 {

	public static void main(String[] args) {
//		Card2 c = new Card2();
//		//카드 모양과 숫자 설정
//		c.print();
//		c.setNum(16);
//		c.setShape('★');
//		//카드 모양과 숫자를 출력하는 코드
//		c.print();
		

		CardPack cp = new CardPack(); // CardPack 생성자 생성 이름은 cp. 걔로 이동
		cp.shuffle();
		Card2 tmp; //= cp.pick();
//		tmp.print();
//		tmp = cp.pick();
//		cp.pick().print();
//		cp.pick().print();
//		cp.pick().print();
//		cp.pick().print();
//		cp.pick().print();
		for(int i =1; i<=4; i++) {
			for(int j =1; j<=13; j++) {
				tmp = cp.pick();
				tmp.print();
			}
			System.out.println();
		}
	}

}
class Card2{
	private int num;
	private char shape;
	
	
	//이 메소드 메인에 넣고 작동하는 걸 꼭 봐야지 뭔가 알겠음
	public void print() {
		System.out.print(shape);
		switch(num) {
		case 11:
			System.out.print("J ");
			break;
		case 12:
			System.out.print("Q ");
			break;
		case 13:
			System.out.print("K ");
			break;
		default:
			System.out.print(num+" ");
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
	
	public Card2() {
		setShape('♥');
		setNum(1);
	}
}

/*
 * CardPack 클래스
 * - 카드팩 : 52장의 카드
 * - 카드 섞기 기능
 * - 카드 빼는 기능
 * - 카드 초기화 기능
 * 
 * 문제 52개의 배열을 만들면 솔직히 다른 문양을 가진 카드들을 한 배열에 넣는 방법을 모르겠다
 * 따라서 13*4 배열 + 문양명 을해서 완성시키기로 하고 
 * 
 * 카드 섞는 기능은 1에서 13까지 랜덤한 수를 두개 출력하고
 * 이 숫자 두개가 겹치지 않게 한 배열에 집어넣어서 배열간의 값을 교환해가면서
 * 교체한다. 한 메소드로 기능을 구현하고 싶기 때문에 메소드가 알아서 1배열을 13번
 * 2배열을 13번, 3배열을 13번 교체한다.
 * 
 * 
 * 
 * 그리고 1에서4까지 랜덤한 정수 하나씩 꺼내서
 * 
 **/

class CardPack{
	private Card2 [] pack = new Card2[52];
	private int cnt = 0; // 현재 남은 카드 갯수

	public void shuffle() {
		int min = 0;
		int max = pack.length-1;
		for(int i = 0; i<pack.length; i++) {
			int index = (int)((max-min+1)*Math.random()+min);
			Card2 tmp = pack[i];
			pack [i] = pack[index];
			pack[index] = tmp;
		}
	}
	
	//기본이 젤 위기 때문에 리턴 없다
	//리턴타입 꺼내간 게 카드이기 때문에 카드
	public Card2 pick(){
		if(cnt == 0) {
			return null;			
		}
		cnt--;
		return pack[cnt];
	}
	
	public void init() {
		//init 초기화
		cnt = 52;
		shuffle();
	}

	public int getCnt() {
		return cnt;
	}
	
	public CardPack() { // 이 부분 왜 앞이 대문자지? 생성자?
		char shape='♥';//초기화 안하면 오류 날수도 있으니까 우선
		//밑에 switch에 디폴트 값이 없는데 만약 안정해주면 초기화를 안했다고 에러가 남
		//우리는 shape가 1부터 4까지란걸 알지만 컴퓨터가모름...
		for(int i = 1; i <= 4; i++) {
			switch(i) {
			case 1: shape='♥'; break;
			case 2: shape='	'; break;
			case 3: shape='♣'; break;
			case 4: shape='◆'; break;
			}
			for(int j = 1; j<=13;j++) {
				//카드 1장 생성
				Card2 tmp = new Card2();
				tmp.setNum(j);
				tmp.setShape(shape);
				//카드 팩에 카드를 추가
				pack[cnt] = tmp;
				//카드팩에 들어있는 카드 갯수 증가
				cnt++;
			}
		}
	}
	
}


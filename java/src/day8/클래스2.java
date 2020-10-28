package day8;

public class 클래스2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int i;
//		char shape;
		
		Card1 card = new Card1();
		card.setCardNum(11);
		card.setShape('♠');
		
		card.cardMade();
	}

}

/*
 * Card 클래스 : 포커게임에서 사용하는 카드를 나타내는 클래스
 *  - 숫자 : 1~ 10, j q k
 *  - 문양 : 세잎, 하트, 클로버, 다이아
 *  - 기능 : 카드 정보 출력 기능
 */

class Card1{
	private int cardNum;
	private char shape;
	
	//카드를 만드는 메소드
	//카드 정보를 하나씩 나타내서 조합하자
	//그러면 숫자를 리턴하는 메소드
	//문양을 리턴하는 메소드
	//sysout(숫자+문양메소드)
	
	//하지만 주어진 문제를 보면 기능이 출력인데 그렇다면
	//void로 출력을 하고
	//숫자와 문양은 따로 변수로 만드는게 가장 잘 수행하는 것 같다.
	//i를 13까지 할수 있게 하고 i가 10이 넘어가면 j q k 모양 가지게
	
	//지금 이것도 되긴 하지만 이건 그냥 출력이다
	//넣었다가 출력을 하려면...
	public void cardMade() {
		if(cardNum>12) {
		System.out.println("카드는 " + shape + " k");
		}else if(cardNum>11){
		System.out.println("카드는 " + shape + " q");
		}else if(cardNum>10) {
		System.out.println("카드는 " + shape + " j");
		}else {
		System.out.println("카드는 " + shape + " "+ cardNum);
		}
	}

	public int getCardNum() {
		return cardNum;
	}

	public void setCardNum(int cardNum) {
		this.cardNum = cardNum;
	}

	public char getShape() {
		return shape;
	}

	public void setShape(char shape) {
		this.shape = shape;
	}
	
}
/*
 * CardPack 클래스
 * - 카드팩 : 52장의 카드
 * - 카드 섞기 기능
 * - 카드 빼는 기능
 * - 카드 초기화 기능
*/













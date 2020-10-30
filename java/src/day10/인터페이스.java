package day10;

public class 인터페이스 {

	public static void main(String[] args) {
		Tv t = new Tv();
		t.turnOn();
		//Power p = new Power(); 기능 구현이 안되서 객체 ㄴㄴ
		Power p = new Tv(); //구현 클래스를 이용해서 tv를 만든다음에 가져오면 이건 가능하다. 단,
		p.turnOn();
		//System.out.println(p.power); p 에는 power라는 변수가없기 때문에 사용할 수가 없다.
	}

}

/* 인터페이스 : 추상메소드와 클래스 상수로만 이루어진 것
 * 추상클래스 : 추상메소드 + 일반메소드 + 변수 + 상수로 이루어진 것
 * 인터페이스는 다중 상속 가능. 실행할 코드가 없기 때문에 어차피 이름이 같아도 오버라이딩 해야함 그래서 다중 상속가능함
 * 클래스는 알다싶이 같은 이름의 클래스나 메소드가 겹칠때 오버로딩이 아니라면 구현이 상당히 곤란하기 때문에 x
 * */
 
interface Power{
	public abstract void turnOn();
	public abstract void turnOff();
}

interface RemoteCon{
	void channelUp();
	void channelDown();
}

class Tv implements Power, RemoteCon{
//마우스 갖다대고 add unimplement method!! ↓
	boolean power;
	@Override
	public void turnOn() {
		power = true;
		System.out.println("전원이 켜졌습니다.");
		
	}

	@Override
	public void turnOff() {
		power = false;
		System.out.println("전원이 꺼졌습니다.");
	}

	@Override
	public void channelUp() {
		System.out.println("채널 업");
	}

	@Override
	public void channelDown() {
		System.out.println("채널 다운");
	}
	
}
package day9;

public class 클래스4{

	public static void main(String[] args) {
		/*
		 * static이 붙은 멤버 변수/메소드는 클래스 멤버/메소드가 된다.
		 * static이 안붙은 멤버 변수/메소드는 객체(인스턴스) 멤버 변수/메소드가 된다.
		 * 
		 * -객체 멤버 변수/메소드는 객체를 통해 사용된다. 객체가 있어야지만 사용되기 때문에
		 * -클래스 멤버변수/메소드는 클래스를 통해 사용된다.
		 * (객체를 통해서도 사용되지만 일반적이진 않다)
		 */

		//A.num1 = 10; public static int num1
		A a = new A();
		a.num1 = 10;
//		SamsungTv tv1 = new SamsungTv();
//		tv1.turnOn();
//		SamsungTv tv2 = new SamsungTv();
//		tv1.printPower();
//		tv2.printPower();
//		//SamsungTv 클래스를 통해 실행한다 => 클래스 변수
//		System.out.println(SamsungTv.brand );
//		System.out.println(tv1.brand);
//		System.out.println(tv2.brand);
//		System.out.println(SamsungTv.brand);
//		System.out.println(tv1.brand);
//		System.out.println(tv2.brand);
		/*다음 코드에서 객체 tv의 멤버 변수 power는 생성이 되었을가요. 아니요
		 * 다음 코드에서 객체 tv의 클래스 멤버 변수 brand는 생성이 되었을까요. 예.
		 */
		SamsungTv tv;
	//	tv.printPower(); 아직 new를 통해 객체가 만들어지지 않아서 객체 멤버 변수 out
	}

}

/*
 * 객체 멤버 변수는 클래스 멤버 메소드에서 사용할 수 없다.
 * 객체 멤버 변수는 객체 멤버 메소드에서만 사용할 수 있다.
 * 클래스 멤버 변수는 클래스/객체 멤버 메소드에서 사용할 수 있다.
 * 클래스 멤버 메소드는 클래스/객체 멤버 메소드에서 사용할 수 있다.
 * 객체 멤버 메소드는 객체 멤버 메소드에서만 사용할 수 있다.
 * 앞서 static을 붙였던 이유는 객체 메소드를 class 멤버 메소드에서 사용할 수 없었어서.
 * 
 * 객체 멤버 변수는 생성 시점이 객체가 생성될 때 변수가 생성된다.
 * 클래스 멤버 변수는 클래스가 메모리에 올라간 순간에 생성된다.
 */
/*다른 클래스에서 클래스 A의 객체 멤버 변수 num1에 10을 저장하려면
 * 클래스 A의 객체를 생성하고, 생성된 객체를 통해 num1에 값을 10으로 저장*/

class A{
	public int num1;
}

class SamsungTv{
	public final static String brand = "samsung"; //보통 브랜드명 삼성 같이 안바뀌는 값에 final 붙여줌
	private boolean power = false;
	//멤버변수의 값만 변경하는 경우 보통 리턴값이 필요없음.
	//같은 객체 안에서는 private도 무용지용이니까 다른 클래스에서 가져다 쓸때
	//무슨 변수를 받아들일건지 언제 멤버 변수를 바꾸는지 이런거 잘 알아두면 좋을듯

	public void turnOn() {
		power = true;
		System.out.println("TV가 켜져있습니다.");
	}
	public void turnOff() {
		power = false;
		System.out.println("TV가 꺼져있습니다.");
	}
	public void printPower() {
		if(power)
			turnOn();
		else
			turnOff();
		//sysout(brand); 가능
	}
	public static void printBrand(/*boolean power*/) {
		System.out.println("제조사 : "+brand);
//		System.out.println(power); 
//		클래스 멤버 변수로 이미 brand가 있는데 이를 또 만들 수는 없음. 쓸거면 가져와라
	}
}
class Card3{
	int num;
	int shape;
	static int width;
	static int height;
}
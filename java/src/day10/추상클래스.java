package day10;

public class 추상클래스 {

	public static void main(String[] args) {
		//추상메소드를 가지고 있는 Animal2는 추상 클래스를 이용하여 객체로 만들 수 없다. 
		//모든 동작이 작동할 수 있어야 하는데 추상메소드 때문에 안된다. 선언은 된다. Animal2
		Animal2 b = new Dog2();
		b.howl();
	}

}

abstract class Animal2{
	public String name;
	public String category;
	public void info() {
		System.out.println("-----------------");
		System.out.println("이름 : " + name);
		System.out.println("분류 : " + category);	
		System.out.println("-----------------");
	}
	public abstract void howl();
}

//추상 클래스를 상속받은 클래스가 추상 클래스가 아니면
//부모의 추상 메소드를 반드시 구현해야한다.(오버라이딩)
class Dog2 extends Animal2{
	
	@Override
	public void howl() {
		System.out.println("멍멍");
	}
	
}
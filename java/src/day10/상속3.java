package day10;

public class 상속3 {

	public static void main(String[] args) {
		/* 모든 클래스의 최고 조상은 Object
		 * 
		 */
		A1 a = new A1();
		System.out.println(a.hashCode());
		//객체를 출력하면, 객체의 toString() 메소드가 실행된다.

		System.out.println(a.toString()); // 오버라이딩을 해서 출력해본것.

		//toString 없기 때문에 부모에서 가져옴
		//기본적으로는 상속받지 않아도 오브젝트 클래스를 상속받고 있다고 받아들이기 때문에
		//문제 없이 이용할 수 있었음.
		//모든 클래스는 object 클래스가 제공하는 클래스를 사용할 수 있고,
		//오버라이딩 할 수 있다.
	}

}

class A1{
	int num;
	@Override
	public String toString() {
		return "A1 [num ="+ num + "]";
	}
}

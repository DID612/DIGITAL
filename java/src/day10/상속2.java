package day10;

public class 상속2 {
	
	/* 오버라이딩 : 부모클래스에게 물려받은 메소드를 재정의하는것
	 *  - 부모 클래스의 메소드와 일치해야 한다.
	 *  - 접근 제한자는 그 범위가 같거나 더 넓게 써야한다.
	 * */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tiger t1 = new Tiger();
		t1.info();
		t1.howl();
		dog d1 = new dog();
		d1.info();
		d1.howl();
		//t1.Animal("호롱이", "호랑이"); 메소드 가져오는 거지 생성자에까지 욕심 부리지 말자~
	}

}

class Animal{
	private String name;
	private String category;
	
	public Animal(String name, String category) {
		super();
		this.name = name;
		this.category = category;
	}

	public String getName() {
		return name;
	}


	public void info() {
		System.out.println("------------");
		System.out.println("이름 : "+name);
		System.out.println("분루 : "+category);
		System.out.println("------------");
	}
	
	public void howl() {
		System.out.println("울음소리");
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getCategory() {
		return category;
	}
	
	public void setCategory(String category) {
		this.category = category;
	}
	public Animal() {
		//이처럼 보통 기본 생정자를 만들어주는게 좋음.
	}
}

//보통 생성자가 public Dog() { } 이렇게 만들어지는 데 실제로는 super()가 있는 것. 부모클래스의 생성자. Animal(String name, String category)처럼 매개변수가 없기 때문에 에러가 나는것
class Tiger extends Animal{
	public Tiger() {
		/* super는 부모를 가르키는 참조 변수, super()는 부모 클래스의 생성자*/
		super("호랑이", "고양이과");
//		setCategory("고양이과");
//		setName("호랑이");
	}
	//오버라이딩인지 아닌지 다른 생성자 찾아봐서 하려면 너무 힘들다. 따라서
	@Override // 오버라이드. 부모 클래스에 있는 거 제정의 한다면서 부모클래스랑 이름 형태가 다르다면 에러가 뜸
	public void howl() {
		System.out.println("울음소리 : 어흥");
	}
}

class dog extends Animal{
	public dog() {
		super("개", "개과");
	}
	@Override
	public void howl(){
		
		System.out.println("울음소리 : 멍멍");
	}
}
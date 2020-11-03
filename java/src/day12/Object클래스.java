package day12;

public class Object클래스 {

	public static void main(String[] args) {
		/*object클래스에서 제공하는 메소드
		 * 1. equals()
		 * -기본적으로 주소를 비교하기 때문에 하나의 객체를 공유할 때만 같다라고 인식함
		 * 일반적으로 클래스가 같은지 비교를 하는 경우 equals를 오버라이딩 한다.
		 * 
		 * 2.hashCode()
		 * - 해쉬코드값을 이용하여 그룹화하여 검색이 쉽도록 하는 코드값
		 * 
		 * 3.toString()
		 * -system.out.println에 객체를 넣어주면 자동으로 객체. toString()이
		 * 호출되어 문자열이 출력됨
		 * -이 때 원하는 정보를 문자열로 보여주기 위해서는 오버라이드 toString()이 필요
		 * 
		 * 4.clone
		 * -객체를 복사하는 메소드
		 * -Clonable 인터페이스를 구현해야 예외가 발생하지 않는다.
		 * */
		Student std1 = new Student("홍길동", 20);
		Student std2 = new Student("홍길동", 20);
		System.out.println(std1.equals(std2));
		System.out.println(std1);
		//clone의 얕은 복사 깊은복사 살펴보기
		Student std3 = (Student) std1.clone();
		std3.age = 30;
		std3.name = "이순신";
		System.out.println(std1);
		System.out.println(std3);
		Class cObj = std3.getClass();
		System.out.println(cObj.getName());
		System.out.println(cObj.toGenericString());
		System.out.println(cObj.toString());
	}

}

class Student implements Cloneable{
	String name;
	int age;
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}
	@Override
	//멤버변수의 값이 같으면 결과가 같다. 해쉬코드로 그룹을 만들어서 탐색할때 편하게 함.. (해쉬정렬) 고급...
	public int hashCode() {
		final int prime = 31; //2의 n제곱과 가장 근사한 소수를 선택
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		//같은 객체를 공유하고 있는 공유... 같다라고 판별
		//얘 더하기 알파를 하고 싶을때 오버라이딩을 하는거임 단순히 의미를 바꾸는게 아니라.
		if (this == obj)
			return true;
		//equals가 동작했다는 것은 this 가 null이 아니라는 의미
		//비교할 대상이 null이면 비교할 필요가 없기 때문에 다르다고 판별
		if (obj == null)
			return false;
		//두 객체가 서로 다른 클래스의 객체이면 다르다고 판별
		if (getClass() != obj.getClass())
			return false;
		//obj는 student 클래스의 객체이다.
		//obj를 Student 클래스로 형변환 할 수 있다.(부모를 자식으로 변환하는 경우
		//명시적으로 형변환해야 한다. 부모인 obj를 student로 ~~
		Student other = (Student) obj;
		//나이가 다르면 다르다고 판별
		if (age != other.age)
			return false;
		//내 이름이 null이고 비교 대상 이름이 null이 아니면 다르다고 판별
		if (name == null) {
			if (other.name != null)
				return false;
		} 
		//내 이름이 있으면 대상 이름과 equals를 이용하여 비교하여
		//같으면 같고 다르면 다르다고 판별
		else if (!name.equals(other.name))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
	
	public Object clone() {
		Object obj =null;
		try {
			obj=super.clone();
		}catch(CloneNotSupportedException e) {
			return obj;
		}
	}
}
package day16;

public class GenericsEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Array<Integer> arr = new Array<Integer>(new Integer[10]);
		arr.set(0, 10);
		System.out.println(arr.get(0));
		Array<Character> arr2 = new Array<Character>(new Character[10]);
		arr2.set(0, 'A');
		System.out.println(arr.get(0));
	}
	//new 연산자를 사용할 수 없다. 제네릭스는. 실행하고 나서 판단하기 때문에 코드를 실행하기 전에는 자료형을 판단할 수가 없다. 
	//클래스의 멤버변수의 자료형이 다양하게 들어올 수 있을때 사용한다.
}

class Array<T>{
	T arr[];
	public Array(T[] arr) {
		this.arr = arr;
		//arr = new T[size];
	}
	public Array() {}
	public T get(int i) {
		if(arr.length > i)
			return arr[i];
		else
			return null;
	}
	public void set(int index, T value) {
		if(arr.length>index)
			arr[index] = value;
	}
}
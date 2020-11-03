package day12;

public class String메소드1 {

	public static void main(String[] args) {
		String str = "Green Computer";
		//인덱스 번지에 있는 문자를 반환
		System.out.println("----charAt----");
		System.out.println(str.charAt(0));
		//compareTo(str): str문자열과 비교하여 같으면 0, 앞이면 -1, 뒤면1
		//정렬하는 경우 쓰기 좋음.
		System.out.println("----compareTo----");
		System.out.println("b".compareTo("b"));
		System.out.println("b".compareTo("a"));
		System.out.println("b".compareTo("c"));
		//concat : 이어붙이기, + 연산자와 같은 기능
		System.out.println("----concat----");
		System.out.println("Hello ".concat("world"));
		System.out.println("Hello "+"world");
		//equals : 두 문자열 같은지 다른지를 확인
		System.out.println("----equals----");
		System.out.println("Hello".equals("Hello"));
		System.out.println("Hello".equals("hello"));
		System.out.println("----indexOf----");
		String str1 = "Hello world";
		char search1 = 'w';
		int index = -1;
		//int index = str1.indexOf(search1);
		//미리 이렇게 만들어놓고 계산하면 빠름
		if((index = str1.indexOf(search1))>=0) {
			System.out.println(str1+" 문자열에는 "+search1+"이 "+index+"위치에 있습니다.");
		}
		String search2 ="wolrd";
		index = str1.indexOf(search1,7);
		if((index >= 0)) {
			System.out.println(str1+" 문자열에는 "+search2+"이 "+index+"위치에 있습니다.");
		}else {
			System.out.println(str1+" 문자열에는 "+search2+"이 "+"7번째 이후로 찾을 수 없는 위치에 있습니다.");
		}
		System.out.println("----replace----");
		System.out.println("Hello World World".replace('W', 'w'));
		System.out.println("Hello world world".replace("world", "java"));
		
		System.out.println("----split----");
		String[] arr = "dog,cat,tiger".split(",");
		for(String tmp : arr) {
			System.out.println(tmp);
		}
		System.out.println("----join----");
		System.out.println(String.join(",", arr));
		String fileName = "String메소드.java";
		int index2 = fileName.lastIndexOf('.');
		String suffix = fileName.substring(index2+1);
		System.out.println(fileName+"의 확장자 : "+suffix);
		System.out.println("----trim-----------");
		System.out.println("      Hello      1".trim());
		System.out.println("----valueOf------");
		System.out.println(String.valueOf(1.23));
		String str3 = ""+123;
		int num1 = Integer.parseInt(str3);
		System.out.println(num1);
		int num2 = Integer.valueOf(str3);
		System.out.println(num2);
	}

}

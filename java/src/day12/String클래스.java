package day12;

public class String클래스 {
	public static void main(String[] args) {
		/* p.464 변경불가능한 클래스
		 * String 클래스는 +를 이용하여 문자열읠 이어 붙일 때 기존 문자열 객체에
		 * 이어 붙이는 게 아니라 기존 문자열에 새로운 문자열을 추가한 새로운 객체를 만들어서
		 * 돌려준다.
		 * 한번 주소가 정해지면 문자열은 주소가 안바뀜. 그래서 새로 만들어서 넣어줌.
		 * */
		
		//String 객체에 동일한 문자열을 저장하는 경우 공유를 함
		String a = "a";
		String b = "a";
		String c = a + b;
		System.out.println("a: "+a);
		System.out.println("b: "+b);
		System.out.println("c: "+c);
		System.out.println("a==b?"+(a == b));
		//String 객체에 동일한 문자열을 생성자를 통하는 경우 공유를 하지 않음
		//메모리가 모자랄 경우 stringbuffer?
		String a1 = new String("a");
		String b1 = new String("a");
		System.out.println("a1==b1?"+(a1 ==b1));
	}
}

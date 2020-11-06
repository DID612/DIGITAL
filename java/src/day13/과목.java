package day13;

public class 과목 {

	public static void main(String[] args) {
		/* 과목 클래스를 생성하세요. 단, 클래스는 새로 만들기를 이용하여 만드세요. ctrl n으로 클래스는 파일 따로 만들라는~~ 말.
		 *  -과목클래스의 필요한 멤버 변수/메소드를 생성하세요.
		 * */

		/* 변수 : string 과목배열
		 * 매개변수 : 필요 없다고 생각
		 * 리턴타입: String 배열..? void? 해보면 알거같음
		 * */
		int size = 50;
		String[] subject = new String[size];
		makeSub(subject,"한국사");
		System.out.println(subject);
		//printSub(makeSub());
		//String[] subject = new String[]{"한국사", "고대 문화 이해", "영화와 함께하는 기초과학", "통계학"};
	}
	
	public static String[] makeSub(String[] subject,String sub) {
		
		for(int i=0;i<subject.length;i++) {
			if(subject[i] == null) {
				subject[i] = sub;
			}
		}
		return subject;
	}
	
	public static void printSub(String[] subject) {
		for(int i=0;i<subject.length;i++) {
			if(subject[i] != null) {
				System.out.println(subject);
			}
		}
	}
}
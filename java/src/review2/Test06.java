package review2;

import java.util.ArrayList;
import java.util.Scanner;

public class Test06 {

	public static void main(String[] args) {
		/* 컬렉션 프레임워크 (인터페이스임 구현 클래스가 필요하다!)
		 * - List : 순서 보장, 중복 가능, 1가지 데이터 
		 *  데이터베이스에 있는 자료들을 가져올때 이미 데이터베이스를 통해 중복 제거된 자료들이라 
		 *  중복 가능이어도 크게 신경쓰지 않음
		 * - Set 웹에서는 거의 쓰이지 않는다. 순서 보장x, 중복 불가능, 1가지 데이터
		 * - Map : 2가지 데이터, 순서 보장x. 중복이 불가능한 경우 보통 순서 보장 안된다고 보면 된다. 
		 * 중복 데이터가 삭제될때 순서 매기기 까다로워서
		 *  key : 중복 불가능
		 *  value : 중복 가능 
		 * 
		 * 제네릭 클래스
		 * - 멤버 메소드나 변수의 타입이 고정이 아니라 밖에서
		 * 	 알려준 타입으로 지정되는 클래스
		 * */
		ArrayList<String> list = new ArrayList<String>();
		list.add("안녕하세요1");
		list.add("안녕하세요2");
		list.add("안녕하세요3");
		list.add("안녕하세요");
		list.remove(0);
		list.remove("안녕하세요"); //equals()를 이용하여 비교한 후 같다고 판단되면 삭제.
		for(String tmp : list){
			System.out.println(tmp);
		}
		/* 정수를 입력받아 입력받은 정수만큼 오늘의 할일을 입력하여
		 * 저장하고, 저장된 리스트를 출력해보세요.
		 * */
		ArrayList<String> listTodayW = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		int tmp;
		System.out.println("오늘 할일이 몇개나 되시나요!");
		tmp = sc.nextInt();
		System.out.println(tmp);
//		list.clear(); 강사님
//		while(list.size()<num){
//		System.out.println("할일 :");
//		String str = scan.next();
//		list.add(str);
//		}
		for(int i=0; i<tmp;i++) {
			listTodayW.add("오늘 할일 "+(i+1));
		}
		for(String printTmp : listTodayW){
			System.out.println(printTmp);
		}
		sc.close();
	}

}

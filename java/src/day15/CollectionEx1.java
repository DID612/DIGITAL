package day15;

import java.util.*;

public class CollectionEx1 {

	public static void main(String[] args) {
		/* 프레임웍 : 표준화된 방식 
		 * 컬렉션 프레임웍 : List, Set, Map
		 * 	- 데이터를 묶어서 관리할때 사용
		 *  - 주로 배열 대신 사용
		 * p.579
		 * List
		 * 	- 값 하나를 저장
		 * 	- 순서를 보장
		 *  - 중복을 허용
		 *  - 일반적으로 가장 많이 사용
		 *  Set
		 *  - 값 하나씩 저장
		 *  - 순서를 보장 x
		 *  - 중복 불가
		 *  Map
		 *  - 값을 두개 저장, key 값과 value의 값으로 저장.
		 *  - key값은 중복 불가, value의 값은 중복 허용.
		 *  - 중복된 key값을 저장하려하면 덮어쓰기 됨
		 *  - 예를 들면 아이디/비밀번호와 같은 상황에서 이용
		 *  
		 * List : 인터페이스(p.581)
		 * 	- Vector, ArrayList, LinkedList, Stack(자료 구조중에 하나) 등
		 * */
		
		/*컬렉션 프레임워크는 어떤 데이터를 관리할지 클래스로 지정을 해야한다.
		 * 클래스를 지정하지 않으면 Object가 자동으로 들어간다.*/

		//지정하지 않으면 오브젝트가 자동으로 들어가서 자식클래스로 속하는거면 모두 사용 가능
		/*list1과 list2는 저장할 클래스 종류를 선택하지 않았기 때문에
		 *Object가 자동으로 들어가고 따라서 모든 클래스의 객체를 저장할 수 있다.
		 *-list3은 String으로 저장할 클래스를 지정했기 때문에 정수를
		 *저장할 수 없다.
		 **/		
		
		//인터페이스를 통해서 객체를 만들수는 없지만 관리할 수는잇다.
		//List list = new List(); //불가능
		//밑에 애는 list가 ArrayList안에 상속??으로 구현돼 있기 때문에
		List list1 = new ArrayList();
		ArrayList list2 = new ArrayList();
		ArrayList<String> list3 = new ArrayList<String>();
		//꺽쇠 부분에는 클래스만 올수 있다. 래퍼클래스인 Integer를 쓰자
		ArrayList<Integer> list4 = new ArrayList<Integer>();
		list2.add(1);
		//갯수제한을 신경쓸 필요가 없다 list~
		for(int i=0; i<10;i++) {
			list4.add(i+1);
		}
		for(int i=0; i<10;i++) {
			list4.add(i+1);
		}
	
//		//0번지의 값을 삭제
//		list4.remove(0);
//		Integer integer = 10;
//		//10의 값과 일치하는 첫번째 요소를 삭제
// 		list4.remove(integer); // 그냥 10을 넣으면 10번지 값을 지운다...
		// 1 2 3 4 5 6 7 8 9 10 1 2 3 4 5 6 7 8 9 10
		// 0번지의 값을 삭제
		list4.remove(0);
		// 2 3 4 5 6 7 8 9 10 1 2 3 4 5 6 7
		Integer integer = 10;
		// 2 3 4 5 6 7 8 9 1 2 3 4 5 6 7
		list4.remove(integer);
		// 1 3 4 5 6 7 8 9 1 2 3 4 5 6 7
		list4.set(0,1);
		
		//comparator 인터페이스를 구현한 클래스의 객체를 넣어줘야함. 귀찮으면 익명 클래스를 이용.
		list4.sort(new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return o1 - o2; //오름차순
				// 내림차순 return o2 -o1;
			}
		});
		System.out.println();
		for(Integer tmp:list4) {
			System.out.print(tmp+" ");
		}
		System.out.println();
		for(int i=0;i<list4.size();i++) {
			if(i % 2 == 0) {
				//i 번지값 확인. set은 순서 보장 안해서 for문 사용 불가. iterator로 접근함.
				System.out.print(list4.get(i)+" ");
			}
		}
		System.out.println();
		/*이때 indexOf를 이용하여 같은 객체인지 아닌지 판단은
		 * equals()를 이용한다. 주소 비교의 등위를 판단하기 때문에 사용자가 정의한 클래스를
		 * 이용할때는 equals()를 반드시 오버라이딩 해야한다.*/
		System.out.println(list4.indexOf(999));
		/*Iterator를 이용한 List의 값 확인
		 *hasNext() : 현재 정보를 기준으로 다음 정보가 있는지 확인
		 *next() : 현재 정보를 기준으로 다음 정보를 가져옴
		 *list4.iterator() : 리스트에 있는 정보를 가져오는데 시작
		 *위치를 첫번째 요소 앞에 가르킨다.
		 *반복문 대신 iterator를 사용하는 이유는 List는 반복문과 
		 *iterator 모두 사용가능하지만 set은 iterator를 이용해서 사용해야 하기 때문 */
		 
		Iterator<Integer> it = list4.iterator();
		//hasNext()	다음이 있는지 없는지확인
		while(it.hasNext()) {
			Integer tmp = it.next();
			System.out.print(tmp+" ");
		}
		System.out.println();
	}

}
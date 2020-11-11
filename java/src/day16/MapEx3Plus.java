package day16;

import java.util.HashMap;
import java.util.Iterator;

public class MapEx3Plus {
	HashMap<String, Integer> map = new HashMap<String, Integer>();
	MapEx3 object = new MapEx3();
	
	public void menuPrint() {
		System.out.println("-----------");
		System.out.println("1. 학생 성적 추가");
		System.out.println("2. 학생 성적 조회(전체)");
		System.out.println("3. 학생 성적 조회(과목)");
		System.out.println("4. 학생 성적 수정");
		System.out.println("5. 프로그램 종료");
		System.out.println("-----------");
	}
	
	public void resultPrint(Object object) {
		System.out.println("***************");
		System.out.println(object);
		System.out.println("***************");
	}
	
	public void plusStudentSubject(String subjectName, int subjectScore) {
		if(map.get(subjectName) == null) {
			map.put(subjectName, subjectScore);
		}else {
		System.out.println(subjectName+"는 이미 추가한 과목");
		}
		if(subjectScore > 100 || subjectScore < 0) {
			System.out.println("잘못된 성적 입력(0~100)");
			return;
		}
		System.out.println(subjectName+ " : " + map.get(subjectName));	
	}

	public void inquirySubjectAll() {
		Iterator<String> it = map.keySet().iterator();
		if(it.hasNext() == false) {
			System.out.println("조회할 성적이 없습니다.");
		}
		while(it.hasNext()) {
			String key = it.next();
			System.out.println(key +" : " + map.get(key) );
		}
	}
	
	public void inquirySubject(String subjectName) {
		Iterator<String> it = map.keySet().iterator();
		if(it.hasNext() == false) {
			System.out.println("조회할 성적이 없습니다.");
		}
		System.out.println(subjectName +" : " + map.get(subjectName) );
	}
	
	public void modifyStudentSubject(String subjectName, int subjectScore) {
		Iterator<String> it = map.keySet().iterator();
		while(it.hasNext()) {
			String key = it.next();
			if(subjectName != key) {
			}
			System.out.println("기입하지 않은 과목입니다. 다시 확인해주세요.");
		}
		map.put(subjectName, subjectScore);	
	}
	
}

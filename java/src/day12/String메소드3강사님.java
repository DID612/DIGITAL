package day12;

import java.util.Scanner;

public class String메소드3강사님 {

	public static void main(String[] args) {
		String[] fileName = new String[] {"java의 정석.txt","String메소드.java","java의 정석 앞표지.png","java의 정석 뒷표지.jpg","java의 정석.hwp"};
		Scanner sc = new Scanner(System.in);
		String search;
		System.out.println("검색할 단어를 입력: ");
		search = sc.next();
		
		for(String tmp: fileName) {
			if(tmp.contains(search))
				System.out.println(tmp);
		}
		
		for(String tmp: fileName) {
			if(!(tmp.contains(search)))
				System.out.println("값을 찾을 수 없습니다.");
		}
		sc.close();
	}
}

package day16;

import java.util.HashMap;
import java.util.Scanner;

public class MapEx3 {

	public static void main(String[] args) {
		/* 한 학생의 성적을 관리하는 프로그램을 작성하세요.
		 * 메뉴
		 * 1. 학생 성적 추가
		 * 2. 학생 성적 조회(전체)
		 * 3. 학생 성적 조회(과목)
		 * 4. 학생 성적 수정
		 * 5. 프로그램 종료
		 * */
		MapEx3Plus mp = new MapEx3Plus();
		int menu = -1;
		Scanner sc = new Scanner(System.in);
		do {
			mp.menuPrint();
			System.out.print("메뉴를 선택해주세요 :");
			menu = sc.nextInt();
			switch(menu) {
			case 1: System.out.println("추가할 과목과 점수를 입력해주세요.");
					mp.resultPrint(mp.plusStudentSubject(sc.next(), sc.nextInt());
					break;
			case 2: System.out.println("전체 점수를 조회합니다.");
					mp.inquirySubjectAll();
					break;
			case 3: System.out.println("특정 과목 점수를 조회합니다.");
					mp.inquirySubject(sc.next());
					break;
			case 4: System.out.println("변경할 과목과 점수를 입력해주세요.");
					mp.modifyStudentSubject(sc.next(), sc.nextInt());
					break;
			case 5: System.out.println("프로그램을 종료합니다."); 
					break;
			default: System.out.println("잘못된 메뉴 입력!");
			}
		}while(menu!=5);
	sc.close();
	}

}

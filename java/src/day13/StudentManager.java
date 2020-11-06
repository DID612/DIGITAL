package day13;

import java.util.Scanner;

public class StudentManager implements Program {
	private Student[] std = new Student[10];
	private int studentCount;

	@Override
	//향상된 for문 사용하지 못한다. 학생은 10명인 상태지만 지금 입력된 정보가 없기 때문에 0명 출력하는데 전체 반복할 이유 없다.
	public void printStudent() {
		for(int i=0; i<studentCount; i++) {
			System.out.println("----학생 정보----");
			System.out.println(std[i]);
			System.out.println("---------------");
			System.out.println("----수강 정보----");
			std[i].print();
			System.out.println("---------------");
		}

	}

	@Override
	//Scanner 한번 닫으면 닫혀서 여러개 못씀. 오버라이드 한거라 인터페이스에서도 매개변수 추가 안해주면 스캐너 오류 뜨면서 못쓴다
	public void insertStudent(Scanner scan) {
		//입력이지 자료를 변경하는게 아님. 매개변수가 없기 때문에 1명의 학생정보를 입력받아 객체에 저장하고
		System.out.println("------------------");
		System.out.println("학생 정보를 입력하세요.");
		System.out.print("이름 : ");
		String name = scan.next();
		System.out.print("주민번호 : ");
		String rNum = scan.next();
		System.out.print("학번 : ");
		String sNum = scan.next();
		System.out.print("학부 : ");
		String faculty = scan.next();
		System.out.print("학과 : ");
		String major = scan.next();
		System.out.print("학기 : ");
		int term = scan.nextInt();
		System.out.println("------------------");
		Student s = new Student(name, rNum, sNum, faculty, major, term);
		//저장한 객체를 배열에 추가 
		if(std.length==studentCount) {
			
		}else {
			std[studentCount] = s;
			studentCount++;
		}
		//std에 studentCount이용해서 학생 정보를 한명한명 입력한다.

		//반복문을 이용해 std[0]부터std[9]까지 null값과 비교 확인후 기입
		
		//모든 학생이 정해졌다면 코드 사용을 중지하고 return;
	}

	@Override
	public void searchStudent(Scanner scan) {
		// 학생이름 String.scan을 입력받고... 이름은 겹칠수 있으니까 학번으로 하자!
		// 향상된 for문을 이용해 10개의 student 배열중에 String과 같은 값이 있는지 판단한다.
		// 찾았다면 studentCount 값을 기록한 후에 student 객체를 출력하고 리턴으로 정수 studentCount

		//검색할 이름을 입력
		
		//학생 배열에 해당 이름과 일치하는 학생 있는지 검색
	}

	@Override
	public void registerSubject(Scanner scan) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteSubject(Scanner scan) {
		// TODO Auto-generated method stub
	}
	
	public void printMenu() {
		System.out.println("-----메뉴-----");
		System.out.println("1.학생등록");
		System.out.println("2.학생확인");
		System.out.println("3.학생검색");
		System.out.println("4.수강신청");
		System.out.println("5.수강철회");
		System.out.println("6.종료");
		System.out.println("-------------");
		System.out.print("메뉴 선택: ");
	}
	public void printAlert() {
		System.out.println("----------------");
		System.out.println("잘못된 메뉴입니다.");
		System.out.println("----------------");
	}
	public void printExit() {
		System.out.println("----------------");
		System.out.println("프로그램 종료");
		System.out.println("----------------");
	}

}

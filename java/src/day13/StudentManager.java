package day13;

import java.util.Scanner;

public class StudentManager implements Program {
	private Student[] std = new Student[10];
	private int studentCount;

	@Override
	//향상된 for문 사용하지 못한다. 학생은 10명인 상태지만 지금 입력된 정보가 없기 때문에 0명 출력하는데 전체 반복할 이유 없다.
	public void printStudent() {
		for(int i=0; i<studentCount; i++) {
			printStudentOne(std[i]);
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
			//학생 배열이 꽉 차면 학생 배열을 늘려주는 작업
			Student [] tmp = new Student[studentCount+10];
			System.arraycopy(std, 0, tmp, 0, std.length);
			std = tmp;
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
		System.out.println("검색할 이름 입력 : ");
		String tmpName = scan.next();
		//학생 배열에 해당 이름과 일치하는 학생 있는지 검색
		for(int i = 0; i<studentCount;i++){ // 전체를 탐색하는게 아니라 studentcount만큼만 하기 때문에..?? 아아 .length만큼이 아니니까
			if(tmpName.equals(std[i].getName())) {
				System.out.println("----학생 정보----");
				System.out.println(std[i]);
				System.out.println("---------------");
				System.out.println("----수강 정보----");
				std[i].print();
				System.out.println("---------------");
			}
		}
	}

	//홍길동 학생이 대학수강을 신청했을 때 동작해야하는 메소드 
	@Override
	public void registerSubject(Scanner scan) {
		/*학생 정보(수강 신청한 학생:학번)을 입력
		 *수강 과목을 입력
		 *학생 정보에 수강 과목을 추가
		 */
		// 학생 정보를 입력
		System.out.println("학번을 입력: ");
		String sNum = scan.next();//String tmpSNum=scan.next();
		//학생 정보를 검색하여 학생이 있는지 확인
		int index= -1;
		for(int i=0; i<studentCount;i++) {
			if(std[i].getStudentNum().equals(sNum)) {
				index = i;
				break;
			}
		}
		if(index == -1) {
			System.out.println("존재하지 않는 학생입니다.");
			return;
		}
		//수강과목을 입력
		System.out.println("과목명: ");
		String sTitle = scan.next();
//		System.out.println("과목코드: ");
//		String sCode = scan.next();
//		System.out.println("교수명: ");
//		String pName = scan.next();
//		System.out.println("시수수: ");
//		int sTime = scan.nextInt();
//		System.out.println("학점: ");
//		int sPoint = scan.nextInt();
//		System.out.println("년도: ");
//		int sYear = scan.nextInt();
//		System.out.println("학기: ");
//		String sTerm = scan.next();
//		System.out.println("분류: ");
//		String sCategory = scan.next();
//		System.out.println("수업일: ");
//		String sSchedule = scan.next();
//		Subject subject = new Subject(sTitle, sCode, pName, sTime, sPoint, sYear, sTerm, sCategory, sSchedule);
		Subject subject = new Subject(sTitle);
		std[index].insertSubject(subject);
		//이 이후에 과목코드, 담당교수등과 같은 나머지 정보도
		//Scanner를 이용하여 입력받아야 하나 테스트할때 번거로움이 있어서
		//과목명만 입력받아 추가하도록 작업
		/*
		 * String[] tmpSubject = new String[]; tmpSubject[i]=scan.next();
		 * 
		 * for(int i=0; i<studentCount;i++){ if(tmpSNum.equals(std[i].getStudentNum()))
		 * { std[i].setSubjectList(tmpsubject); = tmpsubject; } } // 수강과목을 배열로 만들어야 하나.
		 * for(int i=0;)
		 */
		
			
	}

	@Override
	public void deleteSubject(Scanner scan) {
		// 학점 정보를 검색하여 학생이 있는지 확인
		System.out.println("과목명: ");
		String sNum = scan.next();
		
		int index = -1; //삭제할 과목이 있는 배열의 위치
		for(int i = 0; i<studentCount; i++) {
			if(std[i].getStudentNum().equals(sNum)) {
				index = i;
				break;
			}
		}
		if(index == -1) {
			System.out.println("존재하지 않은 학생입니다.");
			return;
	
		}
		//제외 과목을 입력
		System.out.println("과목명: ");
		String sTitle = scan.next();
		
		std[index].deleteSubject(sTitle);
		
		/*
		 * String dSubject = scan.next(); int index = -1; // subject.sTitle에 같은 과목명이 있다면
		 * 지우고 없다면 수강하고 있지 않은 과목입니다. for(int i = 0;i<studentCount;i++) {
		 * if(std[i].getSubjectList().toString().equals(dSubject)) {
		 * std[i].deleteSubject(dSubject); System.out.println(dSubject+" 과목이 삭제되었습니다.");
		 * index = 1; } } if(index == -1) { System.out.println("수강하고 있지 않은 과목입니다."); }
		 */
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
	private void printStudentOne(Student s) {
		System.out.println("----학생 정보----");
		System.out.println(s);
		System.out.println("---------------");
		System.out.println("----수강 정보----");
		s.print();
		System.out.println("---------------");
	}
}

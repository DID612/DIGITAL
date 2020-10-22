package day3;
	import java.util.Scanner;
	
public class 복습문제 {

	public static void main(String[] args) {
		/* 정보처리기사 과목에는 SW1(소프트웨어 설계), sw2(소프트웨어 개발)
		 * db(데이터베이스 구축), program(프로그래밍 언어 활용), 
		 * info(정보시스템 구축관리)로 구성되어 있다. 
		 * 1. 각 과목의 성적을 입력받고 입력받은 성적을 출력하는 코드를 작성하세요.
		 *  - 성적은 정수
		 * 2. 과목 중 한 과목이라도 40점 미만이 있으면 과락이라고 출력
		 * 3. 과목의 평균을 구하여서 평균이 60점 미만이면 탈락이라고 출력
		 */

		Scanner sc = new Scanner(System.in);
		
		int sw1, sw2, db, program, info, sum;
		double avr;
		
		System.out.println("각 과목의 성적을 입력하세요.");
		System.out.print("sw1 : ");
		sw1 = sc.nextInt(); 
		System.out.print("sw2 : ");
		sw2 = sc.nextInt(); 
		System.out.print("db : ");
		db = sc.nextInt(); 
		System.out.print("program : ");
		program = sc.nextInt(); 
		System.out.print("info : ");
		info = sc.nextInt();
		System.out.printf("sw1 %d점, sw2 %d점, db %d점, program %d점, info %d점%n", sw1, sw2, db, program, info);
		/* 내가 잘못했다. 별 차이 없을줄 알았는데 차이가 넘 크다. if 조건식에 다 때려박자
		 * if(sw1 < 40) { System.out.println("과락"); }else if(sw2 < 40) {
		 * System.out.println("과락"); }else if(db < 40) { System.out.println("과락"); }else
		 * if(program < 40) { System.out.println("과락"); }else if(info < 40) {
		 * System.out.println("과락"); }
		 */
		
		sum = sw1 + sw2 + db + program + info;
		avr = sum / 5.0;

		if(sw1 < 40 || sw2 < 40 || db < 40 || program < 40 || info < 40) {
			System.out.println("과락");
		}else if(avr < 60) {
			System.out.println("탈락");
		}else {
			System.out.println("합격");
		}
		
		sc.close();
		
		//System.out.println("안\n녕");
		System.out.printf("안 %n녕");

		/*
		 * System.out.
		 * printf("\n자유로운 방식으로 각 과목의 성적을 입력하세요. sw1, sw2, db, program, info 순", sw1);
		 * //System.out.
		 * printf("\n자유로운 방식으로 각 과목의 성적을 입력하세요. sw1, sw2, db, program, info 순"); coment
		 * = sc.nextLine(); sw1 = sc.nextInt(); sw2 = sc.nextInt(); db = sc.nextInt();
		 * program = sc.nextInt(); info = sc.nextInt();
		 * System.out.printf(" \n sw1 %d점, sw2 %d점, db %d점, program %d점, info %d점 \n \n"
		 * , sw1, sw2, db, program, info);
		 * 
		 *  실험~~
		 * sc.close();
		 */
	}

}

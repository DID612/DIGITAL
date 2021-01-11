package review3;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

public class BoardMain2 {
	private static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		/* 1. 게시글 등록
		 * 2. 게시글 조회
		 * 3. 게시글 수정
		 * 4. 게시글 삭제
		 * 5. 게시글 목록
		 * 6. 종료
		 * 번호 제목 작성자 작성일
		 * 게시글
		 *  - 번호, 제목, 내용, 작성자, 작성일
		 * */
		int menu;
		Board board = new Board(null, null, null);
		ArrayList<Board> list = new ArrayList<Board>();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        Calendar c1 = Calendar.getInstance();
        String strToday = sdf.format(c1.getTime());
		do {
			printMenu();
			menu = scan.nextInt();
			switch(menu) {
			case 1:
				System.out.println("게시글 등록");
				String tmpTitle = scan.next();
				String tmpContent = scan.next();
				String tmpWritter = scan.next();			
				Board tmpBoard = makeBoard(board, tmpTitle, tmpContent, tmpWritter);
				regBoard(list,tmpBoard);
				break;
			case 2:
				System.out.println("게시글 조회");
				searchBoard();
				break;
			case 3:
				System.out.println("게시글 수정");
				break;
			case 4:
				System.out.println("게시글 삭제");
			case 5:
				System.out.println("게시글 목록");
				break;
			case 6:
				System.out.println("종료");
				break;
			default:
				System.out.println("잘못된 메뉴");
			}
		}while(menu != 5);
		System.out.println("프로그램을 종료합니다.");
		scan.close();
	}
	private static void printMenu() {
		System.out.println("-----------------");
		System.out.println("1. 게시글 등록");
		System.out.println("2. 게시글 조회");
		System.out.println("3. 게시글 수정");
		System.out.println("4. 게시글 삭제");
		System.out.println("5. 게시글 목록");
		System.out.println("6. 종료");
		System.out.println("-----------------");
		System.out.println("메뉴 선택(1~6) : ");
	}
	
	private static Board makeBoard(Board b, String title, String content, String writter) {
		b.setTitle(title);
		b.setContent(content);
		b.setWritter(writter);
		return b;
	}
	private static void regBoard(ArrayList<Board> list, Board b) {
		list.add(b);
	}
	
	private static Board searchBoard(ArrayList<Board> list, String str){
		for(Object obj : list) {
			System.out.println(obj);
			if(obj.equals(str)) {
				System.out.println(obj);
				return (Board)obj;
			}
		}
	}	

	private static void modBoard(Board b,String title, String content, String Writter){
		b.setTitle(title);
		b.setContent(content);
		b.setWritter(Writter);
	}
	private static void delBoard(ArrayList<Board> list, String str){
		for(int i=0;i<list.size();i++) {
			if(list.equals(str)) {
				list.remove(i);
			}
		}
	}
	private static void seeBoard(ArrayList<Board> list){
		for(Object obj : list) {
			System.out.println(obj);
		}
	}
}


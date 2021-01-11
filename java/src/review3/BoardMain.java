package review3;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

public class BoardMain {
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
		Board tmpBoard = new Board(null, null, null, null);
		ArrayList<Board> list = new ArrayList<Board>();
		do {
			printMenu();
			menu = scan.nextInt();
			switch(menu) {
			case 1:
				System.out.println("게시글 등록");
				System.out.println("게시글 제목을 입력해주세요.");
				String tmpTitle = scan.next();
				System.out.println("게시글 내용을 입력해주세요.");
				String tmpContent = scan.next();
				System.out.println("작성자는 누구십니까.");
				String tmpWritter = scan.next();
				tmpBoard.setTitle(tmpTitle);
				tmpBoard.setContent(tmpContent);
				tmpBoard.setWritter(tmpWritter);
				tmpBoard.setwTime(strToday);
				regBoard(list,tmpBoard);
				break;
			case 2:
				System.out.println("게시글 조회");
				seeBoard(list);
				break;
			case 3:
				System.out.println("게시글 수정");
				System.out.println("수정할 게시글이 어떤 것인가요?");
				System.out.println("모르신다면 제목이나 내용, 작성자를 알려주세요!");
				String tmpSearch = scan.next();
				for(int i= 0;i<list.size();i++) {
					if(tmpSearch.equals(list.get(i).getContent())) {
						seeBoard(list);
					}
				}
				break;
			case 4:
				System.out.println("게시글 삭제");
			case 5:
				//단어장 정렬
//				sortWord(list);
				//단어장에 있는 모든 단어를 출력
//				printWord(list);
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
	
	/* 필요한 메소드
	 *  게시글 등록 regBoard
	 *  게시글 조회 seeBoard
	 *  게시글 수정 modBoard
	 *  게시글 삭제 delBoard
	 *  게시글 목록 listBoard
	 * */
	
	/* 메소드명 regBoard()
	 * 기능 : list에 board 생성자 추가
	 * 매개변수: 매개변수 번호 제목 작성자 작성일을 가진 Board 생성자
	 * 리턴타입: void
	 * */
	private static void regBoard(ArrayList<Board> list, Object b) {
		list.add((Board) b);
	}
	/* 메소드명 seeBoard()
	 * 기능 : list에 있는 Board 처음부터 끝까지 print
	 * 매개변수: 매개변수 번호 제목 작성자 작성일을 가진 Board 생성자
	 * 리턴타입: void
	 * */
	private static void seeBoard(ArrayList<Board> list) {
		if(list.size()>0) {
			for(Object obj : list) {
				System.out.println(obj);
			}
		}
		System.out.println("게시글이 존재하지 않습니다.");
	}
	/* 주어진 string과 동일한 제목, 내용, 작성자를 가진 게시글을 서치
	 * searchBoard()
	 * void? String?
	 * */
	private static void searchBoard(){
		for()
	}
	/* 메소드명 modBoard()
	 * 기능 : list에 있는 Board 생성자 안의 멤버변수들 수정
	 * 매개변수 : 
	 * */
	private static void modBoard(){
		
	}
}

class Board implements Comparable{
	static int count = 0;
	private int bNum;
	private String title, content, writter, wTime;
	SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
    Calendar c1 = Calendar.getInstance();
    private String strToday = sdf.format(c1.getTime());
	//strToday getter setter
	public String getStrToday() {
		return strToday;
	}
	public void setStrToday(String strToday) {
		this.strToday = strToday;
	}
	//getter setter
	public int getbNum() {
		return bNum;
	}
	public void setbNum(int bNum) {
		this.bNum = bNum;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getWritter() {
		return writter;
	}
	public void setWritter(String writer) {
		this.writter = writer;
	}
	public String getwTime() {
		return wTime;
	}
	public void setwTime(String wTime) {
		this.wTime = wTime;
	}
	//toString
	@Override
	public String toString() {
		return "Board [게시글 번호=" + bNum + ", 게시글 제목=" + title + ", 게시글 내용=" + content + ", 작성자=" + writter + ", 작성일="
				+ wTime + "]";
	}
	//compareTo
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}
	//hashcode and equals
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((content == null) ? 0 : content.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		result = prime * result + ((writter == null) ? 0 : writter.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		if(obj instanceof String) {
			if(obj.equals(content)||obj.equals(title)||obj.equals(writter)) {
				return true;
			}
		}
		Board other = (Board) obj;
		if (content == null) {
			if (other.content != null)
				return false;
		} else if (!content.equals(other.content))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		if (writter == null) {
			if (other.writter != null)
				return false;
		} else if (!writter.equals(other.writter))
			return false;
		return true;
	}
	public Board(){}
	
	public Board(String title, String content, String writter) {
		count ++;
		this.bNum = count;
		this.title = title;
		this.content = content;
		this.writter = writter;
		this.wTime = strToday;
	}
	
}
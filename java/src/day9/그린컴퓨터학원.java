package day9;

public class 그린컴퓨터학원 {

	public static void main(String[] args) {

	}

}

/*
 * 클래스의 객체 한명은 사람이다.
 * 변수 : 지점명
 * 		 이름
 * 		 전화번호
 * 
 * 반 관리
 * 방이름
 * 강사
 * 수강명
 * 
 */

class Human{
	private String[] name = new String[] {"홍길동", "강감찬", "철수", "영희", "잠만보", "오징어땅콩"};
	String[] branch = new String[] {"청주점", "서울점"};
	private String[] phoneNum = new String[] {"01033334444", "01032525123", "01029758892","0412334626", "01088567979", "01058726534" };
	
	public String[] getName() {
		return name;
	}

	public void setName(String[] name) {
		this.name = name;
	}

	public String[] getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String[] phoneNum) {
		this.phoneNum = phoneNum;
	}

	public Human() {
		int i =1;
		getName();
		getPhoneNum();
		if(i<=4) { 
			System.out.println(branch[0]);
			i+=1;
		}else if(i<=7) {
			System.out.println(branch[1]);
			i+=1;
		}
	
	}
}

class ClassRoom{
	private String[] roomName = new String[] {"자바","C","컴퓨터활용능력"};
	private String[] teacher = new String[] {"제갈량", "방통", "사마의"}; 
	
	
	public String[] getRoomName() {
		return roomName;
	}
	
	public void setRoomName(String[] roomName) {
		this.roomName = roomName;
	}

	public String[] getTeacher() {
		return teacher;
	}

	public void setTeacher(String[] teacher) {
		this.teacher = teacher;
	}

	static void makeClass() {
		Human human = new Human();
		for(int i=0;i<7;i++) {
			
		}
	}
	
	public ClassRoom() {
		getRoomName();
		getTeacher();
	}
}
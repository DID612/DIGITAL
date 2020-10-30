package day9;

public class Green {
	public static void main (String[] args) {
		Human h = new Human();
	}
}

 /*학생 : 이름
  * 	 전화번호
  * 	 수강명 // 변수
  * 
  * 메소드 학생증 생성..
  * 
  * 학생부 : 수강명
  * 	  
  * 메소드 반 만들기
  * 메소드 학생 옮기기 
  * 	  
  */

class Human{
	private String name;
	private String phoneNum;
	String subject;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	
	Human(){
	}
}

class Subject{
	String[] subject = new String[] {"자바반", "C반", "정보처리반"};
	
	public void makeRoom(){
		for(int i=0;i<=subject.length;i++) {
			
		}
	}
}
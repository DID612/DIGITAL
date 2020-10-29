package day9;

import day8.Card2;

public class 그린컴퓨터아트학원 {

	public static void main(String[] args) {
		//그린 컴퓨터 아트 학원 수강생(전 지점)을 관리하기 위한
		//클래스를 만들어보세요.
		//매개변수 번호와 스트링으로 하자
		//기능 학생수 전체가 50명이라면 일단 수업반이 5개 있다
		//이 반에서 한명을 뽑아서 원하는 수업에 넣어주기. 빼기.
		//학생 전체수의 추가..?? 난중에 
		//리턴타입 String, String[]
		//함수명 GreenComputerStudent

		/*
		 * 클래스의 객체 한명은 사람이다.
		 * 변수 : 지점명
		 * 		 이름
		 * 		 전화번호
		 * 		 수강명
		 * 
		 * 
		 * 
		 */
	}
}

class GreenComputerStudent {
	private int studentNumber;
	private String[] name = {"홍길동","강감찬","근육맨","오징어","자바","커피라떼","유승준"};
	
	public int getStudentNumber() {
		return studentNumber;
	}

	public void setStudentNumber(int studentNumber) {
		this.studentNumber = studentNumber;
	}

	public String[] getName() {
		return name;
	}

	public void setName(String[] name) {
		this.name = name;
	}

	public GreenComputerStudent(/*String[] name*/) {
		setName(); //name = {"홍길동","강감찬","근육맨","오징어","자바","커피라떼","유승준"};
		setStudentNumber(1);
	}
	
	public static String pick() {
		
	}
}

class ClassMember{
	private ClassMember [] member = new ClassMember[7];
	
	public ClassMember() {
		for(int i=1;i<member.length;i++) {
			for(int j=1;i<member.length;j++) {
				
			}
		}
	}
}

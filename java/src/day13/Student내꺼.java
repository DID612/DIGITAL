package day13;

public class Student내꺼{
	private String studentName;
	private String studentMajor;
	private String studentNumber;
	private int studentYear;
	private String studentPhoneNumber;
	private String studentEmailAdress;
	private String studentProffesor;
	Subject[] studentArr;

	
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentMajor() {
		return studentMajor;
	}
	public void setStudentMajor(String studentMajor) {
		this.studentMajor = studentMajor;
	}
	public String getStudentNumber() {
		return studentNumber;
	}
	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}
	public int getStudentYear() {
		return studentYear;
	}
	public void setStudentYear(int studentYear) {
		this.studentYear = studentYear;
	}
	public String getStudentPhoneNumber() {
		return studentPhoneNumber;
	}
	public void setStudentPhoneNumber(String studentPhoneNumber) {
		this.studentPhoneNumber = studentPhoneNumber;
	}
	public String getStudentEmailAdress() {
		return studentEmailAdress;
	}
	public void setStudentEmailAdress(String studentEmailAdress) {
		this.studentEmailAdress = studentEmailAdress;
	}
	public String getStudentProffesor() {
		return studentProffesor;
	}
	public void setStudentProffesor(String studentProffesor) {
		this.studentProffesor = studentProffesor;
	}
	@Override
	public String toString() {
		return "Student [이름=" + studentName + ", 학과=" + studentMajor + ", 학번="
				+ studentNumber + ", 학년=" + studentYear + ", 전화번호=" + studentPhoneNumber
				+ ", 이메일주소=" + studentEmailAdress + ", 담당교수=" + studentProffesor + ", 과목정보="+studentArr+"]";
	}
	//과목명, 과목코드, 교수명, 시수, 학점, 년도, 학기, 분류, 수업시간
	
	public Student내꺼(String studentName, String studentMajor, String studentNumber, int studentYear,
			String studentPhoneNumber, String studentEmailAdress, String studentProffesor) {
		super();
		this.studentName = studentName;
		this.studentMajor = studentMajor;
		this.studentNumber = studentNumber;
		this.studentYear = studentYear;
		this.studentPhoneNumber = studentPhoneNumber;
		this.studentEmailAdress = studentEmailAdress;
		this.studentProffesor = studentProffesor;
	}
	//학생의 수와 과목을 가지고 있다.
}

/* 학생 클래스를 생성하세요. 단, 클래스는 새로 만들기를 이용하여 만드세요. ctrl n으로 클래스는 파일 따로 만들라는~~ 말.
 *  -학생클래스의 필요한 멤버 변수/메소드를 생성하세요.
 *  -과목!클래스 
 *  -멤버변수 학생이름, 주민번호, 학번, 전공, 세부전공
 *  -멤버메소드 getter setter to string
 *  생성자
 * */


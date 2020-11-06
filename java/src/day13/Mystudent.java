package day13;

/**
 * @author Administrator
 *
 */
public class Mystudent {
	/* 학생 클래스를 생성하세요. 단, 클래스는 새로 만들기를 이용하여 만드세요. ctrl n으로 클래스는 파일 따로 만들라는~~ 말.
	 *  -학생클래스의 필요한 멤버 변수/메소드를 생성하세요.
	 *  -학생클래스 : 학생 1명의 정보를 나타내는 클래스
	 *  -멤버변수 :학생이름, 주민번호, 학번, 학부, 학과,수강과목들,학기(현재 학생이 수료한 학기)
	 *  -멤버메소드 : getter/setter, print(), 
	 *  수강과목추가,
	 *  수강과목삭제
	 *  수강 과목 복사(private) : 수강 과목 추가시 배열이 다 차있으면 배열의 크기를 늘림
	 *  -equals():오버라이딩
	 *  생성자
	 * */
	
	private String name;
	private String residentNum;
	private String studentNum;
	private String faculty;
	private String major;
	private Subject[] subjectList;
	private int term;
	private int subjectCount;
	
	//subject를 추가. 
	public void insertSubject(Subject subject) {
		if(subjectCount == subjectList.length) {	
		}
		subjectList[subjectCount] = subject;
	}
	
	public void deleteSubject(String subjectTitle) {
		int index = -1;
		if(subjectList[index+1])
	}
	
	public void print

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getResidentNum() {
		return residentNum;
	}
	public void setResidentNum(String residentNum) {
		this.residentNum = residentNum;
	}
	public String getStudentNum() {
		return studentNum;
	}
	public void setStudentNum(String studentNum) {
		this.studentNum = studentNum;
	}
	public String getFaculty() {
		return faculty;
	}
	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public int getTerm() {
		return term;
	}
	public void setTerm(int term) {
		this.term = term;
	}
	public int getSubjectCount() {
		return subjectCount;
	}
	public void setSubjectCount(int subjectCount) {
		this.subjectCount = subjectCount;
	}
	
	
}

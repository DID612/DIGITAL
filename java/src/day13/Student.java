package day13;

import java.util.Arrays;

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

public class Student {
	private String name;
	private String residentNum;
	private String studentNum;
	private String faculty;
	private String major;
	private Subject[] subjectList;
	private int term;
	private int subjectCount; //getter
	
	//얘는 static 붙으면 안댐, 멤버변수의 값을 설정할때는 거의 void다. 배열의 값을 변경하고 있으니까 향상된 포문 안된다. 값 변경
	
	public void insertSubject(Subject subject) {
		//현재 수강한 과목의 개수를 모를때
		/*for(int i = 0; i<subjectList.length;i++) {
			if(subjectList[i] == null) {
				subjectList[i] = subject;
				break;
			}
		}*/
		//배열이 꽉찬 경우
		if(subjectCount == subjectList.length) {
			Subject [] tmp = new Subject[subjectCount+10];
			System.arraycopy(subjectList, 0, tmp, 0, subjectList.length);
			subjectList = tmp;
		}else {
			subjectList[subjectCount] = subject;
			subjectCount++;
		}
	}
	
	public void deleteSubject(String subjectTitle) {
		int index = -1; //삭제할 과목이 있는 배열의 위치
		if(subjectTitle==null) {
			return; //void 잇는데 걍 return 괜찬흐?
		}
		for(int i = 0; i<subjectCount; i++) {
			if(subjectTitle.equals(subjectList[i].getSubjectTitle())) {
				index = i;
				break;
			}
		}
		if(index == -1)
			return;
		for(int i=index; i<subjectCount-2;i++) {
			subjectList[i] = subjectList[i+1];
		}
		subjectList[subjectCount-1] = null;
		subjectCount--;
	}

	public void print()	{
		if(subjectCount==0)
			System.out.println("---수강한 과목이 없습니다. ---");
		for(int i =0;i<subjectCount;i++) {
			System.out.println(subjectList[i]);
		}
	}
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
	public Subject[] getSubjectList() {
		return subjectList;
	}
	public void setSubjectList(Subject[] subjectList) {
		this.subjectList = subjectList;
	}
	public int getTerm() {
		return term;
	}
	public void setTerm(int term) {
		this.term = term;
	}
	
	
	
	@Override
	public String toString() {
		return "이름 [name=" + name + "\n 주민번호=" + residentNum + "\n 학번=" + studentNum + "\n 학부="
				+ faculty + "\n 전공=" + major + "\n 학기=" + term
				+ "\n 수강과목수=" + subjectCount + "]";
	}

	//subject리스트는 하나하나 추가해야 하기 때문에 생성자 매개변수 따로 안만듬
	public Student(String name, String residentNum, String studentNum, String faculty, String major, int term) {
		super();
		this.name = name;
		this.residentNum = residentNum;
		this.studentNum = studentNum;
		this.faculty = faculty;
		this.major = major;
		this.term = term;
		subjectList = new Subject[2];
	}
	
	 //  수강과목추가
	 // subjectList에subjectTitle 추가
	// Subject[0] = subjectTitle
//	public void addSubject(Subject[] subjectList) {
//		for(int i =0 ; i<subjectList.length;i++) {
//			if(subjectList[i] == null) {
//				subjectList[i] = getSubjectList();
//			}
//		}
//	}
	
	
	 // 수강과목삭제
	 //  수강 과목 복사(private) : 수강 과목 추가시 배열이 다 차있으면 배열의 크기를 늘림
}

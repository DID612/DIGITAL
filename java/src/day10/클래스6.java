package day10;

public class 클래스6 {
	public static void main(String[] args) {
		GreenComputerStudent []std = new GreenComputerStudent[10];
		std[0] = new GreenComputerStudent("홍길동", "2002-05-01", 19, "010-1234-5678", "청주");
		std[0].printInfo();
		std[0].printCompany();
		std[0].printCourse();
		std[0].insertCourse("디지털컨버전스 JAVA 양성과정", "2020.10.19-2021.04.01");
		std[1] = new GreenComputerStudent("임꺽정", "의정부"); //course 가 처음에 null인데 그것때문에 에러뜸 배열 만들어줘야함 생성자에.
		std[2] = new GreenComputerStudent("유관순", "청주");
		std[3] = new GreenComputerStudent("이순신", "의정부");
		//학생들 중에 이순신 학생이 있는지 검색
		String searchName = "이순신";
		for(GreenComputerStudent tmp : std) {
			if(tmp != null && tmp.getName().equals(searchName)) {
				System.out.println("--------------");
				tmp.printInfo();
				System.out.println("--------------");
			}
		}
		String searchBranch = "청주";
		for(GreenComputerStudent tmp : std) {
			if(tmp != null && tmp.getBranch().equals(searchBranch)) {
				System.out.println("--------------");
				tmp.printInfo();
				System.out.println("--------------");
			}
		}

	}
}

	/* - 학생 기본 정보: 학생이름, 생년월일, 나이, 전화번호
	 * - 학원 정보 : 학원이름, 지점
	 * - 학생 수강 정보 : 수강과목, 기간  // 멤버 변수 정리
	 * 
	 *  - 학생 기본 정보 출력기능
	 *  - 학생 학원 정보 출력 기능
	 *  - 학생 수강 정보 출력 기능
	 *  - 학생 수강 정보 추가 기능
	 *  - 생성자
	 * */
class GreenComputerStudent{
	private String name; // static ~~ 공유하는 거 아니니까 붙이지 않는다.
	private String birthday;
	private int age; 
	private String phoneNumber; // phone number int로 잘 안한다 0 맨 앞에 붙이면 8진수 되서;;
	final static private String company = "그린컴퓨터아트학원"; //수정이 안되니까 private 붙일 필요 없음.
	private String branch;
	private String []course;
	private String []period;
	private int courseCount;
	
	//학원에 왔지만 아직 등록을 안해서 정보만 기입된 상태. 기본 이름 같은 건 없기 때문에 생성자는 안만든다??
	public GreenComputerStudent(String name, String birthday, int age, String phoneNumber, String branch) {
		this.name = name;
		this.birthday = birthday;
		this.age = age;
		this.phoneNumber = phoneNumber;
		this.branch = branch;
		this.course = new String[10];
		this.period = new String[10];
	}
	
	//this() 는 생성자다. this. 의 생성자. 참조변수 초기값 null. 전화 받았을 떄 이름 밖에 모르는 경우
	public GreenComputerStudent(String name, String branch) {
		this(name, null, 0, null,branch);
	}
	
	//변수 이름 길어도 자동완성 하면 에러 없이 잘 쓸 수 있기 때문에 ctrl space를 잘 활용하자.
	public void printInfo() {
		System.out.println("이름 : " + name);
		System.out.println("번호 : " + phoneNumber);
		System.out.println("나이 : " + age);
		System.out.println("생일 : " + birthday);
	}
	
	//static을 붙이면 상수인 학원명은 괜찮지만 지점명은 달라질 수 있는 정보이기 때문에 안댐
	public void printCompany() {
		System.out.println("학원명 : " + company);
		System.out.println("지점명 : " + branch);
	}
	
	public void printCourse() {
		if(course == null || course.length == 0 || courseCount == 0 ) {
			System.out.println("수강 이력이 없습니다.");
			return; //else로 해도 되지만 return으로 했을 경우 깔끔하게 중괄호 없이 가능함.		
		}
		for(int i = 0; i<courseCount;i++) {
			System.out.println("과정 : " +course[i]);
			System.out.println("기간 : " +period[i]);
		}
	}
	
	public void insertCourse(String course, String period) {
		this.course[courseCount] = course;
		this.period[courseCount] = period;
		courseCount++;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String[] getCourse() {
		return course;
	}
	public void setCourse(String[] course) {
		this.course = course;
	}
	public String[] getPeriod() {
		return period;
	}
	public void setPeriod(String[] period) {
		this.period = period;
	}
	
}
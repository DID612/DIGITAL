package day11;

public class 예외처리4 {

	public static void main(String[] args) {
		char op = '?';
		try {
			switch(op) {
			case '+': case '-': case'*': case'/': case'%':
				System.out.println("는 산술연산자입니다.");
				break;
				default:
				//op가 산술 연산자가 아닌 경우 산술연순자가 아니라는 예외를 발생
//					throw new RuntimeException(op + 는 잘못된 산술연산자 입니다.); //귀찮은 경우 Exception만
					RuntimeException e = new RuntimeException();
							throw e;
			}
		}catch(Exception e) {
			System.out.println(op+"잘못된 산술연산자입니다.");
		}
		System.out.println("프로그램 종료"
				+ "");
		
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("프로그램 종료");
		
	}

}

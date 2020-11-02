package day11;

public class 예외처리3 {

	public static void main(String[] args) {
		/* 예외가 발생하면 발생한 시점부터 메소드가 종료
		 * try~catch문 : 예외가 발생했을 때, 프로그램이 중단되지 않고 이어서 처리할 수 있게 하는 방법
		 * try문에서 예외가 발생했을 때 발생한 예외에 맞는 클래스와 일치하는 catch문을 찾아간다.
		 * try{
		 * 	예외가 발생할 수 있는 실행문;
		 * }catch(예외클래스명1 객체){
		 * 	처리문;
		 * }
		 * 예외가 발생하지 않으면 catch문을 건너뛰고 예외가 발생한다면 catch문을 실행한다.
		 * */
		
		double res = 0;
		try {
			int []arr = new int [5];
			arr[5] = 10;
//			res = 1/0;
			//exception은 젤 밑에 있어야 한다. 에러들의 부모이기 때문에... 맨 밑으로 보내면 오류가 해결됨.
			//그리고 exception으로 예외처리 안해주면 try catch 밑에 코드들이 작동 안됨.
			}catch(ClassCastException e) {
				System.out.println("ClassCastException");
			}/*catch(NullPointerException e) {
				System.out.println("NullPointerException");
			}*/catch(IndexOutOfBoundsException e) {
				System.out.println("IndexOutOfBoundsException");
				e.printStackTrace();
				System.out.println(e.getMessage());
			}catch(ArithmeticException | NullPointerException e) {
				System.out.println("ArithmeticException 또는 ClassNotFoundException");
			}catch(Exception e) {
				System.out.println("Exception");
			}
		System.out.println("안녕하세요");
	}
}

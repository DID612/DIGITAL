package day11;

public class 예외처리5 {

	public static void main(String[] args){
		int num1 = 1, num2 =2;
		System.out.println(num1+"/"+num2+"="+div(num1,num2));
		num2=0;
		System.out.println(num1+"/"+num2+"="+div(num1,num2));
		try {
			System.out.println(div(num1,num2));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		  }
	}
	/*기능 : 두 정수 num1과 num2가 주어졌을 때 num1/num2의 결과를 알려주는메소드*/
	/*
	 * 매개변수 num1 num2
	 * 리턴타입 실수
	 * 메소드명 div
	 */
	public static double div(int num1, int num2) throws Exception {
		if(num2==0) {
			throw new Exception("0");
		}
		return (double)num1/num2;	
	} 
}


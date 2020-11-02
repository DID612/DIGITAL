package day11;

public class 예외처리6 {

	public static void main(String[] args) {
		int num1 = 5;
		int min = 1, max = 101;
		
		try {
			createRandomArray(num1);
			for(int i=0;i <createRandomArray(num1).length;i++) {
				System.out.println(createRandomArray(i));
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("예외 발생 :" +e.getMessage());
			System.out.println();
			//e.printStackTrace(); java.lang.Exception: 0으로 나눌 수 없습니다.
		  }
	}

	/*
	 * 기능 : 배열의 길이가 주어지면 주어진 배열의 길이만큼 배열을 생성하여 값을 랜덤으로 초기화 하여 배열을 변환시키는 메소드 단, 배열의
	 * 길이는 0보다 크거나 같다. 매개변수 : 주어지는 길이(int) 리턴타입 : int[] 메소드명 : createRandomArray
	 */
	public static int[] createRandomArray(int num1) throws IndexOutOfBoundsException {
		int[] arr = new int[num1];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == random()) {
				while (arr[i] == random()) {
					arr[i] = random();
				}
				i++;
			}
		}
		if (num1 < 0) {
			throw new Exception("0보다 길이가 짧은 배열입니다");
		}
	}

	public static int random(int min, int max) {
		return (max-min+1))Math.random()+min;
	}
}

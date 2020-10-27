package day7;

public class 스스로완벽로또만들기 {

	public static void main(String[] args) {
		int num1 = 1, num2 = 45;
		random(1, 45);

	
//	필요한 기능
//	로또 번호 출력
//	내 번호 출려
//	로또번호 내 번호 매칭
//	6개 맞을시 1등 당첨
	}

	//하나의 배열에 겹치지 않는 숫자를 넣는 방법
	//숫자 하나를 구하고 배열 첫번째 부터 끝까지 비교한 후에 겹치는게 없다면 집어넣는다.
	
	static int random(int num1, int num2) {
		int tmp;
		if(num2 < num1) {
			tmp = num2;
			num2 = num1;
			num1 = tmp;
		}
		return (int)((num2-num1+1)*Math.random()+num1);
	}
	
	static Lotto(int[] arr, int a) {
		for(int i = 0; i < arr.length; i++) {
			arr[i] = random(num1, num2);
		}
	}
	
	//랜덤한 숫자를 찍어내는 메소드를 만든 후에 이 메소드를 필요한 숫자 개수만큼 겹치지 않는 수가 나올때까지 반복시켜
	//6개의 숫자를 메소드를 이용해 구한 다음에 배열에 집어넣는다.

}

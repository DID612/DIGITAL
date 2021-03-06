package day14;

import java.util.Arrays;
import	java.util.Random;

public class Lotto2 {
	protected int[] numbers = new int[6];
	
	//1~45 사이의 정수를 생성하여 반환하는 메소드
	protected int random() {
		return new Random().nextInt(45)+1;
	}
	//1~45 사이의 중복되지 않은 번호 6개
	public void randomLotto(){
		init();
		int cnt = 0; //저장된 중복되지 않은 랜덤 수의 갯수
		while(cnt<6) {
			int r = random();
			if(!contain(r)) {
				numbers[cnt] = r;
				cnt++;
			}
		}
	}
	//로또 번호 배열에 num가 있는지 체크
	protected boolean contain(int num) throws RuntimeException {
		if(num < 0 || num > 45){
			throw new RuntimeException("숫자는 1~45이어야 합니다.");
		}
		//전체를 탐색해야 해서 향상된 for문 가능
		for(int tmp : numbers) {
			if(tmp ==num) {
				return true;
			}
		}
		return false;
	}
	
	protected void init() {
//		for(int i = 0; i<numbers.length;i++)
//			numbers[i] = 0;
//		numbers = new int[6]; 간단한 방법
		numbers = new int[6];
	}
	
	//로또 당첨 번호 확인을 위한 번호를 문자열로 반환
	
	@Override
	public String toString() {
		return Arrays.toString(numbers).replace("[","").replace("]", "").replace(",", "");
	}
	
	public int[] getNumbers() {
		return numbers;
	}
	public void insertNumber(int[] arr) throws RuntimeException{
		if(arr.length < numbers.length)
			throw new RuntimeException("저장하려는 배열의 숫자가 적습니다.");
//		for(int i=0;i<numbers.length;i++) {
//			numbers[i] = arr[i];
//		}
		System.arraycopy(arr, 0, numbers, 0, numbers.length);
	}
}

package day14;

public class Lotto내꺼 {
	//필요한 것 lotto 클래스
	//멤버변수 int[] 배열
	//멤버변수 min max
	//랜덤숫자를 배열에 각각 넣어주는 메소드
	//
	private static int size = 6;
	private static int min = 1;
	private static int max = 45;
	private int[] lottoNum = new int[size];
	
	public static int getSize() {
		return size;
	}

	public static void setSize(int size) {
		Lotto내꺼.size = size;
	}

	public static int getMin() {
		return min;
	}

	public static void setMin(int min) {
		Lotto내꺼.min = min;
	}

	public static int getMax() {
		return max;
	}

	public static void setMax(int max) {
		Lotto내꺼.max = max;
	}

	public int[] getLottoNum() {
		return lottoNum;
	}

	public void setLottoNum(int[] lottoNum) {
		this.lottoNum = lottoNum;
	}

	//랜덤숫자 생성
	public void makeNum() {
		int tmp;
		for(int i=0;i<lottoNum.length;i++) {
			tmp=(max-min+1)*(int)Math.random()+min;
			if(lottoNum[i] == tmp) {
				do {
					tmp=(max-min+1)*(int)Math.random()+min;
				}
				while(lottoNum[i]!=tmp);
			}
			lottoNum[i] = tmp;
		}
	}
	
	public Lotto내꺼(int[] lottoNum) {
		super();
		this.lottoNum = lottoNum;
	}

}

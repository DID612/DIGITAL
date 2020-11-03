package day12;

public class Math클래스1 {

	public static void main(String[] args) {
		/*round() : 소수점 첫째 자리에서 반올림해서 결과값을 정수로 반환하는 메소드*/
		double num = 123.45678;
		System.out.println(num+ "를 소수점 1번째 자리에서 반올림 :" + Math.round(num));
		System.out.println(num+ "를 소수점 3번째 자리에서 반올림 :" + round(num,2));
		/*ceil: 소수점 첫째 자리에서 올림
		 * */
		System.out.println(num+ "를 소수점 1번째 자리에서 반올림 :" + Math.ceil(num));
		/*floor: 내림*/
		System.out.println(num+ "를 소수점 1번째 자리에서 반올림 :" + Math.floor(num));
		/*rint : 가장 가까운 정수로 반환하는 메소드로, .5와 같이 딱 가운데 있는 경우
		 * 짝수 결과값으로 반환된다. */
		System.out.println(num+"에서 가장 가까운 정수 : "+Math.rint(num));
		num = 123.5;
				System.out.println(num+"에서 가장 가까운 정수 : "+Math.rint(num));
	}
	

	public static double round(double num, int count) {
		for(int i=1;i<=count;i++) {
			num *= 10;
		}
		//결과에서 round()
		long res = Math.round(num);
		for(int i=1;i<=count;i++) {
			res /= 10;
		}
		return num;
	}
}

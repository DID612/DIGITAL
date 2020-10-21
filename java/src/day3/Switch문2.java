package day3;

import java.util.Scanner;

public class Switch문2 {
	public static void main(String args[]) {
		/* 달을 입력받아 해당하는 달이 어떤 계절인지 출력하는 코드를
		 * switch문으로 작성하세요.
		 * 12~2: 겨울
		 * 3~5: 봄
		 * 6~8: 여름
		 * 9~11: 가을
		 */
		Scanner sc = new Scanner(System.in);
		int moon;
		String season;
		
		System.out.print("지금 몇월일까요: ");
		moon = sc.nextInt();

		if(moon > 12 || moon < 1) 
		{
			//System.out.println("없는 달입니다...");
			season = moon + "없는 달입니다...";
		}else if(moon == 12 || moon <=2) {
			season = "겨울";
		}else if(moon >= 3 || moon <=5) {
			season = "봄";
		}else if(moon >= 6 || moon <=9) {
			season = "여름";
		}else{
			season = "가을";
		}
		
		// 왜 season = moon + "없는 달입니다..." 가 됐는데 왜 밑에 것들이 제대로 나올까 
//		문자열이랑 정수랑 만나서 문자열이 된거면 왜 "0"일때 이건머야가 작동 안되는지
		
		switch(season) {
		case "겨울":
			System.out.println("지금은 겨울");
			break;
		case "봄":
			System.out.println("지금은 봄");
			break;
		case "여름":
			System.out.println("지금은 여름");
			break;
		case "가을" :
			System.out.println("지금은 가을");
		case "0없는 달입니다...":
			System.out.println("일케해야나옴 0없는달입니다.가 현재 season임");
		default:
			System.out.println("없는 달입니다...");
		}
		
		switch(moon) {
		case 3:		case 4:		case 5:
			System.out.println("지금은 봄");
			break;
		case 6:		case 7:		case 8:
			System.out.println("지금은 여름");
			break;
		case 9: 	case 10:	case 11:
			System.out.println("지금은 가을");
			break;
		case 12:	case 1:		case 2:
			System.out.println("지금은 겨울");
			break;
		default:
			System.out.println(moon+"월은 없는 달입니다.");
		}
	}

}

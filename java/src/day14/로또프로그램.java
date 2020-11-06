package day14;

import java.util.Scanner;

public class 로또프로그램 {

	public static void main(String[] args) {
	System.out.println();
		LottoProgram내꺼 lp = new LottoProgram내꺼();
		char menu = '0';
		Scanner scan = new Scanner(System.in);
		Lotto내꺼 lt = new Lotto내꺼();
		
		do {
			lp.viewMenu();
			menu = scan.next().charAt(0);
			switch(menu) {
			case '1': lp.winLotto(); break;
			case '2': lp.matchLotto(); break;
			case '3': lp.exWinLotto(); break;
			case '4': lp.autoLotto(); break;
			case '5': lp.pasLotto(); break;
			case '6': break;
			default: 
				lp.printAlert();
			}
		}while(menu != '6');
		lp.viewExit();
		scan.close();
	}

}

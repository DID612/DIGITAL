package day14;

import java.util.Scanner;

public class LottoProgram내꺼 implements Program {
	private Lotto내꺼[] lotto;
	private int lottoCount;
	
	
	@Override
	public void winLotto(Lotto내꺼 lotto) {
		System.out.println("-------------");
		System.out.println("이번 주 당첨 번호는");
		for(int i=0;i<lotto.getLottoNum().length;i++) {
			lotto.makeNum();
		}
		System.out.println("-------------");
	}

	@Override
	public void matchLotto(Lotto내꺼 lotto) {
		// TODO Auto-generated method stub
		System.out.println("-------------");
		System.out.println("당첨번호 맞춰보기");
		for(int i=0;i<lotto.getLottoNum().length;i++) {
			for(int j=0;j<lotto.getLottoNum().length;i++);
			lotto.getLottoNum();
		}
		System.out.println("-------------");
	}

	@Override
	public void exWinLotto(Lotto내꺼 lotto) {
		for(int i=0;i<lotto.getLottoNum().length;i++) {
			
		}

	}

	@Override
	public void autoLotto(Scanner scan) {
		// TODO Auto-generated method stub

	}

	@Override
	public void pasLotto(Scanner scan) {
		// TODO Auto-generated method stub

	}

	public void viewMenu() {
		System.out.println("------------------");
		System.out.println("#$%^@로또 사%3장님 30억%#!^.");
		System.out.println("------------------");
		System.out.print("1. 예상 당첨번호");
		System.out.print("2. 로또번호 확인");
		System.out.print("3. 역대당첨번호 확인");
		System.out.print("4. 로또자동번호발행");
		System.out.print("5. 로또수동번호발행");
		System.out.println("------------------");
	}
	
	public void printAlert() {

		System.out.println("------------------");
		System.out.println("잘못된 메뉴 선택!(1~6)");
		System.out.println("------------------");
	}

	public void viewExit() {
		System.out.println("------------------");
		System.out.println("운수 좋은 날");
		System.out.println("------------------");
	}


	public LottoProgram내꺼(Lotto내꺼[] lotto) {
		super();
		this.lotto = lotto;
	}

}

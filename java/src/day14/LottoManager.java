package day14;

import java.util.Scanner;

public class LottoManager {
	LottoE lotto[] = new LottoE[5];// 당첨 번호
	Lotto2 user = new Lotto2();//개인 로또 번호
	int lCount = 0; //현재 입력된 로또 당첨번호 갯수
	
	public void printMenu() {
		System.out.println("------메뉴------");
		System.out.println("1. 로또 번호 생성(수동)");
		System.out.println("2. 로또 번호 생성(자동)");
		System.out.println("3. 로또 당첨 번호 입력");
		System.out.println("4. 로또 당첨 확인");
		System.out.println("5. 로또 당첨 번호 확인(전체)");
		System.out.println("6. 종료");
		System.out.println("---------------");
		System.out.println("메뉴를 선택하세요 : ");
	}

	public void createLotto(Scanner scan) {
		System.out.println("로또 번호를 입력하세요.(중복되지 않게 6개 입력) : ");
		int[] tmp = new int[6];
		//이거 신기한게 한번에 123456 입력하면 tmp[i]가 횟수마다 찾아와서 가져가고 새로운 입력을 해줄 필요가 없다. 입력 버퍼에 다 잇는거당 2627계속 돌아가다 조건이 안맞으면 30으로 가겟당
		for(int i =0; i<tmp.length;i++) {
			tmp[i] = scan.nextInt();
		}
		//중복체크, 범위체크
		if(isDuplicated(tmp)) {
			printString("중복된 숫자가 있어서 생성이 취소됩니다.");
		}else {
			user.insertNumber(tmp);		
//			System.out.println("**********************");
//			System.out.println("로또번호 " + user);
//			System.out.println("**********************");
			printString("로또번호"+user);
//			printString(tmp);
		}
	}
	public void printString(String str) {
		System.out.println("**********************");
		System.out.println(str);
		System.out.println("**********************");
	}
	private boolean isDuplicated(int[] arr) {
		// 0 1 2 3 4 5
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i] == arr[j]) {
					return true;
				}
			}
		}
		return false;// 호출했던 isduplicated 가서 리턴값 돌려줌
	}

	public void createLottoAuto() {
		user.randomLotto();
		printString("로또 번호: "+user);
	}

	public void insertLotto(Scanner scan) {
		System.out.println("로또 번호를 입력하세요.(중복되지 않게 7개 입력,보너스 번호를 마지막에) : ");
		int[] tmp = new int[7];
		for(int i =0; i<tmp.length;i++) {
			tmp[i] = scan.nextInt();
		}
		//중복체크, 범위체크
		if(isDuplicated(tmp)) {
			printString("중복된 숫자가 있어서 생성이 취소됩니다.");
		}else {
			LottoE tmpLotto = new LottoE();
			tmpLotto.insertNumber(tmp); // 이값이 어딘가에 저장?
			lotto[lCount] = tmpLotto; 
			lCount++;
			printString("로또번호"+tmpLotto);	
		}
		
	}

	public void checkLotto() {
		if(user.contain(0)){
			printString("로또 번호를 입력하세요");
			return;
		}
		//당첨 로또 번호를 입력하지 않았을때
		if(lCount == 0) {
			printString("당첨 번호를 입력하세요");
			return;
		}
		int cnt = 0;
		//최신 당첨 번호
		LottoE tmp = lotto[lCount-1];
		for(int i=0; i<user.getNumbers().length; i++) {
//			if(user.contain(lotto[lCount-1].getNumbers()[i])){
//				
//			}
			//lotto[lCount-1].getNumbers()[i];최신 당첨번호 중 i+1번째 번호
			int num = lotto[lCount-1].getNumbers()[i];
			if(user.contain(num)) {
				cnt++;
			}
		}
		int rank = -1;
		//당첨 등수 계산
		switch(cnt) {
		case 6: rank =1; break;
		case 5: 
			if(user.contain(tmp.getBonus())) {
				rank = 2;
			}else {
				rank = 3;
			}
			//rank = user.contain(tmp.getBonus()) ? 2 : 3;
			break;
		case 4: rank =4; break;
		case 3: rank =5; break;
		}
		if(rank != -1)
			printString(rank+"등 당첨!!!:");
		else
			printString("꽝!!");
	}

	public void printLotto() {
		// 3 insert 로또 한것들이 printLotto()에 저장.
		// 배열로 저장하고 싶음
		// printString(i+"회차번호는"+배열);
		String str = "";
		for(int i =0;i<lCount;i++) {
			str += (i+1)+"회차 : " + lotto[i]+"\n";
			//+= 이어붙이는 기능
		}
		//마지작 로또 번호에 들어가는 엔터('\n')을 제거
			str.substring(0,str.length()-1);
			printString(str);
	}
		
}

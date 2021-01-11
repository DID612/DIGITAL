package review2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Test08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 정수 n을 입력 받고 입력받은 수만큼 단어와 뜻을
		 * 입력받아 저장하고 출력하는 코드를 작성하세요.*/
		Scanner sc = new Scanner(System.in);
		System.out.println("몇개의 단어를 입력하시겠습니까?");
		int num = sc.nextInt();
		HashMap<String,String> wordMap = new HashMap<String, String>();
		while(num > wordMap.size()) {
			System.out.println("단어와 뜻을 입력하세요.");
			wordMap.put(sc.next(), sc.next());
		}
		Iterator<String> it = wordMap.keySet().iterator();
		while(it.hasNext()) {
			String key = it.next();
			String value = wordMap.get(key);
			System.out.println("단어 : " +  key +", 뜻 : "+value);
		}
		String searchW, searchM;
		System.out.println("검색할 단어를 입력해주세요.");
		searchW = sc.next();
		System.out.println(searchW);
		while(it.hasNext()) {
			String key = it.next();
			String value = wordMap.get(key);
			if(key.equals(searchW)) {
				System.out.println("단어 : " +  key +", 뜻 : "+value);
			}
		}
		
		wordMap.clear();
		sc.close();
	}
	

}

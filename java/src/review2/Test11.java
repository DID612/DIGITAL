package review2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Test11 {
	static ArrayList<WordNote> list = new ArrayList<WordNote>();
	public static void main(String[] args) {
		/* 단어장 프로그램을 작성하세요
		 * 1. 단어 등록
		 * 2. 단어 검색
		 * 3. 단어 수정
		 * 4. 단어 출력
		 * 5. 종료.*/
		Scanner scan = new Scanner(System.in);
		int num; 
		do {
			wordBook();
			System.out.println("메뉴를 선택해주세요. (1~5)");
			num = scan.nextInt();
			
				switch(num){
		        case 1 : 
		        	System.out.println("단어와 뜻을 입력해주세요.");
		            regWord(scan.next(), scan.next()); 
		            break;
		        case 2 : 
		        	System.out.println("검색할 단어를 입력해주세요.");
		        	searchWord(scan.next());
		            break;  
		        case 3 :
		        	System.out.println("수정할 단어와 뜻을 입력해주세요.");
		        	recWord(scan.next(), scan.next());
		        case 4 :
		        	print();
		        case 5 : 
		        	System.out.println("단어장 종료");
		        	
		        default :
		        	System.out.println("잘못된 메뉴 선택입니다. (1~5)");
				}
			
			}
		while(num != 5);
	}
	
	private static void wordBook() {
		System.out.println("--------단어장--------");
		System.out.println("1. 단어 등록");
		System.out.println("2. 단어 검색");
		System.out.println("3. 단어 수정");
		System.out.println("4. 단어 출력");
		System.out.println("5. 종료");
		System.out.println("--------------------");
	}
	
	public static void regWord(String word, String mean) {
		list.add(new WordNote(word,mean));
	}
	public static void searchWord(String word) {
		for(WordNote tmp:list) {
			if(tmp.equals(word)) {
				System.out.println(tmp);
			}
		}
	}
	public static void recWord(String word, String mean) {
		for(WordNote tmp:list) {
			if(tmp.equals(word)) {
				System.out.println(tmp);
				tmp.setWord(word);
				tmp.setMean(mean);
				System.out.println("수정된 단어" + tmp);
			}
		}
	}
	public static void print() {
		for(WordNote tmp:list) {
			System.out.println(tmp);
		}
	}
}

class WordNote{
	private String word;
	private String mean;
	public String getWord() {
		return word;
	}
	public void setWord(String word) {
		this.word = word;
	}
	public String getMean() {
		return mean;
	}
	public void setMean(String mean) {
		this.mean = mean;
	}
	
	public WordNote(String word, String mean) {
		this.word = word;
		this.mean = mean;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((word == null) ? 0 : word.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (obj instanceof String) {
			return word.equals(obj);
		}
		if (getClass() != obj.getClass())
			return false;
		WordNote other = (WordNote) obj;
		if (word == null) {
			if (other.word != null)
				return false;
		} else if (!word.equals(other.word))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "[단어=" + word + ", 뜻=" + mean + "]";
	}
	
	
}
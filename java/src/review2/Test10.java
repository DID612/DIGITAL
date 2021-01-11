package review2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Test10 {

	public static void main(String[] args) {
		/* 정수 n을 입력 받고 입력받은 수만큼 단어와 뜻을
		 * 입력받아 저장하고 출력하는 코드를 작성하세요.*/

		Scanner scan = new Scanner(System.in);
		ArrayList<Word> list = new ArrayList<Word>();
		System.out.println("입력할 단어의 갯수 : ");
		int size= scan.nextInt();
		while(list.size()< size) {
			System.out.println("단어 :");
			String word = scan.next();
			System.out.println("의미 :");
			String mean = scan.next();
			list.add(new Word(word,mean));
		}
		Collections.sort(list);
		for(Word tmp : list) {
			System.out.println(tmp);
		}
		System.out.println("검색할 단어를 입력하세요: ");
		String search = scan.next();
		for(Word tmp : list) {
//			는 왜 안될까.
			if(tmp.getWord().equals(search)) {
				System.out.print("검색된 단어: ");
				System.out.println(tmp);
			}
		}
		scan.close();
	}
}

class Word implements Comparable{
	private String word, mean;
	
	public Word(String word, String mean) {
		this.word = word;
		this.mean = mean;
	}

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
	
	// Comparable 보충한 이유
	@Override
	public int compareTo(Object o) {
		Word word = (Word)o;
		return this.word.compareTo(word.word);
//		return -this.word.compareTo(word.word); 역순
	}

	@Override
	public String toString() {
		return "[단어=" + word + ", 뜻=" + mean + "]";
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
		if(obj instanceof String) {
			return word.equals(obj);
		}
		if (getClass() != obj.getClass())
			return false;
		Word other = (Word) obj;
		if (word == null) {
			if (other.word != null)
				return false;
		} else if (!word.equals(other.word))
			return false;
		return true;
	}

}
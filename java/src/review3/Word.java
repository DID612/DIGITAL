package review3;

// comparable 제네릭 인터페이스 여서 클래스 추가해줌.
class Word implements Comparable<Word>{
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
	public int compareTo(Word word) {
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

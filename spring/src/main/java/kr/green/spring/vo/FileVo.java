package kr.green.spring.vo;

public class FileVo {
	private int num;
	private int boardNum;
	private String oriFilename;
	private String fileName;
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public int getBoardNum() {
		return boardNum;
	}
	public void setBoardNum(int boardNum) {
		this.boardNum = boardNum;
	}
	public String getOriFilename() {
		return oriFilename;
	}
	public void setOriFilename(String oriFilename) {
		this.oriFilename = oriFilename;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	@Override
	public String toString() {
		return "FileVo [num=" + num + ", boardNum=" + boardNum + ", oriFilename=" + oriFilename + ", fileName="
				+ fileName + "]";
	}
	
	
}

package day12;

import java.util.Scanner;

public class String메소드2 {

	public static void main(String[] args) {
		/* 5개짜리 문자열 배열을 생성한 후, 5개의 파일명을 입력받는 코드를 작성하세요.
		 * String메소드.java
		 * 그림1.png
		 * dlalwl vkdlfemfdmf cnffur하는 코드
		 * */

		//5개 짜리 문자열 생성
		//일단 반복문
		String[] stringBale = new String[] {"java의 정석.txt","String메소드.java","java의 정석 앞표지.png","java의 정석 뒷표지.jpg","java의 정석.hwp"};
		String[] img = {"png", "jpg","bmp","gif"};

		System.out.println("----이미지 파일 리스트 ----");
		for(String tmpFileName:stringBale) {
			int index = tmpFileName.indexOf('.');
			// int index = tmpFileName.lastIndexOf('.')
			String suffix = null;
			if(index == -1) {
				continue;
			}
			suffix = tmpFileName.substring(index+1);
			if(cotains(img,suffix))
				System.out.println(tmpFileName);
				}
	}
		
		/*기능 : 배열과 찾을 문자열이 주어지면 배열에서 찾을 문자열이
		 * 있는지 없는지 확인하여 알려주는 메소드
		 * 매개변수 배열, 문자열
		 * 출력: 내가 대답할떄 예 or 노 boolean으로 하자...
		 * 
		 * */
		public static boolean cotains(String[] arr, String search) {
			if(arr == null || arr.length ==0)
				return false;
			if(search == null) {
				return false;
			}
			for(String tmp : arr) {
				if(search.equals(tmp)) {
					return true;
				}
			}
			return false;
		}
		
//		for(int i=0; i<stringBale.length; i++) {
//			System.out.println(i+1+"번째 파일명 입력 : ");
//		Scanner scan = new Scanner(System.in);
//			stringBale[i] = scan.next();
//			System.out.println(stringBale[i]);
//		}
//		
//		System.out.println("그림 파일을 출력!");
//		for(int i=0; i<stringBale.length; i++) {
//			for(int j=0;j<img.length; j++) {
//				if(stringBale[i].endsWith(img[j])) {
//					System.out.println(i+1+"번째 파일: "+stringBale[i]+"은 그림파일입니다.");
//				}
//			}
//		}
	
}

package day12;

import java.util.Scanner;

public class String메소드3 {

	public static void main(String[] args)  throws Exception {
		/* 5개의 파일명이 주어졌을때, 원하는 단어를 입력하면 입력한 단어가 있는
		 * 파일들이 출력되도록 코드를 작성하세요.*/
		
		/* 원하는 단어를 입력
		 * 입력한 단어를 배열에서 하나하나 찾는다
		 * 있다면 하나씩 알려줌
		 * */
		
		//String[] img = {"png", "jpg","bmp","gif"};
		Scanner sc = new Scanner(System.in);
		String[] arr = new String[] {"java의 정석.txt","String메소드.java","java의 정석 앞표지.png","java의 정석 뒷표지.jpg","java의 정석.hwp","java의 정석 광고모델.png"};
		System.out.println("찾으실 단어를 입력해주세요!");
		String fig = sc.next();
		String[] ide= new String[arr.length];
		
		for(int i=0;i<arr.length;i++) {
			if(imgSearch(arr[i],fig) == true) {
				ide[i]=arr[i];
			}
		}
		
		for(int i=0;i<arr.length;i++) {
			if(ide[i]==null) {
				
			}else{
				System.out.println(ide[i]);				
			}
		}
		
		if(ide[0]==null) {
			System.out.println("찾는 값이 없습니다.");
		}
		sc.close();
	}

	public static boolean imgSearch(String arr, String sc) {
		if(arr.contains(sc)) {
			return true;
		}
		return false;
	}
	
	//0부터 5까지. 0이 비어있으면 1로가서 2와 비교
	public static void arrange(String[] arr) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i] == null) {
				arr[i]=arr[i+1];
			}
			
		}
	}
}
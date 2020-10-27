package day7;

public class 메소드1새로 {

	public static void main(String[] args) {
		//isPrime 메소드를 이용하여 100이하의 소수를 출력하는 코드를 작성
		int primeStandardNum = 100;
		for(int i=0;i<=primeStandardNum;i++) {
			if(isPrime(i)) {
				System.out.print(i+ " ");
			}
		}	
		System.out.println();
		for(int i=0;i<=primeStandardNum;i++) {
			if(!isPrime(i)) {
				System.out.print(i+ " ");
			}
		}	
	}
	static boolean isPrime(int num) {
		int cnt =0 ;
		boolean result;
		 for(int i =1; i<=num;i++) {
			 if((num % i) == 0) {
				 cnt++;
			 }
		 }
		 
	   if(cnt == 2) {
	   	result = true;
	   }else{
	   	result = false;
	   }	 
	   return result;
	}

}


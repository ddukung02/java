package question04;

import java.util.Scanner;

public class ArrayTen {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in) ;
		
		int[] arr;
		arr = new int[10];
		int sum=0 ;
		int i;
		System.out.println("숫자를 입력하세요");
		for(i=0;i<arr.length;i++) {
			arr[i]=scanner.nextInt();
			sum+=arr[i];
			
		}
		System.out.println("합계는"+sum);
		
	}
}

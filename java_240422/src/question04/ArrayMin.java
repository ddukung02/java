package question04;

import java.util.Scanner;

public class ArrayMin {
	
	public static void main(String[] args) {
		
		arrayMin();
				
	}
	
	public static void arrayMin() {
		Scanner scanner = new Scanner(System.in);
		int arr[]=new int[7];
		int min=0;
		System.out.println("양수 7개를 입력하세요");
		for(int i=0;i<7;i++) {
			arr[i] = scanner.nextInt();
		}
		min = arr[0];
		for(int i=1;i<7;i++) {
			if(min>arr[i]) {
				min=arr[i];
			}
			
		}
		System.out.println("가장작은수는"+min);
				
	}
	
	public static void scan() {
		
	}
	
}

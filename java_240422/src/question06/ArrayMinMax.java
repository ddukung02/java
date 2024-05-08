package question06;

import java.util.Scanner;

public class ArrayMinMax {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		int[] a = new int[10];
		System.out.println("양수 10개를 입력하세요");
		for(int i=0;i<10;i++) {
			a[i] = scanner.nextInt();
		}
		
		int big = a[0]; int small=a[0];
		
		for(int i=0;i<10;i++) {
			if(a[i]<small) {
				small = a[i];
			}
			if(a[i]>big) {
				big = a[i];
			}
		}
		System.out.println(big);
		System.out.println(small);
	}
}

package question06;

import java.util.Scanner;

public class MultipleOfThree {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] a=new int[10];
		System.out.println("양의 정수 10개를 입력하세용~");
		for(int i=0;i<10;i++) {
			a[i]=scanner.nextInt();
		}
		
		for (int i = 0; i < a.length; i++) {
			if(a[i]%3==0) {
				System.out.println(a[i]+"는 3의 배수입니다");
			}
		}
		
		
		
		
	}
}

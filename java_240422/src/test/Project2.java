package test;

import java.util.Scanner;

public class Project2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("정수를 입력하시오");
		int a = scanner.nextInt();
		int i,b=0;
		for(i=0;a!=0;i++) {
			b=b+a;
			System.out.println("정수를 입력하시오");
			a=scanner.nextInt();
		}
		System.out.println("모든 입력한 정수의 합은"+b+"입니다");
		
		
		
		
	}
}
